/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import br.com.uft.projexsol.entities.Voluntario;
import br.com.uft.projexsol.app.DAO.VoluntarioDAO ;
import br.com.uft.projexsol.app.DAO.VoluntarioDAOImp ;
/**
 *
 * @author Carlos Lima
 */



public class teste {
	
	public static void main(String[] args) {
		
		VoluntarioDAOImp voluntarioDAO = new VoluntarioDAOImp();
		Voluntario voluntario = new Voluntario();		
	        voluntario.setCelular("celular");
                voluntario.setCodigo(0);
                voluntario.setCpf("cpf");
		voluntario.setEmail("email");
                voluntario.setLogin("login");
		voluntario.setNome("nome");
                voluntario.setRg("rg");
		voluntario.setSenha("senha");
		voluntario.setTelefone("telefone");

		
		if(voluntarioDAO.insereVoluntario(voluntario)) {
			System.out.println("Voluntario Cadastrado!");
		} else {
			System.out.println("Cadastro Falhou!");
		}
		
		List<Voluntario> voluntarios = voluntarioDAO.procurarTodosVoluntario();
		for(Voluntario u : voluntarios) {
			System.out.println("Nome: " + u.getNome() + "\nEmail: " + u.getEmail());
		}
	}
}
