
package Operacion;


public class Operacion {
    private int num1;
    private int num2;
    private int suma;
    private int resta;
    private double divicion;
    private int multi;

    public Operacion() {
    }

    public Operacion(int num1, int num2, int suma, int resta, double divicion, int multi) {
        this.num1 = num1;
        this.num2 = num2;
        this.suma = suma;
        this.resta = resta;
        this.divicion = divicion;
        this.multi = multi;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public double getDivicion() {
        return divicion;
    }

    public void setDivicion(double divicion) {
        this.divicion = divicion;
    }

    public int getMulti() {
        return multi;
    }

    public void setMulti(int multi) {
        this.multi = multi;
    }
    
}
