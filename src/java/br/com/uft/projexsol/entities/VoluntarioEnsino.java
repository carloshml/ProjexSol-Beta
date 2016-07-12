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
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
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
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="VOLUNTARIO_TEM_AREASDEINTERESSE", joinColumns={ @JoinColumn(name="VOLUNTARIO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="AREASDEINTERESSES_ID", referencedColumnName="id")})
    private List<AreaDeInteresses> areasDeInteresses;

    public VoluntarioEnsino(Curso curso, Departamento departamento, List<AreaDeInteresses> areasDeInteresses, Integer id) {
        super(id);
        this.curso = curso;
        this.departamento = departamento;
        this.areasDeInteresses = areasDeInteresses;
    }

    public VoluntarioEnsino(Curso curso, Departamento departamento, List<AreaDeInteresses> areasDeInteresses, Boolean ativo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco) {
        super(ativo, nome, cpf, rg, login, senha, telefone, celular, email, endereco);
        this.curso = curso;
        this.departamento = departamento;
        this.areasDeInteresses = areasDeInteresses;
    }

    public VoluntarioEnsino(Curso curso, Departamento departamento, List<AreaDeInteresses> areasDeInteresses) {
        this.curso = curso;
        this.departamento = departamento;
        this.areasDeInteresses = areasDeInteresses;
    }

    public VoluntarioEnsino(){
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

    public List<AreaDeInteresses> getAreasDeInteresses() {
        return areasDeInteresses;
    }

    public void setAreasDeInteresses(List<AreaDeInteresses> areasDeInteresses) {
        this.areasDeInteresses = areasDeInteresses;
    }
    
    
}
