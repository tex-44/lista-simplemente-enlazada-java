package universidadprogra3;



public class ListasSimplementeEnlazadasD {
	    
	    Nodo cabeza; //referencia al primer nodo de la lista
	    
	    //constructor para inicializar la lista como vacia 
	    public ListasSimplementeEnlazadasD(){
	        this.cabeza=null; //la lista comienza vacia
	    }
	    
	    //Metodo para insertar un nuevo nodo al inicio de la lista
	    public void insertarAlInicio(int dato){
	        Nodo nuevoNodo = new Nodo(dato); //crea un nuevo nodo con el valor proporcionado
	        nuevoNodo.siguiente = cabeza; //establece el siguiente del nuevo nodo como la cabeza actual
	        cabeza = nuevoNodo; //Actualiza la cabeza para que apunte al nuevo nodo
	    }
	    
	    //Metodo para insertar un nuevo nodo al final de la lista
	    public void insertarAlFinal(int dato){
	        Nodo nuevoNodo = new Nodo(dato); //crea un nuevo nodo con el valor proporcionado
	        if(cabeza == null){ //verifica si la lista esta vacia
	            cabeza = nuevoNodo; //si esta vacia, el nuevo nodo se convierte en la cabeza
	        } else {
	            Nodo temp = cabeza;
	            while (temp.siguiente != null) { //avanza hasta el ultimo nodo de la lista
	                temp = temp.siguiente;
	            }
	            temp.siguiente = nuevoNodo; //establece el siguiente del ultimo nodo como el nuevo nodo
	        }
	    }
	 //Metodo para insertar un nuevo nodo en una posicion especifica de la lista
	    public void insertarEnPosicion(int dato, int posicion){
	        if (posicion < 0){//verifica si la posicion es valida
	            System.out.println("La posicion debe ser de numero positivo.");
	            return;
	        }
	        if(posicion == 0){ //inserta al inicio si la posicion es cero
	            insertarAlInicio(dato);
	            return;
	        }
	        Nodo nuevoNodo = new Nodo(dato);
	        Nodo temp = cabeza;
	        for (int i = 0; i < posicion - 1; i++){ //avanza hasta la posicion anterior a la deseada
	            if(temp == null){
	                System.out.println("La lista no tien suficientes elementos.");
	                return;
	            }
	            temp = temp.siguiente;  
	        }
	        if(temp == null){
	            System.out.println("La lista no tiene suficientes elementos.");
	            return;
	        }
	        nuevoNodo.siguiente = temp.siguiente; //inserta el nievo nodo en la posicion especificada
	        temp.siguiente = nuevoNodo;
	    }
	    
	    //Metodo para eliminar el primer nodo de la lista 
	    public void eliminarPrimero(){
	        if(cabeza != null){ //verifica si la lista no esta vacia
	           cabeza = cabeza.siguiente; //La cabeza se mueve al siguiente nodo    
	        } else{
	            System.out.println("Lalista esta vacia.");
	        }
	    }
	    
	    //Metodo para eliminar el ultimo nodo de la lista
	    public void eliminarUltimo(){
	     if(cabeza == null){ //verifica si la lista esta vacia
	         System.out.println("La lista esta vacia.");
	         return;
	     } 
	     if(cabeza.siguiente == null){ //verifica si la lista tiene solo un elemento
	         cabeza = null; //si es asi, la lista queda vacia 
	         return;
	     }
	     Nodo temp = cabeza;
	     while(temp.siguiente.siguiente != null){ //avanza hasta el penultimo nodo
	         temp = temp.siguiente;    
	     }
	     temp.siguiente = null; //elimina la referencia al ultimo nodo
	    }
	    
	    //Metodo para eliminar el nodo en una posicion especifica de la lista
	    public void eliminarEnPosicion(int posicion){
	        if (posicion < 0){ //verifica si la posicion es valida
	            System.out.println("La posicion debe ser un numero positivo.");
	            return;
	        }
	        if (posicion == 0){ //elimina el primer nodo si la posicion es cero
	            eliminarPrimero();
	            return;
	        }
	        Nodo temp = cabeza;
	        for(int i = 0; temp != null && i < posicion -1; i++){//Avanza hasta posicion anterior al nodo a eliminar
	            temp = temp.siguiente;
	        }
	        if(temp == null || temp.siguiente == null){//verifica si la posicion es valida
	        System.out.println("La lista no tiene suficientes elementos.");
	        return;
	        }
	        temp.siguiente = temp.siguiente.siguiente; //elimina el nodo en la posicion especificada
	    }
	    
	    //Metodo para hacer buscar un elemento en la lista
	    public boolean buscar(int dato){
	        Nodo temp = cabeza;
	        while(temp != null){ //recorre la lista
	            if(temp.dato == dato){//compara el valor del nodo con el dato buscado
	                return true; //retorna true si lo encuentra   
	            }
	            temp = temp.siguiente;
	        }
	        return false; //retorna false si no lo encuentra
	    }
	    
	    //Metodo para imprimir los elementos de la lista
	    public void imprimirLista(){
	        Nodo temp = cabeza;
	        System.out.println("Lista: ");
	        while (temp != null){//recorre la lista
	            System.out.print(temp.dato + " ");//imprime el valor del nodo actual
	            temp = temp.siguiente; //Avanza al siguiente nodo
	        }
	        System.out.println();
	    }
	    
	
}
