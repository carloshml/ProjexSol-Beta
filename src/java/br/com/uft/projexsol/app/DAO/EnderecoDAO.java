/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.DAO;

import br.com.uft.projexsol.app.EntityManager.FabricaPersistente;
import br.com.uft.projexsol.entities.Endereco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author PedroLima
 */
public class EnderecoDAO {
    public static boolean insertEndereco(Endereco endereco){
        try{
            
            SessionFactory sessaoDaFabrica = FabricaPersistente.getSessionFactory();
            Session sessao = sessaoDaFabrica.openSession();
            Transaction transacao = sessao.beginTransaction();
            sessao.saveOrUpdate(endereco);
            transacao.commit();
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
