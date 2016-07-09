/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
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
    @JoinColumn(  name= "fk_voluntario", nullable = false )
    @OneToOne
    private Voluntario gerenteProjeto;
    private double custoProjeto;
    @JoinColumn(  name= "fk_detalhes", nullable = false )
    @OneToOne
    private DetalhesProjeto detalhes;
    @Temporal(javax.persistence.TemporalType.DATE)
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
    @OneToMany
    private List<AreaDeInteresses> areasDeInteresses;
    @Column(name = "fomentoProjeto")
    private FomentoProjeto dadosFomento;
    @JoinColumn( name= "fk_acao", nullable = false)
    @OneToMany
    private List<Acao> acoes;
    private boolean autorizado;
    @JoinColumn( name= "fk_oportunidade", nullable = false)
    @OneToMany
    private List<Oportunidade> oportunidades;
    @OneToOne
    private ITS instituicaoTerceiroSetor;
    @OneToMany
    private List<Avaliacao> avaliacoesProjeto;

      public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
    
    public List<Avaliacao> getAvaliacoesProjeto() {
        return avaliacoesProjeto;
    }

    public void setAvaliacoesProjeto(List<Avaliacao> avaliacoesProjeto) {
        this.avaliacoesProjeto = avaliacoesProjeto;
    }

    public ITS getInstituicaoTerceiroSetor() {
        return instituicaoTerceiroSetor;
    }

    public void setInstituicaoTerceiroSetor(ITS instituicaoTerceiroSetor) {
        this.instituicaoTerceiroSetor = instituicaoTerceiroSetor;
    }

    public List<Oportunidade> getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(List<Oportunidade> oportunidades) {
        this.oportunidades = oportunidades;
    }

    public boolean autorizado() {
        return autorizado;
    }

    public void autorizar(boolean autorizado) {
        this.autorizado = autorizado;
    }

    public List<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(List<Acao> acoes) {
        this.acoes = acoes;
    }

    

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

    public List<AreaDeInteresses> getAreasDeInteresses() {
        return areasDeInteresses;
    }

    public void setAreasDeInteresses(List<AreaDeInteresses> areasDeInteresses) {
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
