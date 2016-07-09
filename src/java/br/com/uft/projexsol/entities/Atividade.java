/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Timeout;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
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
    @Size(max = 60)
    @OneToMany(mappedBy = "Atividade")
    private ArrayList<Beneficiario> beneficiarios;
    @Size(max = 100)
    private Endereco local;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp horario;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dataInicio;
    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    public Atividade(int codigo, String nomeAtividae, ArrayList<Beneficiario> beneficiarios, Endereco local, Timestamp horario, Date dataInicio, Date dataFinal) {
        this.codigo = codigo;
        this.nomeAtividae = nomeAtividae;
        this.beneficiarios = beneficiarios;
        this.local = local;
        this.horario = horario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
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

    public ArrayList<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }

    public Endereco getLocal() {
        return local;
    }

    public void setLocal(Endereco local) {
        this.local = local;
    }

    public Timestamp getHorario() {
        return horario;
    }

    public void setHorario(Timestamp horario) {
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
