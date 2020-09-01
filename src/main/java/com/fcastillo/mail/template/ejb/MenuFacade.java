/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author fcastillo
 */
@Stateless
public class MenuFacade implements MenuFacadeRemote {

    @Override
    public String saludar() {
        return "Hola";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
