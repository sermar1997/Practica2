/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

/**
 *
 * @author Sergio
 */
public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(String nombre, String numCuenta, double saldo, double interes) {
        super(nombre, numCuenta, saldo, 0);
        this.interes = interes;
    }

    public CuentaAhorro(String nombre, String numCuenta, double interes) {
        super(nombre, numCuenta);
        this.interes = interes;
    }

    public double getInteres() {
        return this.interes;
    }

    public CuentaAhorro(String titular, String numCuenta) {
        super(titular, numCuenta);
        this.interes = 2.5;
    }

    public void calcularInteres() {
        setSaldo(getSaldo() - (getSaldo() * (this.interes / 100)));
    }
}
