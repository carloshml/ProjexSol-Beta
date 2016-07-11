/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 *
 * @author Pedro Lima
 */
@Entity
public class Discente extends VoluntarioEnsino implements Serializable {

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinTable(name="DISCENTE_TEM_DISCIPLINAS", joinColumns={ @JoinColumn(name="DISCENTE_ID", referencedColumnName="id")}, inverseJoinColumns={@JoinColumn(name="DISCIPLINAS_ID", referencedColumnName="id")})
    private List<Disciplina> disciplinas;

    private String matricula;

    public Discente(List<Disciplina> disciplinas, String matricula, Curso curso, Departamento departamento, Integer id, String ativo, String nome, int codigo, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        super(curso, departamento, id, ativo, nome, codigo, cpf, rg, login, senha, telefone, celular, email, endereco, areasDeInteresses);
        this.disciplinas = disciplinas;
        this.matricula = matricula;
    }

    public Discente() {
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

}
