/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *  Esta es la clase principal
 * @author sebas
 */
public class POOP10 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        int a = 5;
        int c = a / 5;
        System.out.println(c);

        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = i * 10;
        }

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción de desbordamiento de memoria.");
        }

        System.out.println("Hola, he sobrevivido.");

        try {
            float d = 4 / 0;
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética segundo caso.");
        }

        float n = miMetodoDivision(100, 2);
        System.out.println(n);

        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética permeada.");
            e.printStackTrace();
        }

        System.out.println("A pesar de todo seguimos en el programa.");
        float x = miMetodoDivision(20, 5);
        System.out.println(x);

        try {
            int w = suma(3, 7);
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción de operación no soportada.");
            System.out.println("Atributo mensaje.");
            System.out.println(e.getMessage());
        }

        try {
            Cuenta cuenta = new Cuenta(100);
            System.out.println(cuenta.consultarSaldo());
            cuenta.depositar(100);
            System.out.println(cuenta.consultarSaldo());
            cuenta.retirar(300);
            System.out.println(cuenta.consultarSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Excepción presentada: Saldo insuficiente.");
            System.out.println(e.getMessage());
        }
    }

    private static int miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0;
    }

    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operación no soportada aún.");
    }
}

