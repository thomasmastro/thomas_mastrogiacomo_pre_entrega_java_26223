package com.techlab.gestor;
import java.util.ArrayList;
import java.util.List;
import com.techlab.articulo.model.Articulo;

public class GestorArticulos {

    //atributos
    private final List<Articulo> articulos = new ArrayList<>();
    private int contadorCod =1;

    //metodos
    public Articulo agregarArticulo(String nombre,double precio){

    Articulo nuevo = new Articulo(contadorCod++, nombre, precio);
    articulos.add(nuevo);
    return nuevo;
    }

    public boolean eliminarArticulo(int codArticulo){
        articulos.remove(codArticulo);
        return true;
    }

    public void listarArticulos(){
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }

    public static void main(String[] args) {
        GestorArticulos g = new GestorArticulos();
        g.agregarArticulo("Cafe",200);
        g.agregarArticulo("Leche",300);
        g.listarArticulos();
    }


}
