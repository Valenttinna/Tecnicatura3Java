
package test;

import domain.Empleado;
import domain.Gerente;

public class TestIntanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Jose", 5000,"Sistemas");
        //determinarTipo(empleado1);
    }
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            gerente.getDepartamento();
                    
        }//no muetra nada porque es falso
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empledo");
        }
        else if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
        //instaceof nos dice a que tipo responde
    }
    
}
