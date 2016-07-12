/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity
@Table (name= "oportunidade")
public class Oportunidade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 120)
    private String nome;
    @Size(max = 120)
    private String descricao;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="OPORTUNIDADES_TEM_AREASDEINTERESSE", joinColumns={ @JoinColumn(name="OPORTUNIDADE_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="AREASDEINTERESSES_ID", referencedColumnName="id")})
    private List< AreaDeInteresses > areaDeInteresses;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="OPORTUNIDADES_TEM_VOLUNTARIOS", joinColumns={ @JoinColumn(name="OPORTUNIDADE_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="VOLUNTATIOS_ID", referencedColumnName="id")})
    private List<Voluntario> voluntarios;
    
    public Oportunidade(Integer id, String codigo, String nome, String descricao, List<AreaDeInteresses> areaDeInteresses, List<Voluntario> voluntarios) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.areaDeInteresses = areaDeInteresses;
        this.voluntarios = voluntarios;
    }
    public Oportunidade(){
    }
    
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public void addVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List< AreaDeInteresses > getAreaDeInteresses() {
        return areaDeInteresses;
    }
    
    public void setAreaDeInteresses(List< AreaDeInteresses >  areaDeInteresses ) {
        this.areaDeInteresses = areaDeInteresses;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Oportunidade other = (Oportunidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oportunidade{" + "descricao=" + this.descricao + '}';
    }
    
}
