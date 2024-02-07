/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBDD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class RolController {
    
   ConexionBDD conectar =new ConexionBDD() ;
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
    int res;
    private String tipo;
    
    public RolController(){
        
    }

    public RolController( String tipo) {
        
        this.tipo = tipo;
    }
    

   
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
   //CREACION ROL
    public void CrearRol(RolController r) {
    try {
        String sql = "CALL InsertarRol(?)";
        
        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
            ejecutar.setString(1, r.getTipo());
            res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "ROL CREADO CON EXITO");
            ejecutar.close();
            
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR");
        }
    } catch (HeadlessException ex) {
    }
}
    
    // SELEC
   
    public ArrayList<Object[]>  ObtenerRol() {
    ArrayList<Object[]> listaRol = new ArrayList<>();

    try {
        String sql = "CALL ObtenerTodosRoles()"; 
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[2]; 
                for (int i = 1; i <2; i++) {
                    fila[i] = res.getObject(i+1);
                                
                }
                fila[0]=cont;
                
                listaRol.add(fila);
                cont++;
            
        }
            ejecutar.close();
            return  listaRol;
            
    } catch (SQLException e) {
       JOptionPane.showMessageDialog(null,"COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
    }
return null;
    }
    
    
       
     public void ActualizarRol(RolController r) {
    try {
        String sql = "CALL ActualizarRol(?, ?)";
        
        try (PreparedStatement ejecutar = (PreparedStatement) conectado.prepareCall(sql)) {
            ejecutar.setString(1, r.getTipo());
            ejecutar.setInt(2, r.getIdRol());

            int res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "ROL ACTUALIZADO CON ÉXITO");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR EL ROL");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " +e);
        
        System.out.println("bdd" + e);
    }
}


   
    
    
    public void EliminarRol(int rol_Id) {
        
    String sql = "CALL EliminarRol(?)";
    
    try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
        ejecutar.setInt(1, rol_Id);
        
        boolean resultado = ejecutar.execute(); 
        if (!resultado) {
            JOptionPane.showMessageDialog(null, "ROL ELIMINADO CON ÉXITO");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL ROL");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
    }
}

    private int getIdRol() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
    
}
    
