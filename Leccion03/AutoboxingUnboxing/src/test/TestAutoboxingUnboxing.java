
package test;

//NO FUNCIONA IR A aUTOuNBOXING
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
        int = integer pasa de ser una variable de tipo primit
                      a ser un objeto, y podemos usasr diferentes
                      metodos con el operador de punto
        
        */
        int enteroPrim =10;//primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10;//object
        System.out.println("entero = " + entero.shortValue());
    }
}
