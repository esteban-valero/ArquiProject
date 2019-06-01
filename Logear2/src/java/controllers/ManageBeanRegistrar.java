/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entitites.Usuarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author sistemas
 */
@ManagedBean
@RequestScoped
public class ManageBeanRegistrar {

    /**
     * Creates a new instance of ManageBean
     */
    public ManageBeanRegistrar() {
    }
    @EJB
    private UsuariosFacade usuariosfacade ;
    private Usuarios usuarios = new Usuarios();
    private List<Usuarios> listaUsuarios = new ArrayList<Usuarios>();

    public UsuariosFacade getUsuariosfacade() {
        return usuariosfacade;
    }

    public void setUsuariosfacade(UsuariosFacade usuariosfacade) {
        this.usuariosfacade = usuariosfacade;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    public String guardar (){
        try {
            usuarios.setIdusuario(Long.valueOf(usuariosfacade.count() + 1));
            this.usuariosfacade.create(usuarios);
            return "guardado";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public String logear (){
        try {
            listaUsuarios=usuariosfacade.findAll();
            for(Usuarios u : listaUsuarios){
                if(u.getUsuario().equalsIgnoreCase(usuarios.getUsuario()) &&  u.getContraseña().equals(usuarios.getContraseña()))
                        return "<h3> Bienvenido"+usuarios.getUsuario()+" </h3";
            }
            return "<h3> Usuario o contraseña incorrectos</h3>";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    public String indexar(){
        return "log";
    }
}
