/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itszn.edu.mx.jugandoarreglos.jugandoarreglos;

/**
 *
 * @author LENOVO
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op = new OperacionesArreglos();
        
        float[] pesos = {12f, 45f, 3.5f};
        float sum = op.calcularSuma(pesos);
        System.out.println("La suma es " + sum);
        
        float prom = op.promedio(pesos);
        System.out.println("El promedio es " + prom);
        
        float lim = 5f;
        float limites = op.calcularLimite(pesos, lim);
        System.out.println("Los elementos excedidos son " + limites);
        
    }
}
