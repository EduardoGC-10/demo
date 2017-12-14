/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.demo.model;


public class UsuariosModel {
    
    private String username;
    private int enabled ;
    private String varcharString;

    public UsuariosModel() {
        super();
    }

    public UsuariosModel(String username, int enabled, String varcharString) {
        super();
        this.username = username;
        this.enabled = enabled;
        this.varcharString = varcharString;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getVarcharString() {
        return varcharString;
    }

    public void setVarcharString(String varcharString) {
        this.varcharString = varcharString;
    }
    
    
    
}
