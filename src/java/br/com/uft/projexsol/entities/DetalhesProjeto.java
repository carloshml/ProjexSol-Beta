/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity
@Table(name= "detalheProjeto")
public class DetalhesProjeto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 60)
    private int codigo;
    @Size(max = 600)
    private String justificativa;
    @Size(max = 600)
    private String objetivos;
    @Size(max = 600)
    private String metas;
    @Size(max = 600)
    private String metodologia;
    @Size(max = 600)
    private String sistemaDeAvaliacao;
    @Size(max = 600)
    private String bibliografiaBasica;
    @Size(max = 600)
    private String convenio;
    
    public DetalhesProjeto(Integer id, int codigo, String justificativa, String objetivos, String metas, String metodologia, String sistemaDeAvaliacao, String bibliografiaBasica, String convenio) {
        this.id = id;
        this.codigo = codigo;
        this.justificativa = justificativa;
        this.objetivos = objetivos;
        this.metas = metas;
        this.metodologia = metodologia;
        this.sistemaDeAvaliacao = sistemaDeAvaliacao;
        this.bibliografiaBasica = bibliografiaBasica;
        this.convenio = convenio;
    }
    public DetalhesProjeto(){
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
    
    public String getJustificativa() {
        return justificativa;
    }
    
    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
    
    public String getObjetivos() {
        return objetivos;
    }
    
    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }
    
    public String getMetas() {
        return metas;
    }
    
    public void setMetas(String metas) {
        this.metas = metas;
    }
    
    public String getMetodologia() {
        return metodologia;
    }
    
    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
    
    public String getSistemaDeAvaliacao() {
        return sistemaDeAvaliacao;
    }
    
    public void setSistemaDeAvaliacao(String sistemaDeAvaliacao) {
        this.sistemaDeAvaliacao = sistemaDeAvaliacao;
    }
    
    public String getBibliografiaBasica() {
        return bibliografiaBasica;
    }
    
    public void setBibliografiaBasica(String bibliografiaBasica) {
        this.bibliografiaBasica = bibliografiaBasica;
    }
    
    public String getConvenio() {
        return convenio;
    }
    
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final DetalhesProjeto other = (DetalhesProjeto) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalhesProjeto{" + "justificativa=" + justificativa + ", objetivos=" + objetivos + ", metas=" + metas + ", metodologia=" + metodologia + ", sistemaDeAvaliacao=" + sistemaDeAvaliacao + ", bibliografiaBasica=" + bibliografiaBasica + ", convenio=" + convenio + '}';
    }
    
}
