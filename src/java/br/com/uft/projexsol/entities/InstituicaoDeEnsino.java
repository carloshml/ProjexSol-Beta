/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.Size;

/**
 *
 * @author PedroLima
 */
@Entity
@Table (name = "instituicaoDeEnsino")
public class InstituicaoDeEnsino implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    private int codigo;
    @Size(max = 120)
    private String nome;
    @Size(max = 18)
    private String cnpj;
    @JoinColumn( name = "fk_endereco", nullable = false)
    @OneToOne
    private Endereco endereco;
    @Size(max = 60)
    private String email;
    @Size(max = 2)
    private String estado;
    @Size(max = 20)
    private String telefone;
    @OneToMany
    private List<Departamento> departamentos;
    
    public InstituicaoDeEnsino(Integer id, int codigo, String nome, String cnpj, Endereco endereco, String email, String estado, String telefone, List<Departamento> departamentos) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
        this.estado = estado;
        this.telefone = telefone;
        this.departamentos = departamentos;
    }
    
    public InstituicaoDeEnsino(){
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
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
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public List<Departamento> getDepartamentos() {
        return departamentos;
    }
    
    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
}
