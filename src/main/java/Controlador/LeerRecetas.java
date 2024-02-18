/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBDD;
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
public class LeerRecetas {
    
    
   ConexionBDD conectar =new ConexionBDD() ;
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
   int res;
   int p_id_receta;
    
   public ArrayList<Object[]>  ObtenerPostres() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL LeerRecetasPostres()"; 
        
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[6]; 
                for (int i = 1; i <6; i++) {
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
    
  public ArrayList<Object[]>  ObtenerJugos() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL LeerRecetaJugos()"; 
        
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[6]; 
                for (int i = 1; i <6; i++) {
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

  
  
  public ArrayList<Object[]>  ObtenerDesayunos() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL LeerRecetaDesayuno()"; 
        
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[6]; 
                for (int i = 1; i <6; i++) {
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
    }public ArrayList<Object[]>  ObtenerPlatosFuertes() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL LeerRecetaPatosFuertes()"; 
        
        ejecutar=(PreparedStatement)conectado.prepareCall(sql);
         ResultSet res = ejecutar.executeQuery();

       
            ResultSetMetaData metaData = res.getMetaData();
            int cont =1;

           while (res.next()) {
                Object[] fila = new Object[6]; 
                for (int i = 1; i <6; i++) {
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
   
    
    
    
}
