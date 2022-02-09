public class PruebaPîla {
    public static void main(String[] args) {

        Pila mPila = new Pila();
        mPila.push(1);
        mPila.push(2);
        mPila.push(3);

        int v;
        try{
            while(! mPila.esVacia()){
                v = mPila.popValor();
                System.out.println(v);
                mPila.pop();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
