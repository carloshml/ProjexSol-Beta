/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @NotNull
    private int codigo;
    @Size(max = 120)
    private String nome;
    @Size(max = 120)
    private String descricao;
    @JoinColumn( name= "fk_areaDeInteresses", nullable = false)
    @OneToMany
    private List< AreaDeInteresses > areaDeInteresses;
    @JoinColumn( name= "fk_voluntarios", nullable = false)
    @OneToMany
    private List<Voluntario> voluntarios;
    
    public Oportunidade(Integer id, int codigo, String nome, String descricao, List<AreaDeInteresses> areaDeInteresses, List<Voluntario> voluntarios) {
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
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
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
    
}
