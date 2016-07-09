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
 * @author aluno
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
    private String nome;
    @Size(max = 60)
    private int codigo;
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
    @JoinColumn(  name= "fk_endereco", nullable = false )
    @OneToOne
    private Endereco endereco;
    @JoinColumn(  name= "fk_areasDeInteresse", nullable = false )
    @OneToMany
    private List<AreaDeInteresses> areasDeInteresses;

    public Voluntario(int codigo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setRg(rg);
        setLogin(login);
        setSenha(senha);
        setTelefone(telefone);
        setCelular(celular);
        setEmail(email);
        setEndereco(endereco);
        this.areasDeInteresses = areasDeInteresses;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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

}
