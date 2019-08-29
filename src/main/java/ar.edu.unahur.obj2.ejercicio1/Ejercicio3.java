package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio3 {
    public static void main (String[]args){
        double[] temperaturas = {12,13,14,15,16,17,18,19,20,21,22,23,22,21,25,21,25.1,19,18,17,16,15,14,13};
        mostrarTemperaturas(temperaturas);
    }

    public static double menor(double[] arrr){
        double men = arrr[0];
        int indice = arrr.length-1;
        while (indice >= 0){
            if(arrr[indice] < men){
                men = arrr[indice];
            }
            indice --;
        }
        return men;
    }
    public static double mayor (double[] arrr){
        double may = arrr[0];
        int indice = arrr.length-1;
        while (indice >0){
            if(arrr[indice] > may){
                may = arrr[indice];
            }
            indice --;
        }
        return may;
    }
    public static void mostrarTemperaturas(double[]arrr){
        for (int i = 0; i <= arrr.length-1;i++){
            for(int j = 0; j <(int)arrr[i];j++){
                System.out.print("*");
            }
            System.out.print(" " + arrr[i] + "º");
            if(arrr[i]==menor(arrr)){
                System.out.print(" <-Menor");
            }
            if(arrr[i]==mayor(arrr)){
                System.out.print(" <-Mayor");
            }
            System.out.println();
        }
    }
}
