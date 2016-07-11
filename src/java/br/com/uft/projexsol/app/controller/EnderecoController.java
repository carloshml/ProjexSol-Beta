/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.controller;

import br.com.uft.projexsol.app.DAO.EnderecoDAO;
import br.com.uft.projexsol.app.DAO.VoluntarioDAO;
import br.com.uft.projexsol.entities.Endereco;
import javax.annotation.ManagedBean;

/**
 *
 * @author PedroLima
 */

@ManagedBean
public class EnderecoController {
    private int codigo;
    private String logradouro;
    private String bairro;
    private String uf;
    private String cidade;
    private String cep;
    private String numero;
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
//    public Endereco cadastrarEndereco(){
//        Endereco endereco = new Endereco(codigo, logradouro, numero, bairro, cidade, uf, cep);
//        EnderecoDAO.insertEndereco(endereco);
//        return endereco;
//    }

}
