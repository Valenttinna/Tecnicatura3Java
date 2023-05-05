
package pauqete1;


public class Clase2 extends Clase1{
    String atributoDefault = " Valor del atributo default";
    
    //Clase2(){
      //  System.out.println("Cosntructor  Default");
        
    //}
    
    public Clase2(){
        super();
        this.atributoDefault = " Modificacion del atributo deafault";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }    
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
    
    
}
