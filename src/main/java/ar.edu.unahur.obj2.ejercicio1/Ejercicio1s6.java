package ar.edu.unahur.obj2.ejercicio1;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1s6 {
    public static void main (String[]args) {
        mostrarMatriz(cargarMatriz());
    }
    private static int[][] cargarMatriz(){
        int[][] matriz = new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j = 0;j < 3;j++){
                Scanner myObj = new Scanner(System.in); // Create a Scanner object
                System.out.printf("Ingrese dato ["+i+"]["+j+"] :");
                int input = myObj.nextInt(); // Read user input
                matriz[i][j] = input;
            }
        }
        return matriz;
    }
    private static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i<3; i++) {
            System.out.format(" %d  %d  %d  %n", matriz[i][0], matriz[i][1], matriz[i][2]);
        }
    }
}
