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
 * @author Carlos Lima
 */
@Entity
@Table (name= "voluntario")
public class Voluntario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column
    private String ativo;
    @Column
    private String nome;
    @Column(name = "codigo")
    private String codigo;
    @Column
    private String cpf;
    @Column
    private String rg;
    @Column
    private String login;
    @Column
    private String senha;
    @Column
    private String telefone;
    @Column
    private String celular;
    @Column
    private String email;
    @OneToOne(cascade = CascadeType.ALL , optional = true , fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name="ENDERECO_ID", nullable=true)
    private Endereco endereco;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="VOLUNTARIO_TEM_AREASDEINTERESSE", joinColumns={ @JoinColumn(name="VOLUNTARIO_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="AREASDEINTERESSES_ID", referencedColumnName="id")})
    private List<AreaDeInteresses> areasDeInteresses;

    public Voluntario(Integer id, String ativo, String nome, String codigo, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        this.id = id;
        this.ativo = ativo;
        this.nome = nome;
        this.codigo = codigo;
        this.cpf = cpf;
        this.rg = rg;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.endereco = endereco;
        this.areasDeInteresses = areasDeInteresses;
    }
    
    public Voluntario(){
    }
    
    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getRg() {
        return rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getLogin() {
        return login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Voluntario other = (Voluntario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Voluntario{" + "nome=" + this.nome + '}';
    }
    
}
