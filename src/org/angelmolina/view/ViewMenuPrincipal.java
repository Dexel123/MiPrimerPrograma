package org.angelmolina.view;
import java.util.Scanner;
import org.angelmolina.controller.ControllerMatematicas;
import org.angelmolina.controller.ControllerTexto;
import org.angelmolina.controller.ControllerLogico;
 
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
               case 2:
                   mostrarMenuTexto();
                   break;
               case 3:
                   mostrarMenuLogico();
           }
        }  while (opcionMenu !=4);
                System.out.println("Nos vemos :)");
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
             
                 
         }while (opcionMatematicas !=0);
                 System.out.println("REGRESANDO");
                 System.out.println("\nPresione ENTER para continuar");
                     leer.nextLine();
                     Limpiar();
         
     
    }

     public void mostrarMenuTexto(){
         int opcionTexto = 0; 
         ControllerTexto texto = new ControllerTexto();
         do{
             System.out.println("Menu de operaciones de Texto");
             System.out.println("0. Regresar al menu Principal");
             System.out.println("1. Concatenador de Nombre");
             System.out.println("2. Contador de Longitud");
             System.out.println("3. Inversor de Texto");
             System.out.println("4. Detector de Vocales");
             System.out.println("5. Extractor de Iniciales");
             System.out.println("6. Normalizador a Mayusculas");
             System.out.println("7. Conversor Binario");
             System.out.println("8. Repetidor de Palabras");
             System.out.println("9. Validador de Password");
             System.out.println("10. Generador de Email");
             opcionTexto = Integer.parseInt(leer.nextLine()); 
             Limpiar();
             
             switch(opcionTexto){
                case 1: 
                    System.out.println("Ingrese su nombre"); 
                    String nombre= leer.nextLine();
                    System.out.println("Ingrese su apellido");
                    String apellido = leer.nextLine();
                  // String nombreCompleto = texto.concatenarNombres(nombre,apellido);
                    System.out.println("--------------------------------");
                    System.out.println("tu nombre completo es + nombre");
                    System.out.println("---------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                    
                case 2:
                    System.out.println("Ingrese una palabra");
                    String palabra =leer.nextLine();
                    //int letras = contadorLetras(palabra);
                    System.out.println("-----------------------------");
                    System.out.println("la palabra contiene + letras");
                    System.out.println("-----------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 3:
                    System.out.println("Ingrese una palabra");
                    String reves =leer.nextLine();
                    //String revertir = palabraReves(reves);
                    System.out.println("--------------------------");
                    System.out.println("la palabra al reves es + revertir");
                    System.out.println("--------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese un caracter");
                    String caracter =leer.nextLine();
                    // boolean esVocal = texto.verificarSiEsVocal(caracter);
                    System.out.println("------------------------------------------");
                    System.out.println("Es una vocal?: + esVocal");
                    System.out.println("--------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 5:
                   System.out.println("Ingrese su nombre"); 
                    String nom = leer.nextLine();
                    System.out.println("Ingrese su apellido");
                    String apell = leer.nextLine();
                  // String iniciales = texto.obtenerIniciales(nom,apell);
                    System.out.println("------------------------------------------");
                    System.out.println("Las iniciales son: + iniciales");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                    
                case 6:
                    System.out.println("Ingrese un texto mixto");
                    String textoMixto =leer.nextLine();
                    // String textMayus = texto.convertirMayusculas(textoMixto);
                    System.out.println("------------------------------------------");
                    System.out.println("El texto en mayusculas es: + textMayus");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 7:
                    System.out.println("Ingrese un numero binario");
                    int binario = Integer.parseInt(leer.nextLine());
                    // boolean comprobacion = texto.verificarParImpar(comprobacion);
                    System.out.println("------------------------------------------");
                    System.out.println("El numero binario es: + comproacion");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 8:
                    System.out.println("Ingrese una palabra");
                    String palabraRepetir = leer.nextLine();
                    System.out.println("Ingrese el numero de veces que desea repetirla");
                    int cantidad = Integer.parseInt(leer.nextLine());
                    //  String repetir = texto.repetirPalabra(palabraRepetir,cantidad);
                    System.out.println("------------------------------------------");
                    System.out.println("palabra + repetir - 1");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 9:
                     System.out.println("Ingrese una contrasena");
                    String contra = leer.nextLine();
                    // boolean esSegura = texto.validarContrasena(contra);
                    System.out.println("------------------------------------------");
                    System.out.println("La contrasena es: + esSegura");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 10:
                     System.out.println("Ingrese un nombre"); 
                    String name = leer.nextLine();
                    System.out.println("Ingrese un apellido");
                    String lastName = leer.nextLine();
                    System.out.println("Ingrese un dominio");
                    String dominio= leer.nextLine();
                    // String Correo = texto.concatenarCorreo(name,lastName,correo);
                    System.out.println("------------------------------------------");
                    System.out.println("Su correo es: + correo ");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                          
                    
             }
                    
            
             
         }while (opcionTexto != 0);
            System.out.println("REGRESANDO");
                 System.out.println("\nPresione ENTER para continuar");
                     leer.nextLine();
                     Limpiar();
     }
     public void mostrarMenuLogico(){
         int opcionLogico = 0; 
         ControllerLogico logico = new ControllerLogico();
         do{
             System.out.println("Menu de operaciones de Texto");
             System.out.println("0. Regresar al menu Principal");
             System.out.println("1. Verificador de Edad");
             System.out.println("2. Numero Par");
             System.out.println("3. Semaforo");
             System.out.println("4. Rango Numerico");
             System.out.println("5. Login Simple");
             System.out.println("6. Mayor de Dos");
             System.out.println("7. Año Bisiesto");
             System.out.println("8. Aprobado/Reprobado");
             System.out.println("9. Validador de Triangulo");
             System.out.println("10. Comparador de Cadenas");
             opcionLogico = Integer.parseInt(leer.nextLine()); 
             Limpiar();
             
             switch(opcionLogico){
                case 1: 
                   System.out.println("Ingrese su edad");
                     int edad = Integer.parseInt(leer.nextLine());
                     // boolean esMayor = logica.verificarMayoriaEdad(edad);
                    System.out.println("------------------------------------------");
                    System.out.println("¿Es mayor de edad?: + esMayor");
                    System.out.println("------------------------------------------");
                    System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese un numero");
                     int numPar = Integer.parseInt(leer.nextLine());
                     // boolean esPar = logica.verificarPar(numPar);
                    System.out.println("------------------------------------------");
                    System.out.println("¿Es un numero par?: + esPar");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 3:
                      System.out.println("Ingrese un color del semaforo");
                     String color = leer.nextLine();
                     // boolean queColorEs = logica.Semaforo(color);
                     System.out.println("------------------------------------------");
                     System.out.println("ahora + queColorEs");
                     System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese un numero:");
                     int numInicial = Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese un numero maximo:");
                     int numMax = Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese un numero minimo:");
                     int numMin = Integer.parseInt(leer.nextLine());
                     // boolean numRango = logica.verificarRango(numInicial,numMax,nuMin);
                    System.out.println("------------------------------------------");
                    System.out.println("Tu numero es: + numRango");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 5:
                    System.out.println("Ingrese su usuario:");
                     String usuario = leer.nextLine();
                    System.out.println("Ingrese su contrasena:");
                     int password = Integer.parseInt(leer.nextLine());
                     // boolean acceso = logica.login(usuario,password);
                    System.out.println("------------------------------------------");
                    System.out.println("login + acceso");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 6:
                    System.out.println("Ingrese un numero:");
                     int nume1 = Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese un numero maximo:");
                     int nume2 = Integer.parseInt(leer.nextLine());
                     // boolean numMayot = logica.numeroMayor(nume1,nume2);
                    System.out.println("------------------------------------------");
                    System.out.println("El numero mayor es: + numMayor");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 7:
                     System.out.println("Ingrese un año:");
                     int año = Integer.parseInt(leer.nextLine());
                     // boolean añoBisiesto = logica.calcularAñoBisiesto(año);
                    System.out.println("------------------------------------------");
                    System.out.println("Tu año es: + añoBisiesto");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 8:
                     System.out.println("Ingrese su nota final:");
                     int notaFin = Integer.parseInt(leer.nextLine());
                     // boolean  aprobadoReprobado= logica.verificarAprobadoReprobado(notaFin);
                    System.out.println("------------------------------------------");
                    System.out.println("Tu: + aprobadoReprobado");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 9:
                    System.out.println("Ingrese el lado N.1:");
                     int lado1 = Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese el lado N.2:");
                     int lado2 = Integer.parseInt(leer.nextLine());
                    System.out.println("Ingrese el lado N.3:");
                     int lado3 = Integer.parseInt(leer.nextLine());
                     // boolean totalLados = logica.verificarTriangulos(lado1,lado2,lado3);
                    System.out.println("------------------------------------------");
                    System.out.println("con los lados : + totalLados");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                case 10:
                    System.out.println("Ingrese la primera palabra");
                     String pal1 = leer.nextLine();
                    System.out.println("Ingrese la segunda palabra");
                     String pal2 = leer.nextLine();
                     // boolean palabrasIguales = logica.comparaPalabras(pal1,pal2);
                    System.out.println("------------------------------------------");
                    System.out.println("Las palabras : + palabrasIguales");
                    System.out.println("------------------------------------------");
                     System.out.println("\nPresione ENTER para continuar");
                    leer.nextLine();
                    break;
                    
                    
                      
             }
         
         
         }while (opcionLogico != 0);
            System.out.println("REGRESANDO");
                 System.out.println("\nPresione ENTER para continuar");
                     leer.nextLine();
                     Limpiar();} 
}


    
        
         

    
    


    
             
             