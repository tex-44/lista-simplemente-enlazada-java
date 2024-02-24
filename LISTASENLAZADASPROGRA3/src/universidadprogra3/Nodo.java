package universidadprogra3;



public class Nodo {
    
    int dato; //almacena el valor del nodo
    Nodo siguiente; //referencia al siguiente nodo de la lista
    
    //constructor para crear un nuevo nodo con el valor proporcionado
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null; //inicializa el siguiente nodo como nulo
    }
    
}