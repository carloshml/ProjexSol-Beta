/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity
@Table(name= "discente")
public class Discente extends Voluntario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn( name="fk_curso", nullable = false)
    @OneToOne
    @Size(max = 40)
    
    private Curso curso;
    @OneToMany
    @Size(max = 40)
    private ArrayList<Disciplina> disciplinas;

  
    public Discente(int codigo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, Curso curso, ArrayList<AreaDeInteresses> areasDeInteresses, ArrayList<Disciplina> diciplinas) {
        super(codigo, nome, cpf, rg, login, senha, telefone, celular, email, endereco, areasDeInteresses);
        this.curso = curso;
        this.disciplinas = diciplinas;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
