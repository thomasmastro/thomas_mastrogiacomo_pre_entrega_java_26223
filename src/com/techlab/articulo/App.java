package com.techlab.articulo;
import com.techlab.articulo.model.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class App {
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        mostrarMenu();

        do {
            
            mostrarMenu();

            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:

                    System.out.println("Ingrese descripcion del Articulo nuevo");
                    String nombreArticulo = sc.nextLine();
                    
                    for (int i = 0; i < listaArticulos.size();i++){
                        if(listaArticulos.get(i).getNombre().equalsIgnoreCase(nombreArticulo)){
                            System.out.println("El nombre o el articulo ya existe");
                            break;
                        }
                    }

                    System.out.println("Ingrese el codigo");
                    int codArticulo = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < listaArticulos.size();i++){
                        if(listaArticulos.get(i).getCodigo() == codArticulo){
                            System.out.println("El codigo ya existe");
                            break;
                        }
                    }


                    System.out.println("Ingrese el precio");
                    Double precioArticulo = Double.parseDouble(sc.nextLine());

                    Articulo nuevoArticulo = new Articulo(codArticulo,nombreArticulo, codArticulo);

                    System.out.println("Articulo ingresado correctamente");

                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;         
            
                default:
                    System.out.println("Opcion no existe, intente otra vez");
                    break;
            }
        } while (opcion != 0);
        sc.close();
    }

    public static void mostrarMenu(){
        System.out.println("""
            Menu de Articulos:
            1. Ingresar Articulos
            2. Listar Articulos
            3. Consultar un Articulo
            4. Eliminar un Articulo
            0. Salir
                """);
    }

}
