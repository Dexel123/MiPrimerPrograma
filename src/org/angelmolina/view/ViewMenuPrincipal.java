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
             System.out.println("2. Area de un Triangulo");
             System.out.println("3. Promedio Academico");
             System.out.println("4. Convertidor de Temperatura");
             System.out.println("5. Perimetro de Circulo");
             System.out.println("6. Volumen de un Cilindro");
             System.out.println("7. Hipotenusa");
             System.out.println("8. Dias a Minutos");
             System.out.println("9. Resto de Division");
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
                    System.out.println("--------------------------");
                    System.out.println("El salario es:  + total");
                    System.out.println("--------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 2:
                    System.out.println("Indique la base del triangulo");
                    double base = Integer.parseInt(leer.nextLine());
                    System.out.println("Indique la altura del triangulo");
                    double altura = Integer.parseInt(leer.nextLine());
                    //double area = matematica.areaTriangulo(base,altura)
                    System.out.println("------------------------------------");
                    System.out.println("El area del triangulo es:  + area");
                    System.out.println("------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 3:
                    System.out.println("Ingrese la nota N.1");
                    double n1 = Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese la nota N.2");
                    double n2 =Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese la nota N.3");
                    double n3 = Integer.parseInt(leer.nextLine());
                    //double promedio = matematica.promedioAcademico(n1,n2,n3)
                     System.out.println("--------------------------------------");
                    System.out.println("El promedio academico es:  + promedio");
                    System.out.println("---------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 4:
                     System.out.println("Ingrese los grados Celsius");
                    double celsius = Integer.parseInt(leer.nextLine());
                    //double conversion = matematica.conversorTemperatura(celsius)
                    System.out.println("-----------------------------------------------");
                    System.out.println("La temperatura en farenheit es:  + conversion");
                    System.out.println("-----------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 5:
                    System.out.println("Ingrese el radio del circulo");
                    double radio = Integer.parseInt(leer.nextLine());
                    //double perimetro = matematica.perimetroCirculo(radio)
                     System.out.println("------------------------------------------");
                    System.out.println("El perimetro del circulo es:  + perimetro");
                    System.out.println("-------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 6:
                    System.out.println("Indique la altura del cilindro");
                    double alturaCilindro = Integer.parseInt(leer.nextLine());
                    System.out.println("Indique el radio del cilindro");
                    double radioCilindro = Integer.parseInt(leer.nextLine());
                    //double volumen = matematica.volumenCilindro(alturaCilindro,radioCilindro)
                    System.out.println("----------------------------------------");
                    System.out.println("El volumen del cilindro es: + volumen");
                    System.out.println("----------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 7:
                    System.out.println("Indique la medida del cateto a");
                    double catetoA = Integer.parseInt(leer.nextLine());
                    System.out.println("Indique la medida del cateto b");
                    double catetoB = Integer.parseInt(leer.nextLine());
                    //double hipo = matematica.hipotenusa(catetoA,catetoB)
                    System.out.println("-------------------------------------");
                    System.out.println("La hipotenusa es: + hipo");
                    System.out.println("-------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 8:
                     System.out.println("Ingrese los dias");
                     double dias = Integer.parseInt(leer.nextLine());
                    //double mins = matematica.diasMinutos(dias)
                     System.out.println("-------------------------------------------");
                     System.out.println("Los dias convertidos a minutos son:  + mins");
                     System.out.println("-------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                     leer.nextLine();
                     break;
                case 9:
                    System.out.println("Ingrese el dividendo");
                    double dividendo = Integer.parseInt(leer.nextLine());
                    System.out.println("Indique el divisor");
                    double divisor = Integer.parseInt(leer.nextLine());
                    //double resto = matematica.restoDivision(dividendo,divisor)
                    System.out.println("----------------------------------------");
                    System.out.println("El resto de la division es: + resto");
                    System.out.println("----------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 10:
                      System.out.println("Ingrese un numero entero");
                     int numero = Integer.parseInt(leer.nextLine());
                    //long potencia = matematica.potenciaCubo(numero)
                     System.out.println("-------------------------------------------");
                     System.out.println("La potencia al cubo es:  + potencia");
                     System.out.println("-------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                     leer.nextLine();
                     break;
                    
                    
                                        
            }
             
                 
         }while (opcionMatematicas !=0);}
    }  
