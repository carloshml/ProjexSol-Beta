/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBeans;

/**
 *
 * @author Carlos Lima
 */

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;

import br.com.uft.projexsol.entities.Voluntario;
import br.com.uft.projexsol.app.DAO.VoluntarioDAO;
import br.com.uft.projexsol.app.DAO.VoluntarioDAOImp;

public class VoluntarioMB {

	private VoluntarioDAOImp voluntarioDAO =  new VoluntarioDAOImp();
        //	private UsuarioDAO usuarioDAO = new UsuarioDAOImp();
	private Voluntario voluntario;
	private boolean exibirForm = false;

	public ListDataModel getVoluntarios() {
		return new ListDataModel(voluntarioDAO.procurarTodosVoluntario());
	}

	public String adicionarVoluntario() {
		this.limparVoluntario();
		this.exibirForm();
		return null;
	}

	public String alterarVoluntario() {
		this.exibirForm();
		return null;
	}

	public String salvarVoluntario() {
		if (voluntario.getId() == 0) {
			voluntarioDAO.insereVoluntario(voluntario);
		} else {
			voluntarioDAO.alteraVoluntario(voluntario);
		}
		this.mostrarMensagem(voluntario.getNome() + " foi salvo!");
		this.ocultarForm();
		return null;
	}

	public String excluirVoluntario() {
		voluntarioDAO.excluiVoluntario(voluntario);
		this.mostrarMensagem(voluntario.getNome() + " foi excluido!");
		return null;
	}
	
	public String cancelarCadastroVoluntario() {
		this.ocultarForm();
		return null;
	}

	private void limparVoluntario() {
		voluntario = new Voluntario();
	}

	private void exibirForm() {
		exibirForm = true;
	}

	private void ocultarForm() {
		exibirForm = false;
	}

	private void mostrarMensagem(String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(mensagem));
	}

	public Voluntario getVoluntario() {
		return voluntario;
	}

	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}

	public boolean isExibirForm() {
		return exibirForm;
	}

}