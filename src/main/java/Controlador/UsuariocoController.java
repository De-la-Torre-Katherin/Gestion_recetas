/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBDD;
import Modelo.Persona;
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
public class UsuariocoController {
    
     private Persona persona;
   ConexionBDD conectar =new ConexionBDD() ;
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
   int res;
   
   
   public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    public void CrearUsuario(Persona r) {
    try {
        String sql = "CALL InsertarUsuario(?,?,?,?,?,?,?)";

        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
            ejecutar.setString(1, r.getCedula());
            ejecutar.setString(2, r.getNombre());
            ejecutar.setString(3, r.getApellido());
            ejecutar.setString(4, r.getDireccion());
            ejecutar.setString(5, r.getCorreo());
            ejecutar.setString(6, r.getContrasenia());
            ejecutar.setInt(7, r.getRol()); 

            res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "USUARIO CREADO CON EXITO");
                } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR" + e);
            System.out.println("Error al ejecutar la consulta: " + e);
        }
    } catch (HeadlessException ex) {
    }
}

    
    public ArrayList<Object[]>  ObtenerUsuarios() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL ObtenerTodosUsuarios()"; 
        
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[8]; 
                for (int i = 1; i <8; i++) {
                    fila[i] = res.getObject(i+1);
                                
                }
                fila[0]=cont;
                
                listaUsuario.add(fila);
                cont++;
            
        }
            ejecutar.close();
            return  listaUsuario;
            
    } catch (SQLException e) {
        
       JOptionPane.showMessageDialog(null,"COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
       
    }
    
return null;
    }
    
    
    public void ActualizarUsuario(Persona r) {
    try {
        String sql = "CALL ActualizarUsuario(?,?,?,?,?,?,?)";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setString(1, r.getCedula());
        ejecutar.setString(2,r.getNombre() );
        ejecutar.setString(3,r.getApellido());
        ejecutar.setString(4,r.getDireccion());
        ejecutar.setString(5,r.getCorreo());
        ejecutar.setString(6,r.getContrasenia());
        ejecutar.setInt(7,r.getRol());

        int res = ejecutar.executeUpdate();

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "USUARIO ACTUALIZADO CON ÉXITO");
        } else  {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR LOS DATOS DEL USUARIO");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e);
        System.out.println("bdd" + e);
        e.printStackTrace();
    }
}
   
    
    
   public void EliminarUsuario(Persona p) {
    String sql = "CALL EliminarUsuario(?)";

    try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
        ejecutar.setString(1, p.getCedula());

        int resultado = ejecutar.executeUpdate();
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "USUARIO ELIMINADO CON ÉXITO");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR EL USUARIO");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
    }
}


   
}
