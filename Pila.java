public class Pila {
    
    private Nodo cabeza;
    private int tam;
    
    public void Pila(){
        cabeza = null;
        tam = 0;
    }
 
    
    public boolean esVacia(){
        return cabeza == null;
    }
    
    public int gettam(){
        return tam;
    }
    


    /**
     * Inserta un nuevo elemento de la pila
     * @param valor
     */
    public void push(int valor){
        
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            cabeza = nuevo;
        }

        else{
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
      
        tam++;
    } 




    /**
     * Elimina el elemento que se encuentra en el tope de la pila.
     */
    public void pop(){
        if (!esVacia()) {
            cabeza = cabeza.getSiguiente();
            tam--;
        }
    }
    
    /**
     * 
     * @return
     * @throws Exception
     * Devuelve el valor de la cima de la pila, pero no desapila
     */

    public int popValor() throws Exception{

        if(!esVacia()){
            return cabeza.getValor();
        }
        else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    

    /**
     * Busca un elemento dentro de la pila
     * @param referencia
     * @return
     */
    public boolean buscar(int valor){
       
        Nodo aux = cabeza;
        boolean existe = false;
       
        while(existe != true && aux != null){
            if (valor == aux.getValor()) {
                existe = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
       
        return existe;
    }
}