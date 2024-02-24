package universidadprogra3;

import java.util.Scanner;



public class ListasSimplesDanieli {
	

	    public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in); //crea un objeto Scaner para la entrada de usuario
	       ListasSimplementeEnlazadasD lista = new ListasSimplementeEnlazadasD();
	       
	       while(true){//bucle infinito para mantener el programa en ejecucion
	          // Muestra las opciones del menu
	          System.out.println("\nOpciones: ");
	          System.out.println("1. Insertar elemento al inicio");
	          System.out.println("2. Insertar elemento al final");
	          System.out.println("3. Insertar elemento en una posicion especifica");
	          System.out.println("4. Eliminar primer elemento");
	          System.out.println("5. Eliminar ultimo elemento");
	          System.out.println("6. Eliminar elemento en una posicion especifica");
	          System.out.println("7. Buscar un elemento");
	          System.out.println("8. Imprimir lista");
	          System.out.println("9. salir");
	          System.out.println("Seleccione una opcion: ");
	          int opcion = scanner.nextInt(); //Lee la opcion seleccionada por el usuario
	          
	          switch(opcion){//evalua la opcion seleccionada por el usuario
	              
	              case 1:
	                  System.out.print("Ingrese el elemento a insertar al inicio: "); //solicita al usuario que ingrese el elemento
	                  int elementoInicio = scanner.nextInt(); //Lee el elemento proporcionado por el usuario
	                  lista.insertarAlInicio(elementoInicio); //inserta el elemento al inicio de la lista
	                  break;
	                  
	              case 2:
	                  System.out.print("Ingrese el elemento a insertar al final: "); //solicita al usuario que ingrese el elemento
	                  int elementoFinal = scanner.nextInt(); //Lee el elemento proporcionado por el usuario
	                  lista.insertarAlFinal(elementoFinal); //inserta el elemento al final de la lista
	                  break;
	                  
	              case 3:
	                  System.out.print("Ingrese el elemento a insertar: "); //solicita al usuario que ingrese el elemento
	                  int elemento = scanner.nextInt(); //Lee el elemento proporcionado por el usuario
	                   System.out.print("Ingrese la posicion donde insertar: ");//solicita al usuario que ingrese la posicion
	                   int posicion = scanner.nextInt();//Lee la posicion proporcionada por el usuario
	                  lista.insertarEnPosicion(elemento, posicion); //Inserta el elemento en la posicion especificada de la lista
	                  break;
	                  
	              case 4:
	                  lista.eliminarPrimero();//Elimina el primer elemento de la lista
	                  break;
	                  
	              case 5:
	                  lista.eliminarUltimo();//Elimina el ultimo elemento de la lista
	                  break;
	                  
	              case 6:
	                  System.out.print("Ingrese la posicion del elemento a eliminar: "); //solicita al usuario que ingrese la posicion
	                  int posEliminar = scanner.nextInt(); //Lee el elemento proporcionado por el usuario
	                  lista.eliminarEnPosicion(posEliminar); //Elimina el elemento en la posicion especificada de la lista
	                  break;
	                  
	              case 7:
	                  System.out.print("Ingrese el elemento a buscar: "); //solicita al usuario que ingrese el elemento
	                  int buscarElemento = scanner.nextInt(); //lee ele elemento proporcionado por el usuario
	                  if(lista.buscar(buscarElemento)){//verifica si el elemento esta presente en la lista
	                      System.out.println("El elemento " + buscarElemento + "esta en la lista.");
	                  }else{
	                      System.out.println("El elemento " + buscarElemento + "no esta en la lista.");
	                  }
	                  break;
	                  
	              case 8:
	                  lista.imprimirLista();//imprime la lista actual
	                  break;
	                  
	              case 9:
	                  System.out.println("saliendo del programa..."); //muestraun mensaje de salida
	                  scanner.close(); //cierra el objeto scanner
	                  System.exit(0); //Finaliza el programa
	              default:
	                  System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
	                }  
	            }
	        }
	    }

