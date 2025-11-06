package itszn.edu.mx.jugandoarreglos.jugandoarreglos;

public class OperacionesArreglos {
    
    //Desarrollar una función que reciba un arreglo de números decimales y regrese la sumatoria
    public float calcularSuma(float[] num){
        float suma = 0f;
        //Recorrer el arreglo
        for(int i = 0; i < num.length; i++){
            suma = suma + num[i];
        }
        return suma;
    }
    
    //Desarrollar una función que reciba un arreglo de números decimales y regrese el promedio.
    public float promedio(float[] num){
        float suma = 0f;
        float promedio = 0f;
        //Recorrer el arreglo
        for(int i = 0; i < num.length; i++){
            suma = suma + num[i];
        }
        promedio = suma / num.length;
        return promedio;
    }
    
    /*Desarrollar una función que reciba un arreglo de números decimales y un límite 
    y regrese la cantidad de elementos que excedan el límite.
    */
    public float calcularLimite(float[] num, float lim){
        
        if (num == null){
            return 0f;
        }
        float excedente = 0;
        //Recorrer el arreglo
        for(int i = 0; i < num.length; i++){
            
            if (num[i] > lim) {
                excedente = excedente + i;
            }
        }
        
        return excedente;
    }
    
        /*Desarrollar una función que reciba un arreglo de números decimales y un arreglo invertido. 
    Por ejemplo, si el arreglo es 2, 1, 9 y 6, regresará 6, 9, 1 y 2.
    */
    
     public float[] RecorridoInvertido(float[] arreglo) {
         if (arreglo==null){
           return new float[0];
       }
        int n = arreglo.length;
        float[] invertido = new float[n]; // nuevo arreglo para guardar los valores invertidos
        for (int i = 0; i < n; i++) {
            invertido[i] = arreglo[n - 1 - i]; // copia desde el final hacia el inicio
        }
        return invertido;
    }
     /*Desarrollar una función que reciba un arreglo de números decimales y un arreglo con los valores absolutos. 
    Por ejemplo, si el arreglo es 2, -3, -4 y 5, regresará 2, 3, 4 y 5.
    */  
    public float[] ArregloAbsoluto(float[] arreglo) {
       if (arreglo==null){
        return new float[0];
       }
        int n = arreglo.length;
        float[] absolutos = new float[n];
        for (int i = 0; i < n; i++) {
            absolutos[i] = Math.abs(arreglo[i]); // Math.abs devuelve el valor absoluto
        }
        return absolutos;
    }


    
}
