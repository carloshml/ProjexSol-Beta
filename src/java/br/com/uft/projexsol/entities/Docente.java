/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author aluno
 */
@Entity
public class Docente extends Voluntario implements Serializable{

    @JoinColumn( name= "fk_curso", nullable = false)
    @OneToOne
    private Curso curso;
    @JoinColumn(name= "fk_departamento", nullable = false)    
    @OneToOne
    private Departamento departamento;

    public Docente(Curso curso, Departamento departamento, Integer id, String nome, int codigo, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        super(id, nome, codigo, cpf, rg, login, senha, telefone, celular, email, endereco, areasDeInteresses);
        this.curso = curso;
        this.departamento = departamento;
    }

    public Docente(Curso curso, Departamento departamento) {
        this.curso = curso;
        this.departamento = departamento;
    }

    public Docente() {
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
