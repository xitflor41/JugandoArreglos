/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.edu.mx.jugandoarreglos.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }

    private OperacionesArreglos opa;
    @BeforeEach
    public void setUp() {
        opa = new OperacionesArreglos();
    }
    
    @Test
    public void pruebaSuma1(){
        float[] entrada={10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaPromedio1(){
        float[] entrada={12f, 45f, 3.5f};
        float salidaEsperada=20.166666f;
        
        float salidaReal=opa.promedio(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaPromedio2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.promedio(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaLimite1(){
        float[] entrada={4f, 2f, 7f, 9f};
        float lim=5f;
        float salidaEsperada=2f;
        float salidaReal=opa.calcularLimite(entrada,lim);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaLimite2null(){
        float[] entrada= null;
        float lim=5f;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularLimite(entrada,lim);
        assertEquals(salidaEsperada,salidaReal);
    }
    //Invertidos
    @Test
    public void pruebaInvertidos1(){
        float[] entrada={1.2f, 3.4f, 5.6f, 7.8f};
        float[] salidaEsperada={7.8f,5.6f,3.4f,1.2f};
        
        float[] salidaReal= opa.RecorridoInvertido(entrada);
        assertArrayEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaInvertidos2nulo(){
        float[] entrada=null;
        float[] salidaEsperada={};
        
        float[] salidaReal= opa.RecorridoInvertido(entrada);
        assertArrayEquals(salidaEsperada,salidaReal);
    }
    //Absolutos
    @Test
    public void pruebaAbsoluto1(){
        float[] entrada={2f, -3f, -4f, 5f};
        float[] salidaEsperada={2f, 3f, 4f, 5f};
        
        float[] salidaReal= opa.ArregloAbsoluto(entrada);
        assertArrayEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaAbsoluto2nulo(){
        float[] entrada=null;
        float[] salidaEsperada={};
        float[] salidaReal= opa.ArregloAbsoluto(entrada);
        assertArrayEquals(salidaEsperada,salidaReal);
    }
}
