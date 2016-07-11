/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Equipe ProjexSol
 */
@Entity
@Table(name = "acao")

public class Acao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;   
    @Column(name = "codigo")
    private int codigo;
    @Size(max = 120)
    @Column(name = "nome")
    private String nome;
    @NotNull
    @Column(name = "dataInicial")
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @NotNull
    @Column(name = "datafinal")
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    @Size(max = 200)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 200)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="ACAO_TEM_ATIVIDADES", joinColumns={ @JoinColumn(name="ACAO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="ATIVIDADES_ID", referencedColumnName="id")})
    private List<Atividade> atividades;
    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Acao(int codigo, String nome, Date dataInicial, Date dataFinal, String tipo, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipo = tipo;
        this.descricao = descricao;
        atividades = new ArrayList<>();
    }
        
    public Acao() {
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

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final Acao other = (Acao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Acao{" + "nome=" + nome + ", descricao=" + descricao + '}';
    }

}
