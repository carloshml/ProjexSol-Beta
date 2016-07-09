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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity 
@Table (name= "oprtunidade")
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
    @Size(max = 120)
    private AreaDeInteresses areaDeInteresses;
    @OneToMany
    private final ArrayList<Voluntario> voluntarios;

    public Oportunidade(int codigo, String nome, String descricao, AreaDeInteresses areaDeInteresses) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.areaDeInteresses = areaDeInteresses;
        voluntarios = new ArrayList<>();

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

    public AreaDeInteresses getAreaDeInteresses() {
        return areaDeInteresses;
    }

    public void setAreaDeInteresses(AreaDeInteresses areaDeInteresses) {
        this.areaDeInteresses = areaDeInteresses;
    }

}
