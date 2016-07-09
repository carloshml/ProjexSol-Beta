/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
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
 * @author PedroLima
 */

@Entity
@Table (name = "projeto")
public class Projeto implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private int codigo;
    private Voluntario gerenteProjeto;
    private double custoProjeto;
    private DetalhesProjeto detalhes;
    private Date dataCriacao;
    @Size(max = 120)
    private String linhaProgramatica;
    @Size(max = 120)
    private String areaDirex;
    @Size(max = 120)
    private String linhaDirex;
    @Size(max = 120)
    private String numOrdemDirex;
    @Size(max = 120)
    private String numRegistroDirex;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataInicial")
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Basic(optional = false)
    @Column(name = "dataFinal")
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    @JoinColumn(name= "fk_areaDeInteresse")
    @OneToOne(mappedBy = "voluntario")
    private ArrayList<AreaDeInteresses> areasDeInteresses;
    @Column(name = "fomentoProjeto")
    private FomentoProjeto dadosFomento;

    private boolean autorizado;
    @OneToMany
    private ArrayList<Oportunidade> oportunidades;
    @OneToOne
    private ITS instituicaoTerceiroSetor;
    @OneToMany
    private ArrayList<Avaliacao> avaliacoesProjeto;

    public ArrayList<Avaliacao> getAvaliacoesProjeto() {
        return avaliacoesProjeto;
    }

    public void setAvaliacoesProjeto(ArrayList<Avaliacao> avaliacoesProjeto) {
        this.avaliacoesProjeto = avaliacoesProjeto;
    }

    public ITS getInstituicaoTerceiroSetor() {
        return instituicaoTerceiroSetor;
    }

    public void setInstituicaoTerceiroSetor(ITS instituicaoTerceiroSetor) {
        this.instituicaoTerceiroSetor = instituicaoTerceiroSetor;
    }

    public ArrayList<Oportunidade> getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(ArrayList<Oportunidade> oportunidades) {
        this.oportunidades = oportunidades;
    }

    public boolean autorizado() {
        return autorizado;
    }

    public void autorizar(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public ArrayList<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(ArrayList<Acao> acoes) {
        this.acoes = acoes;
    }

    private ArrayList<Acao> acoes;

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getLinhaProgramatica() {
        return linhaProgramatica;
    }

    public void setLinhaProgramatica(String linhaProgramatica) {
        this.linhaProgramatica = linhaProgramatica;
    }

    public String getAreaDirex() {
        return areaDirex;
    }

    public void setAreaDirex(String areaDirex) {
        this.areaDirex = areaDirex;
    }

    public String getLinhaDirex() {
        return linhaDirex;
    }

    public void setLinhaDirex(String linhaDirex) {
        this.linhaDirex = linhaDirex;
    }

    public String getNumOrdemDirex() {
        return numOrdemDirex;
    }

    public void setNumOrdemDirex(String numOrdemDirex) {
        this.numOrdemDirex = numOrdemDirex;
    }

    public String getNumRegistroDirex() {
        return numRegistroDirex;
    }

    public void setNumRegistroDirex(String numRegistroDirex) {
        this.numRegistroDirex = numRegistroDirex;
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

    public ArrayList<AreaDeInteresses> getAreasDeInteresses() {
        return areasDeInteresses;
    }

    public void setAreasDeInteresses(ArrayList<AreaDeInteresses> areasDeInteresses) {
        this.areasDeInteresses = areasDeInteresses;
    }

    public FomentoProjeto getDadosFomento() {
        return dadosFomento;
    }

    public void setDadosFomento(FomentoProjeto dadosFomento) {
        this.dadosFomento = dadosFomento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voluntario getGerenteProjeto() {
        return gerenteProjeto;
    }

    public void setGerenteProjeto(Voluntario gerenteProjeto) {
        this.gerenteProjeto = gerenteProjeto;
    }

    public double getCustoProjeto() {
        return custoProjeto;
    }

    public void setCustoProjeto(double custoProjeto) {
        this.custoProjeto = custoProjeto;
    }

    public DetalhesProjeto getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(DetalhesProjeto detalhes) {
        this.detalhes = detalhes;
    }

}
