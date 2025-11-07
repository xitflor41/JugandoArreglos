/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itszn.edu.mx.jugandoarreglos.jugandoarreglos;
import java.util.Arrays;


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
        
        float[] arreglo = {9,6,1,2};
        float[] invertido = op.RecorridoInvertido(arreglo);
        System.out.println("El arreglo invertido " + Arrays.toString(invertido));

        float[] arregloAbs = {2,-3,-5,6};
        float[] absolutos = op.ArregloAbsoluto(arregloAbs);
        System.out.println("Los numeros absolutos son " + Arrays.toString(absolutos));
        
    }
}
