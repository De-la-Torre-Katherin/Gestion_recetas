/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBDD;
import Modelo.Recetario;
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
public class RecetasController {
    
     private Recetario Recetario;
 
   ConexionBDD conectar =new ConexionBDD() ;
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
   int res;

    public Recetario getRecetario() {
        return Recetario;
    }

    public void setRecetario(Recetario Recetario) {
        this.Recetario = Recetario;
    }
   
   
   
    
    public void CrearReceta(Recetario r) {
    try {
        String sql = "CALL CrearReceta(?,?,?,?,?)";
        
        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
            ejecutar.setString(1,r.getTitulo() );
            ejecutar.setString(2,r.getIngredientes());
            ejecutar.setString(3,r.getPreparacion());
            ejecutar.setInt(4,r.getCatid());
            ejecutar.setInt(5,r.getUsuid());
            
            
            
            res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "RECETA CREADA CON EXITO");
            ejecutar.close();
            
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR"+e);
            
            System.out.println("hiewfhue"+e);
        }
    } catch (HeadlessException e) {
    }
}
    
    
    
    
    public ArrayList<Object[]>  ObtenerRecetas() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL ObtenerTodasRecetas()"; 
        
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
    
   public void ActualizarRecetas(Recetario r) {
    try {
        String sql = "CALL ActualizarReceta(?,?,?,?,?)";
        
        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
           
            ejecutar.setString(1, r.getTitulo());
            ejecutar.setString(2, r.getIngredientes());
            ejecutar.setString(3, r.getPreparacion());
            ejecutar.setInt(4, r.getCatid());
            ejecutar.setInt(5, r.getUsuid());
            
            
            
            res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "RECETA ACTUALIZADA CON EXITO");
            ejecutar.close();
            
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR"+e);
            
            System.out.println("hiewfhue"+e);
        }
    } catch (HeadlessException e) {
    }
}

   
    
    
   public void EliminarReceta(Recetario p) {
    String sql = "CALL EliminarReceta(?)";

    try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
        ejecutar.setString(1, p.getTitulo());

        boolean resultado = ejecutar.execute(); 
        if (!resultado) {
            JOptionPane.showMessageDialog(null, "LA RECETA A SIDO  ELIMINADA CON ÉXITO");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR LA RECETA");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
    }
}
    
    
    
    
    
    
    
}
