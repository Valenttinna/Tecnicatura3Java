
package test;


public class AutoUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
        int = integer pasa de ser una variable de tipo primit
                      a ser un objeto, y podemos usasr diferentes
                      metodos con el operador de punto
        long =Long
        float = Float
        double = Double
        boolean = Boolean
        byte = Byte
        char = Character
        short = Short
        */
        int enteroPrim =10;//primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10;//object
        System.out.println("entero = " + entero.doubleValue());//Autoboxing
        
        int entero2 = entero; //unboxing
        System.out.println("entero2 = " + entero2);
        
    }
    
}
