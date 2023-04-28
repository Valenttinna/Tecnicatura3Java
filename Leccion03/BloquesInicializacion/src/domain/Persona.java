
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{ //Bloque de inicializacion estatico
        System.out.println("Ejecucion Bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    {//Bloque de inicializacion NO estatico
        System.out.println("Ejecucion de bloque NO estatico");
        this.idPersona= Persona.contadorPersonas++;//Incremento de atibuto
        
    }
    
    //Los bloques de inicializ. se ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
        
    }
    
    public int idPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
