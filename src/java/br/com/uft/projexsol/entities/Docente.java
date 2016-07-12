/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author aluno
 */
@Entity
public class Docente extends VoluntarioEnsino implements Serializable{

    private String qualificacao;
    private String cargaHoraria;

    public Docente(String qualificacao, String cargaHoraria, Curso curso, Departamento departamento, List<AreaDeInteresses> areasDeInteresses, Integer id) {
        super(curso, departamento, areasDeInteresses, id);
        this.qualificacao = qualificacao;
        this.cargaHoraria = cargaHoraria;
    }

    public Docente(String qualificacao, String cargaHoraria, Curso curso, Departamento departamento, List<AreaDeInteresses> areasDeInteresses, Boolean ativo, String nome, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco) {
        super(curso, departamento, areasDeInteresses, ativo, nome, cpf, rg, login, senha, telefone, celular, email, endereco);
        this.qualificacao = qualificacao;
        this.cargaHoraria = cargaHoraria;
    }

    public Docente(String qualificacao, String cargaHoraria) {
        this.qualificacao = qualificacao;
        this.cargaHoraria = cargaHoraria;
    }
     public Docente(){}


    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    
}
