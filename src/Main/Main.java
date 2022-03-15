
package Main;

import Operacion.Operacion;
import Servicio.Servicio;


public class Main {

    
    public static void main(String[] args) {
   
        Servicio S1 = new Servicio();
        System.out.println("----------");
        Operacion O1 = S1.CrearOperacion();
         System.out.println("El resultado de las operaciones es :");
        S1.Sumar(O1);
        S1.Restar(O1);
        S1.Multiplicacion(O1);
        S1.Divicion(O1);
    }
    
}
   
      
    