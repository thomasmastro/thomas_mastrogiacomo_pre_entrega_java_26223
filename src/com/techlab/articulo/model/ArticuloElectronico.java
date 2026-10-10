package com.techlab.articulo.model;

public class ArticuloElectronico extends Articulo {

    private int garantiaMeses;

    public ArticuloElectronico(int codigo,String nombre, double precio,Categoria categoria,int garantia){
        super(codigo,nombre,precio,categoria);
        this.garantiaMeses=garantia;
    }

    public void setGarantiaMeses(int garantia){
        this.garantiaMeses=garantia;
    }

    public int getGarantiaMeses(){
        return this.garantiaMeses;
    }

    @Override 
    public String getTipoArticulo(){
        return " Electronico";
    }

    @Override
    public String getDetalleArticulo(){
        return " Meses de garantia=" + getGarantiaMeses();
    }

    @Override 
    public String toString(){
        return super.toString() + " [subtipo electronico]";
    }

    public String nroTelMesaDeAyudaParaReclamos(){
        return "0800-123-4567";
    }

    
}
