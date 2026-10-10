package com.techlab.articulo.model;

public class Categoria {

    private int codigoCategoria;
    private String nombreCategoria;
    private String descripcionCategoria;

    public Categoria(int codigo,String nombre,String descripcion){
        this.codigoCategoria=codigo;
        this.nombreCategoria=nombre;
        this.descripcionCategoria=descripcion;
    }

    public void setCodigoCategoria(int codigo){
        this.codigoCategoria=codigo;
    }
    public void setNombreCategoria(String nombre){
        this.nombreCategoria=nombre;
    }
    public void setDescripcionCategoria(String descripcion){
        this.descripcionCategoria=descripcion;
    }

    public int getCodigoCategoria(){
        return codigoCategoria;
    }
    public String getNombreCategoria(){
        return nombreCategoria;
    }
    public String getDescripcionCategoria(){
        return descripcionCategoria;
    }

    @Override 
    public String toString(){
        return "codigo=" + codigoCategoria +
        " nombre=" + nombreCategoria +
        " descripcion" + descripcionCategoria;
    }
}
