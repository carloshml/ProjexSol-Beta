/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * author Equipe ProjexSol
 */
@Entity
@Table(name= "atividade")
public class Atividade implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 60)
    private String nomeAtividae;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="ATIVIDADE_TEM_BENEFICIARIOS", joinColumns={ @JoinColumn(name="ATIVIDADE_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="BENEFICIARIOS_ID", referencedColumnName="id")})
    private List<Beneficiario> beneficiarios;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="ENDERECO_ID", nullable=true)
    private Endereco local;
    
    private String horario;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    public Atividade(Integer id) {
        this.id = id;
    }
    
    public Atividade(Integer id, String codigo, String nomeAtividae, List<Beneficiario> beneficiarios, Endereco local, String horario, Date dataInicio, Date dataFinal) {
        this.codigo = codigo;
        this.nomeAtividae = nomeAtividae;
        this.beneficiarios = beneficiarios;
        this.local = local;
        this.horario = horario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }
    public Atividade(){
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNomeAtividae() {
        return nomeAtividae;
    }
    
    public void setNomeAtividae(String nomeAtividae) {
        this.nomeAtividae = nomeAtividae;
    }
    
    public List<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }
    
    public void setBeneficiarios(List<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }
    
    public Endereco getLocal() {
        return local;
    }
    
    public void setLocal(Endereco local) {
        this.local = local;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public Date getDataInicio() {
        return dataInicio;
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public Date getDataFinal() {
        return dataFinal;
    }
    
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Atividade other = (Atividade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atividade{" + "nomeAtividae=" + nomeAtividae + '}';
    }
    
}
