/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fashion.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vishal
 */
@Stateless
public class FashionProductsFacade extends AbstractFacade<FashionProducts> {

    @PersistenceContext(unitName = "WomenFashion11PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FashionProductsFacade() {
        super(FashionProducts.class);
    }
    
}
