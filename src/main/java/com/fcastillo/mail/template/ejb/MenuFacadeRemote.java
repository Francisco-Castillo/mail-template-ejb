/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.ejb;

import com.fcastillo.mail.template.entidades.Templates;
import javax.ejb.Remote;

/**
 *
 * @author fcastillo
 */
@Remote
public interface MenuFacadeRemote {

    String saludar();

    Templates findById(Integer id);
}
