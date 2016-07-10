/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity
@Table (name = "disciplina")
public class Disciplina implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    private int codigo;
    @Size(max = 60)
    private String nome;
    @JoinColumn( name= "fk_curso", nullable = false )
    @OneToOne
    private Curso curso;
    @JoinColumn( name= "fk_docente", nullable = false )
    @OneToOne
    private Docente docente;
    
    public Disciplina(Integer id, int codigo, String nome, Curso curso, Docente docente) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.docente = docente;
    }
    public Disciplina(){
    }
    
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public Docente getDocente() {
        return docente;
    }
    
    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
