package org.angelmolina.view;

import java.util.Scanner;

/**
 *
 * @author Angel Molina
 */
public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner (System.in);
    
    public void mostrarMenu(){
        
        while (opcionMenu ==0){
            System.out.println("Bienvenido, seleccione una opcion");
            opcionMenu = Integer.parseInt(leer.nextLine());
        }
    }
    
    public void mostrarMenuMatematica(){
        System.out.println("Menu de operaciones matematicas");
        
    }
}
