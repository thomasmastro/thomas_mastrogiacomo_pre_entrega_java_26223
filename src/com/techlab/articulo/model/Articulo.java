package com.techlab.articulo.model;

public abstract class Articulo {
    
    //atributos
    private final int codigoArticulo;
    private String nombreArticulo;
    private double precioArticulo;
    private Categoria categoriaArticulo;

    //constructor


    public Articulo(int codigo,String nombre, double precio,Categoria categoria){
        this.codigoArticulo = codigo;
        this.nombreArticulo = nombre;
        this.precioArticulo = precio;
        this.categoriaArticulo=categoria;
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

    public Categoria getCategoria(){
        return this.categoriaArticulo;
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

    public void setCategoriaArticulo(Categoria categoria){
        this.categoriaArticulo= categoria;
    }

    //metodos abstractos
    public abstract String getTipoArticulo();

    //este metodo devolvera informacion particular de cada tipo de articulo
    public abstract String getDetalleArticulo();

    @Override 
    public String toString(){
        return "Codigo=" + codigoArticulo +
        " Nombre=" + nombreArticulo +
        " Precio=" + precioArticulo +
        " Categoria=" + categoriaArticulo + 
        " Tipo de Articulo=" + getTipoArticulo() +
        " Detalle especifico=" + getDetalleArticulo();
    }

}
