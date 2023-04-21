
package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNuemeros(3,4,5);
        imprimirNuemeros(1,2);
        variosParametros("Juan","Acosta", 7,8,9);
        
        
    }
    
    private static void variosParametros(String nombre,String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        imprimirNuemeros(numeros);
           
    }
    private static void imprimirNuemeros(int ...numeros){
       for (int i=0;i< numeros.length; i++){
           System.out.println("Elementos: "+numeros[i]);
       } 
    }
}
