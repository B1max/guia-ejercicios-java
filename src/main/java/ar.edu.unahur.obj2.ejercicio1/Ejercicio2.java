package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio2 {
    int[] los20 = {6,64,27,45,7,8,9,54,4,3,56,16,27,788,99,0,7655,62,854};
    int ingreso = 30;
    public int[] ObtenerMayor (int[] arrr){
        int[] resultado = new int[20];
        int indice = 0;
        int mayor;
        mayor = arrr[0];
        int puntero = 0;

        while (puntero < arrr.length) {
            if (arrr[puntero] > mayor) {
                resultado[indice] = arrr[puntero];
                indice++;
            }
            puntero++;
        }
        return resultado;
    }

}
