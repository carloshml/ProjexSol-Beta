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
 * @author PedroLima
 */

@Entity
@Table (name = "projeto")
public class Projeto implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;  
    private int codigo;
    private double custoProjeto;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCriacao;
    @Size(max = 120)
    private String linhaProgramatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataInicial")
    @Temporal(TemporalType.DATE)
    private Date dataInicial;
    @Basic(optional = false)
    @Column(name = "dataFinal")
    @Temporal(TemporalType.DATE)
    private Date dataFinal;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="DETALHESPROJETO_ID", nullable=true)
    private DetalhesProjeto detalhes;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="PROJETO_TEM_AREASDEINTERESSES", joinColumns={ @JoinColumn(name="PROJETO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="AREASDEINTERESSES_ID", referencedColumnName="id")})
    private List<AreaDeInteresses> areasDeInteresses;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="GERENTEPROJETO_ID", nullable=true)
    private Voluntario gerenteProjeto;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="FOMENTOPROJETO_ID", nullable=true)
    private FomentoProjeto dadosFomento;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="PROJETO_TEM_ACOES", joinColumns={ @JoinColumn(name="PROJETO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="ACOES_ID", referencedColumnName="id")})
    private List<Acao> acoes;
    private boolean autorizado;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="PROJETO_TEM_OPORTUNIDADES", joinColumns={ @JoinColumn(name="PROJETO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="OPORTUNIDADES_ID", referencedColumnName="id")})
    private List<Oportunidade> oportunidades;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="INTITUICAOTERCEITOSETOR_ID", nullable=true)
    private ITS instituicaoTerceiroSetor;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="PROJETO_TEM_AvALIACOES", joinColumns={ @JoinColumn(name="PROJETO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="AVALIACOES_ID", referencedColumnName="id")})
    private List<Avaliacao> avaliacoesProjeto;

    public Projeto(Integer id, int codigo, Voluntario gerenteProjeto, double custoProjeto, DetalhesProjeto detalhes, Date dataCriacao, String linhaProgramatica, String areaDirex, String linhaDirex, String numOrdemDirex, String numRegistroDirex, Date dataInicial, Date dataFinal, List<AreaDeInteresses> areasDeInteresses, FomentoProjeto dadosFomento, List<Acao> acoes, boolean autorizado, List<Oportunidade> oportunidades, ITS instituicaoTerceiroSetor, List<Avaliacao> avaliacoesProjeto) {
        this.id = id;
        this.codigo = codigo;
        this.gerenteProjeto = gerenteProjeto;
        this.custoProjeto = custoProjeto;
        this.detalhes = detalhes;
        this.dataCriacao = dataCriacao;
        this.linhaProgramatica = linhaProgramatica;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.areasDeInteresses = areasDeInteresses;
        this.dadosFomento = dadosFomento;
        this.acoes = acoes;
        this.autorizado = autorizado;
        this.oportunidades = oportunidades;
        this.instituicaoTerceiroSetor = instituicaoTerceiroSetor;
        this.avaliacoesProjeto = avaliacoesProjeto;
    }
    public Projeto(){
        
    }

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Projeto other = (Projeto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projeto{" + "gerenteProjeto=" + gerenteProjeto.getNome() + '}';
    }
    
}
