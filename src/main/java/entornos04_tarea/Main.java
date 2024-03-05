/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornos04_tarea;

/**
 *
 * @author Manuel Orobitg
 */
public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
}
