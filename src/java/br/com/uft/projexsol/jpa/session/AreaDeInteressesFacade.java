/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uft.projexsol.jpa.session;

import br.com.uft.projexsol.entities.AreaDeInteresses;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Carlos Lima
 */
@Stateless
public class AreaDeInteressesFacade extends AbstractFacade<AreaDeInteresses> {

    @PersistenceContext(unitName = "ProjexSol-BetaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreaDeInteressesFacade() {
        super(AreaDeInteresses.class);
    }
    
}
