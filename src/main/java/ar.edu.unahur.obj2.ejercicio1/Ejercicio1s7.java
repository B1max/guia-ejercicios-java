package ar.edu.unahur.obj2.ejercicio1;


import java.util.Random;

public class Ejercicio1s7 {
    public static void main(String[]args){
        mostrarMatriz(cargarMatriz());
    }
    private static int[][] cargarMatriz(){
        int[][] matriz = new int[10][10];
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0;j < matriz[0].length;j++){
                Random r = new Random();
                int aleatorio = r.nextInt(100);
                matriz[i][j] = aleatorio;
            }
        }
        return matriz;
    }
    private static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0;j < matriz[0].length;j++) {
                String espacio = "   ";
                if (matriz[i][j] > 9){
                    espacio = "  ";
                }
                System.out.format("%d"+espacio, matriz[i][j]);
            }
            System.out.println();
        }
    }
}
