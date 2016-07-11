/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.app.DAO;


import br.com.uft.projexsol.entities.Voluntario;
/**
 *
 * @author Carlos Lima
 */
import java.util.List;

public interface VoluntarioDAO {

	boolean insereVoluntario(Voluntario voluntario);

	boolean alteraVoluntario(Voluntario voluntario);

	boolean excluiVoluntario(Voluntario voluntario);

	Voluntario procurarVoluntario(Voluntario voluntario);

	List<Voluntario> procurarTodosVoluntario();

}
