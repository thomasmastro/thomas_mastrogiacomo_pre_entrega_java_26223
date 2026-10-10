package com.techlab.gestor;
import java.util.ArrayList;
import java.util.List;
import com.techlab.articulo.model.Articulo;

public class GestorArticulos {

    //atributos
    private final List<Articulo> listaArticulos = new ArrayList<>();
    private int contadorCod =1;

    //getter
    public List<Articulo> getListaArticulos(){
        return this.listaArticulos;
    }

    //metodos
    public Articulo agregarArticulo(String nombre,double precio){

    Articulo nuevo = new Articulo(contadorCod++, nombre, precio);
    listaArticulos.add(nuevo);
    return nuevo;
    }

    public boolean eliminarArticulo(int codArticulo){
        listaArticulos.remove(codArticulo);
        return true;
    }

    public void listarArticulos(){
        for (Articulo articulo : listaArticulos) {
            System.out.println(articulo);
        }
    }

    public int size(){
        return this.listaArticulos.size();
    }

    public static void main(String[] args) {
        //pruebas antes de implementar en clase app
        GestorArticulos g = new GestorArticulos();
        g.agregarArticulo("Cafe",200);
        g.agregarArticulo("Leche",300);
        g.listarArticulos();
        //getListaArticulos(g);
    }


}
