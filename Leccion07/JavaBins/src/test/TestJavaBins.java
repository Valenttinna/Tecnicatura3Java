
package test;

import domain.Persona;


public class TestJavaBins {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona.setNombre("Juan");
        Persona.setApellido("Perez");
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre: "+persona.getNombre());
        System.out.println("Persona apellido: "+persona.getApellido());
        
    }
    
}
