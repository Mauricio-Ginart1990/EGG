/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Operacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author familia ginart
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Operacion CrearOperacion() {
        Operacion O1 = new Operacion();
        System.out.println("Ingrese el primer numero");
        O1.setNum1(leer.nextInt());
        System.out.println("----------");
        System.out.println("Ingrese el siguiente numero");
        O1.setNum2(leer.nextInt());
        System.out.println("----------");
        return O1;
    }

    public void Sumar(Operacion O1) {
        O1.setSuma(O1.getNum1() + O1.getNum2());
        System.out.println("La suma de los numeros es :");
        System.out.println(O1.getSuma());
        System.out.println("----------");
    }

    public void Restar(Operacion O1) {
        O1.setResta(O1.getNum1() - O1.getNum2());
        System.out.println("La resta de los numeros es :");
        System.out.println(O1.getResta());
        System.out.println("----------");
    }

    public void Multiplicacion(Operacion O1) {
        if (O1.getNum1() == 0 || O1.getNum2() == 0) {
            System.out.println("El resultado es 0 ERROR");
        } else {
            O1.setMulti(O1.getNum1() * O1.getNum2());
            System.out.println("El resultado de la Multiplicacion es :");
            System.out.println(O1.getMulti());
            System.out.println("----------");
        }
    }

    public void Divicion(Operacion O1) {
        if (O1.getNum1() == 0 || O1.getNum2() == 0) {
            System.out.println("El resultado es 0 ERROR");
        } else {
            O1.setDivicion(O1.getNum1() / O1.getNum2());
            System.out.println("El resultado de la divicion es :");
            System.out.println(O1.getDivicion());
            System.out.println("----------");
        }
    }
}
