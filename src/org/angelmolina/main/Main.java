
package org.angelmolina.main;
import org.angelmolina.view.ViewMenuPrincipal;

/**
 *
 * @author Angel Moliina
 */
public class Main {

    public static void main(String[] args) {
        // Tipo de dato,nombre, valores
        //instanciar <- new
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        
        System.out.println("Mi primer programa");
        menu.mostrarMenu();
    }
    
}
