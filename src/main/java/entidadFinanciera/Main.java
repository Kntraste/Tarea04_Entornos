/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manuel Orobitg
 */
public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        double cantidad = 0;
        double cantidadEsperada = 0;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        probarIngresar(objetoCuenta, cantidad, cantidadEsperada);
        
        probarRetirar(objetoCuenta, cantidad, cantidadEsperada);
        
    }

    public static void probarRetirar(CCuenta objetoCuenta, double cantidad, double cantidadEsperada) {
        try {
            objetoCuenta.retirar(cantidad);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void probarIngresar(CCuenta objetoCuenta, double cantidad, double cantidadEsperada) {
        try {
            objetoCuenta.ingresar(cantidad);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
