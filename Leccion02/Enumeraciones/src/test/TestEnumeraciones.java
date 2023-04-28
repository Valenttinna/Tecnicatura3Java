
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
       
        //System.out.println("Dia 1: "+ Dias.LUNES);
        //indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente N4: "+Continentes.AMERICA);
        System.out.println("N, de paises en el 4to contienente: "+Continentes.AMERICA.getPaises());
        System.out.println("N de habitantes en el 4to continente: "+Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente N2: "+Continentes.EUROPA);
        System.out.println("N, de paises en el 2do contienente: "+Continentes.EUROPA.getPaises());
        System.out.println("N de habitantes en el 2do continente: "+Continentes.EUROPA.getHabitantes());
        
        System.out.println("Continente N1: "+Continentes.AFRICA);
        System.out.println("N, de paises en el 1er contienente: "+Continentes.AFRICA.getPaises());
        System.out.println("N de habitantes en el 1er continente: "+Continentes.AFRICA.getHabitantes());
        
        System.out.println("Continente N3: "+Continentes.ASIA);
        System.out.println("N, de paises en el 3er contienente: "+Continentes.ASIA.getPaises());
        System.out.println("N de habitantes en el 3er continente: "+Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente N5: "+Continentes.OCEANIA);
        System.out.println("N, de paises en el 5to contienente: "+Continentes.OCEANIA.getPaises());
        System.out.println("N de habitantes en el 5to continente: "+Continentes.OCEANIA.getHabitantes());
        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
        }
    }
}
