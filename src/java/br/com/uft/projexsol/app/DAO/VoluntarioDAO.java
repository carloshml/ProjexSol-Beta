/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.DAO;

import br.com.uft.projexsol.app.EntityManager.FabricaPersistente;
import br.com.uft.projexsol.entities.Voluntario;
import org.hibernate.*;
/**
 *
 * @author PedroLima
 */
public class VoluntarioDAO {
    public static boolean insertVoluntario(Voluntario voluntario){
        try{
            
            SessionFactory sessaoDaFabrica = FabricaPersistente.getSessionFactory();
            Session sessao = sessaoDaFabrica.openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(voluntario);
            transacao.commit();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public Voluntario getVolutario(String login, String senha){
        try{
            SessionFactory sessaoDaFabrica = FabricaPersistente.getSessionFactory();
            Session sessao = sessaoDaFabrica.openSession();
            Query query = sessao.createQuery("from Voluntario where login = :id and senha = :pass");
            query.setParameter("id", login);
            query.setParameter("pass", senha);
            Voluntario voluntario = (Voluntario) query.list().get(0);
            
            return voluntario;
            
        }catch(Exception e){
           return null;
        }
    }
}
