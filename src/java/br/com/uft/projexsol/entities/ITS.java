/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.Size;

/**
 *
 * @author Equipe ProjexSol
 */
@Entity
@Table (name = "its")
public class ITS implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 120)
    private String nome;
    @Size(max = 18)
    private String cnpj;
    @Size(max = 20)
    private String tipoInstituicao;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="ENDERECO_ID", nullable=true)
    private Endereco endereco;
    @Size(max = 60)
    private String email;
    @Size(max = 120)
    private String diretor;
    @Size(max = 60)
    private String funcao;
    @Size(max = 60)
    private String telefone;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="ITS_TEM_DEPARTAMENTOS", joinColumns={ @JoinColumn(name="ITS_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="AREASDEINTEERESSE_ID", referencedColumnName="id")})
    private List<AreaDeInteresses> areasDeInteresses;

    public ITS(Integer id) {
        this.id = id;
    }
    
    public ITS(Integer id, String codigo, String nome, String cnpj, String tipoInstituicao, Endereco endereco, String email, String diretor, String funcao, String telefone, List<AreaDeInteresses> areasDeInteresses) {
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoInstituicao = tipoInstituicao;
        this.endereco = endereco;
        this.email = email;
        this.diretor = diretor;
        this.funcao = funcao;
        this.telefone = telefone;
        this.areasDeInteresses = areasDeInteresses;
    }
    
    public ITS(){
        
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
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getTipoInstituicao() {
        return tipoInstituicao;
    }
    
    public void setTipoInstituicao(String tipoInstituicao) {
        this.tipoInstituicao = tipoInstituicao;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDiretor() {
        return diretor;
    }
    
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    public String getFuncao() {
        return funcao;
    }
    
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public List<AreaDeInteresses> getAreasDeInteresses() {
        return areasDeInteresses;
    }
    
    public void setAreasDeInteresses(List<AreaDeInteresses> areasDeInteresses) {
        this.areasDeInteresses = areasDeInteresses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final ITS other = (ITS) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ITS{" + "nome=" + this.nome + '}';
    }
    
}
