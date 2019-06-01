package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entitites.Usuarios;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author sistemas
 */
@ManagedBean
@RequestScoped
public class ManagedBeanLogear {

    /**
     * Creates a new instance of ManagedBeanLogear
     */
    public ManagedBeanLogear() {
    }
    
    @EJB
    private UsuariosFacade usuariosfacade ;
    private Usuarios usuarios = new Usuarios();
    
    
    
}
