/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.controller;

import br.com.uft.projexsol.entities.Endereco;
import br.com.uft.projexsol.entities.Voluntario;
import javax.faces.bean.ManagedBean;
/**
 *
 * @author PedroLima
 */
@ManagedBean
public class VoluntarioCadController {

    private String nome;
    private int codigo;
    private String cpf;
    private String rg;
    private String login;
    private String senha;
    private String telefone;
    private String celular;
    private String email;
    private Endereco endereco;
    
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
//    public void cadastrarVoluntario(){
//        Voluntario voluntario = new Voluntario(codigo, nome, cpf, rg, login, senha, telefone, celular, email, endereco, null);
//        
//    }
//    
}
