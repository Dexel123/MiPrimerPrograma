package org.angelmolina.view;
import java.util.Scanner;
import org.angelmolina.controller.ControllerMatematicas;
 
public class ViewMenuPrincipal {
    //global
    int opcionMenu = 0;
    Scanner leer = new Scanner(System.in);
    public void mostrarMenu(){
        do{
            System.out.println("Bienvenido, Seleccione una opcion:");
            System.out.println("1. operaciones matematicas ");
            System.out.println("2. operaciones de texto");
            System.out.println("3. operaciones de logica");
            System.out.println("4. salir del sistema");
            opcionMenu = Integer.parseInt(leer.nextLine());
           switch (opcionMenu){
               case 1:
                   mostrarMenuMatematicas();
                   break; 
           }
        }  while (opcionMenu !=4); 
    }
    
    public void Limpiar() {
        for(int i = 0; i <50; i++)
        System.out.println();
    }
    
     public void mostrarMenuMatematicas(){
         int opcionMatematicas = 0; 
         ControllerMatematicas matematica = new ControllerMatematicas();
         do{
             System.out.println("Menu de operaciones Matematicas");
             System.out.println("0. Regresar al menu Principal");
             System.out.println("1. Calcular salario");
             System.out.println("2. Area de un Triángulo");
             System.out.println("3. Promedio Académico");
             System.out.println("4. Convertidor de Temperatura");
             System.out.println("5. Perímetro de Círculo");
             System.out.println("6. Volumen de un Cilindro");
             System.out.println("7. Hipotenusa");
             System.out.println("8. Dias a Minutos");
             System.out.println("9. Resto de División");
             System.out.println("10. Potencia al Cubo");
             opcionMatematicas = Integer.parseInt(leer.nextLine()); 
             Limpiar();
             
             switch(opcionMatematicas){
                case 1: 
                    System.out.println("Indique las horas trabajadas"); 
                    int horas = Integer.parseInt(leer.nextLine());
                    System.out.println("Indique el costo por hora");
                    double costo = Double.parseDouble(leer.nextLine());
                   // double total = matematica.calcularSalario(horas,costo);
                    System.out.println("-------------------------");
                    System.out.println("El salario es:  + total");
                    System.out.println("-------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 2:
                
            }
             
                 
         }while (opcionMatematicas !=0);}
    }  
