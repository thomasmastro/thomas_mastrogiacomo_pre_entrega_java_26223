package com.techlab.articulo.model;

public class Articulo {
    
    //atributos
    private final int codigoArticulo;
    private String nombreArticulo;
    private double precioArticulo;

    //constructor
    public Articulo(int codigo,String nombre, double precio){
        this.codigoArticulo = codigo;
        this.nombreArticulo = nombre;
        this.precioArticulo = precio;
    }

    //getters
    public int getCodigo(){
        return this.codigoArticulo;
    }

    public String getNombre(){
        return this.nombreArticulo;
    }

    public double getPrecio(){
        return this.precioArticulo;
    }

    //setter con exception
    public void setNombre(String nombre){
        if (nombre.isBlank() || nombre == null) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        for (char c:  nombre.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                throw new IllegalArgumentException("Solo se permiten letras y espacios");
            }
        }
        this.nombreArticulo = nombre.trim();
    }

    //setter con exception
    public void setPrecio(String precioTexto){
        for(int i = 0;i < precioTexto.length();i++){
            if (precioTexto.substring(i,i+1).equals(",")) {
                throw new IllegalArgumentException("No se permiten usar comas, utilice punto para los decimales");
            }
        }
        double precioDouble;
        try {
            precioDouble = Double.parseDouble(precioTexto);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Debes ingresar un numero valido");
        }
        if (precioDouble<0) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }

        this.precioArticulo = precioDouble;
    }

    @Override 
    public String toString(){
        return "Articulo: " + nombreArticulo
        + " Codigo: " + codigoArticulo
        + " Precio: $" + precioArticulo;
    }

}
