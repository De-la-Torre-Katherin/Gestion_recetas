/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.ConexionBDD;
import Modelo.CategoriaM;
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
public class CategoriasController {
    
    private CategoriaM categoria;
    ConexionBDD conectar =new ConexionBDD() ;
   Connection conectado=(Connection)conectar.conectar();
   PreparedStatement ejecutar;
   ResultSet resultado;
   int res;

    public CategoriaM getCategoriaM() {
        return categoria;
    }

    public void setCategoriaM(CategoriaM categoria) {
        this.categoria = categoria;
    }
       
    public void CrearCategoria (CategoriaM r) {
    try {
        String sql = "CALL CrearCategoria (?)";
        
        try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
            ejecutar.setString(1,r.getTema() );
            
            res = ejecutar.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "CATEGORIA CREADA CON EXITO");
            ejecutar.close();
            
            } else {
                JOptionPane.showMessageDialog(null, "REVISAR LA INFORMACION INGRESADA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR"+e);
            
            System.out.println("hiewfhue"+e);
        }
    } catch (HeadlessException ex) {
    }
}
    
    
    
    
    public ArrayList<Object[]>  ObtenerCategoria() {
    ArrayList<Object[]> listaUsuario= new ArrayList<>();

    try {
        String sql = "CALL ObtenerTodasCategorias()"; 
        
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
    
    
    public void ActualizarCategoria (CategoriaM r) {
    try {
        String sql = "CALL ActualizarCategoria(?,?)";
        ejecutar = (PreparedStatement) conectado.prepareCall(sql);
        ejecutar.setInt(1, r.getId());
        ejecutar.setString(2, r.getTema());
        

        int res = ejecutar.executeUpdate();

        if (res > 0) {
            JOptionPane.showMessageDialog(null, "CATEGORIA ACTUALIZADA CON ÉXITO");
        } else  {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ACTUALIZAR LOS DATOS DE LA CATEGORIA");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e);
        System.out.println("bdd" + e);
        e.printStackTrace();
    }
}
   
    
    
   public void EliminarCategoria(CategoriaM p) {
    String sql = "CALL EliminarCategoria(?)";

    try (PreparedStatement ejecutar = conectado.prepareCall(sql)) {
        ejecutar.setInt(1, p.getId());

        boolean resultado = ejecutar.execute(); 
        if (!resultado) {
            JOptionPane.showMessageDialog(null, "CATEGORIA ELIMINADA CON ÉXITO");
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR LA CATEGORIA ");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "COMUNICARSE CON EL ADMINISTRADOR: " + e.getMessage());
    }
}

    
    
    
    
    
}
