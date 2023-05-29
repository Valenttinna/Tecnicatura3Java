package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesosDatos datos = new implementacionMySql();
        //datos.listar();
        //imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesosDatos datos) {
        datos.listar();
        
    }
    
}
