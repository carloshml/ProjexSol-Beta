/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity
@Table ( name= "fomentoProjeto")
public class FomentoProjeto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    private String descricao;
    @Size(max = 60)
    private String origens;

    public FomentoProjeto(Integer id) {
        this.id = id;
    }
    
    public FomentoProjeto(Integer id, String descricao, String origens) {
        this.descricao = descricao;
        this.origens = origens;
    }
    
    public FomentoProjeto(){
        
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getOrigens() {
        return origens;
    }
    
    public void setOrigens(String origens) {
        this.origens = origens;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final FomentoProjeto other = (FomentoProjeto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FomentoProjeto{" + "descricao=" + this.descricao + '}';
    }
    
}
