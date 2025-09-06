/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author User
 */
public class clientes {
    private static String nombre;
    private String apellido;
    private String email;
    private String nickname;
    private String clave;
    private static List<clientes> usuarios = new ArrayList<>();

    public clientes() {
    }

    public clientes(String nombre, String apellido, String email, String nickname, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nickname = nickname;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   
    
    public static void agguser(String c, String apellido1, String email1, String nickname1, String contraseña){
        clientes nuevoUsuario = new clientes();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setApellido(apellido1);
        nuevoUsuario.setEmail(email1);
        nuevoUsuario.setNickname(nickname1);
        nuevoUsuario.setClave(contraseña);
    
    usuarios.add(nuevoUsuario);
    
    }
    public static boolean verificarLogin(String usuario, String contraseña) {
        for (clientes cliente : usuarios) {
            if ((cliente.getNickname().equals(usuario)) 
                && cliente.getClave().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
    public static List<clientes> getListaUsuarios() {
         return usuarios;
    }
}
    

