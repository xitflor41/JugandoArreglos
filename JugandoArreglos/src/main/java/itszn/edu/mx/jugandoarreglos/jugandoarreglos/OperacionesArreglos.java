package itszn.edu.mx.jugandoarreglos.jugandoarreglos;

public class OperacionesArreglos {
    
    //Desarrollar una función que reciba un arreglo de números decimales y regrese la sumatoria
    public float calcularSuma(float[] num){
        if (num == null){
        return 0;
        }
        float suma = 0f;
        //Recorrer el arreglo
        for(int i = 0; i < num.length; i++){
            suma = suma + num[i];
        }
        return suma;
    }
    
    //Desarrollar una función que reciba un arreglo de números decimales y regrese el promedio.
    public float promedio(float[] num){
        if (num == null){
        return 0;
    }
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
    public int calcularLimite(float[] num, float lim){
    if (num == null){
        return 0;
    }
    int excedente = 0;
    for(int i = 0; i < num.length; i++){
        if (num[i] > lim) {
            excedente++;
        }
    }
    return excedente;
}

    
        /*Desarrollar una función que reciba un arreglo de números decimales y un arreglo invertido. 
    Por ejemplo, si el arreglo es 2, 1, 9 y 6, regresará 6, 9, 1 y 2.
    */
    public float[] RecorridoInvertido(float[] arreglo) {
        if (arreglo == null) return new float[0];

        int n = arreglo.length;
        float[] invertido = new float[n];

        for (int i = 0; i < n; i++){
            invertido[i] = arreglo[n - 1 - i];
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
