/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.ejb;

import com.fcastillo.mail.template.entidades.Templates;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author fcastillo
 */
@Stateless
public class MenuFacade implements MenuFacadeRemote {

    @EJB
    private TemplatesFacadeLocal templateEJB;

    @Override
    public String saludar() {
        return "Hola";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public Templates findById(Integer id) {
        return templateEJB.find(id);
    }

    @Override
    public List<Templates> buscarTodos() {
        return templateEJB.findAll();
    }
}
