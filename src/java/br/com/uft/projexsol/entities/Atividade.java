/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Date;
import javax.ejb.Timeout;
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
    @Size(max = 60)
    private int codigo;
    @Size(max = 60)
    private String nomeAtividae;
    @JoinColumn( name = "fk_beneficiarios", nullable = false)
    @OneToMany
    private List<Beneficiario> beneficiarios;
    @JoinColumn( name= "fk_endereco", nullable = false)
    @OneToOne
    private Endereco local;
    
    private String horario;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    public Atividade(int codigo, String nomeAtividae, List<Beneficiario> beneficiarios, Endereco local, String horario, Date dataInicio, Date dataFinal) {
        this.codigo = codigo;
        this.nomeAtividae = nomeAtividae;
        this.beneficiarios = beneficiarios;
        this.local = local;
        this.horario = horario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

}
