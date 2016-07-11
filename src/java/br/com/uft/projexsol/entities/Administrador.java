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
 * @author Equipe ProjexSol
 */
@Entity
public class Administrador  extends Voluntario implements Serializable{

    public Administrador(Curso curso, List<Disciplina> disciplinas, Integer id, String ativo, String nome, String codigo, String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco, List<AreaDeInteresses> areasDeInteresses) {
        super(id, ativo, nome, codigo, cpf, rg, login, senha, telefone, celular, email, endereco, areasDeInteresses);
    }

    public Administrador() {
    }
      
  
    
}
