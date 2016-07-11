/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Carlos Lima
 */
@Entity
public class VoluntarioEnsino extends Voluntario implements Serializable {
    
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="CURSO_ID", nullable=true)
    private Curso curso;
    
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="DEPARTAMENTO_ID", nullable=true)
    private Departamento departamento;
    
    public VoluntarioEnsino(Curso curso, Departamento departamento, Integer id, String ativo, String nome, String codigo, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        super(id, ativo, nome, codigo, cpf, rg, login, senha, telefone, celular, email, endereco, areasDeInteresses);
        this.curso = curso;
        this.departamento = departamento;
    }
    public VoluntarioEnsino(){
    }
    
    public VoluntarioEnsino(Curso curso) {
        this.curso = curso;
    }    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Departamento getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
}
