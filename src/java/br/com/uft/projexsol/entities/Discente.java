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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author PedroLima
 */
@Entity
public class Discente extends Voluntario implements Serializable {

    @JoinColumn( name="fk_curso", nullable = false)
    @OneToOne    
    private Curso curso;
    @JoinColumn( name="fk_disciplinas", nullable = false)
    @OneToMany
    private List<Disciplina> disciplinas;

    public Discente(Curso curso, List<Disciplina> disciplinas, Integer id, String nome, int codigo, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        super(id, nome, codigo, cpf, rg, login, senha, telefone, celular, email, endereco, areasDeInteresses);
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    public Discente(Curso curso, List<Disciplina> disciplinas) {
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

    public Discente() {
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
