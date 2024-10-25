/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Esta es la clase Cuenta 
 * @author sebas
 */
public class Cuenta {
    private double saldo;

    /**
     *  Constructor Vacio 
     */
    public Cuenta() {
    }

    /**
     * Constructor lleno 
     * @param saldo
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     *  Getter 
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter 
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo para depositar 
     * @param monto
     */
    public void depositar(double monto) {
        saldo += monto;
    }

    /**
     * Metodo para retirar dinero 
     * @param monto
     * @throws SaldoInsuficienteException
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo)
            throw new SaldoInsuficienteException("Saldo insuficiente para retiro");
        else
            saldo -= monto;
    }

    /**
     * Metodo para consultar tu saldo 
     * @return
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}

