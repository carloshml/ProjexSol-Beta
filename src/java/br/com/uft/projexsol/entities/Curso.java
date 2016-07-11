/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author aluno
 */
@Entity
@Table(name= "curso")
public class Curso implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    private int codigo;
    @Size(max = 60)
    private String nome;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="DEPARTAMENTO_ID", nullable=true)
    private Departamento departamento;
    
    public Curso(Integer id, int codigo, String nome) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
    }
    public Curso(){
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
    
    public Departamento getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + this.nome + '}';
    }
    
}
