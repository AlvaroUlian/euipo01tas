/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut3_ta2;

/**
 *
 * @author facum
 */
public class Producto implements IProducto {
    float precio;
    String nombre;
    String codigo;
    int stock = 0;
            
    public Producto(float precio,String nombre, String codigo, int stock){
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }
    
    public Producto getProducto(){
        
     return this;
    }
    public String getDatos(){
        String datosProducto = this.nombre;
        return datosProducto;
    }
    public void setStock(int valor){
        this.stock += valor;
    }
    public int getStock(){
        return this.stock;
    }
    
    public void setPrecio (float precio){
        
      this.precio = precio;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
}
