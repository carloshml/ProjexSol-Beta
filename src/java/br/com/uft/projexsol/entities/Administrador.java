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

    public Administrador(Integer id) {
        super(id);
    }

    public Administrador(Boolean ativo, String nome,  String cpf, String rg, String login, String senha, String telefone, String celular, String email, Endereco endereco) {
        super(ativo, nome,  cpf, rg, login, senha, telefone, celular, email, endereco);
    }
    
    public Administrador() {
    }
}
