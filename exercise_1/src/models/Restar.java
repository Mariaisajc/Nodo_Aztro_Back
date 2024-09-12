package models;

import domains.Operacion;

public class Restar extends Operacion {

    public Restar(double numero1, double numero2) {
        super(numero1, numero2);
    }

    @Override
    public double operar() {
        return numero1 - numero2;
    }
}
