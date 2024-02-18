/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author HP
 */
public class Recetario {
    
    private int reid;
    private String titulo;
    private String ingredientes;
    private String preparacion;
    private int catid;
    private int usuid;
    
public Recetario(){
      
            
}
    public Recetario(int reid, String titulo, String ingredientes, String preparacion, int catid, int usuid) {
        this.reid = reid;
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.catid = catid;
        this.usuid = usuid;
    }

    public int getReid() {
        return reid;
    }

    public void setReid(int reid) {
        this.reid = reid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public int getUsuid() {
        return usuid;
    }

    public void setUsuid(int usuid) {
        this.usuid = usuid;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
