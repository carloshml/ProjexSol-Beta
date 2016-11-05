/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.login;
import br.com.uft.projexsol.app.DAO.VoluntarioDAO;
import java.util.logging.Level;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
@ManagedBean
public class LoginController {

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
    private String login;
    private String senha;
    
    public void logar(ActionEvent event){
         try {
            RequestContext context = RequestContext.getCurrentInstance();
            FacesMessage message = null;
            boolean loggedIn = false;
            
            if(new VoluntarioDAO().getVolutario(login, senha)!=null) {
               
                loggedIn = true;
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem vindo", login);
                FacesContext context2 = FacesContext.getCurrentInstance();
                context2.getExternalContext().redirect(context2.getExternalContext().getRequestContextPath()+"/template.xhtml");
            } else {
                loggedIn = false;
                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro ao logar", "Nome de usuário ou senha inválidos");
            }
            
            FacesContext.getCurrentInstance().addMessage(null, message);
            context.addCallbackParam("loggedIn", loggedIn);
            
        } catch (Exception ex) {
             System.out.println("Erro "+ex.getMessage());
        }
    }
}
