
package test;

import domain.*;

public class TestConverciondeObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan",5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        //empleado.getTipoEscritura();
        //System.out.println(empleado.obtenerDetalles());//acceder a metodo Escritor
        //Downcasting
        //((Escritor)empleado).getTipoEscritura();
        //Escritor escritor = (Escritor)empleado;
        //escritor.getTipoEscritura();
        
        //Upcasting
        //Empleado empleado2 = escritor;
        //System.out.println(empleado2.obtenerDetalles());
    
    }
    
}
