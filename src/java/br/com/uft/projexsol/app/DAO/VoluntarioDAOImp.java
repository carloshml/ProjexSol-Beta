/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.DAO;

import java.util.List;
import br.com.uft.projexsol.entities.Voluntario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
/**
 *
 * @author Carlos Lima
 */
public class VoluntarioDAOImp {

	private Session session = null;
	private Transaction transaction = null;

	public boolean insereVoluntario(Voluntario voluntario) {
		boolean retorno = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			System.out.print("DAO - email: " + voluntario.getEmail());
			session.persist( voluntario);
			transaction.commit();
			retorno = true;
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return retorno;
	}

	public boolean alteraVoluntario(Voluntario voluntario) {
		boolean retorno = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.update(voluntario);
			transaction.commit();
			retorno = true;
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return retorno;
	}

	public boolean excluiVoluntario(Voluntario voluntario) {
		boolean retorno = false;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.delete(session.get(Voluntario.class, voluntario.getId()));
			transaction.commit();
			retorno = true;
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return retorno;
	}

	public Voluntario procurarVoluntario(Voluntario voluntario) {
		Voluntario u = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			u = (Voluntario) session.get(Voluntario.class, voluntario.getId());
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return u;
	}

	public List<Voluntario> procurarTodosVoluntario() {
		List<Voluntario> list = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			list = session.createQuery("select o from Voluntario o").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

}