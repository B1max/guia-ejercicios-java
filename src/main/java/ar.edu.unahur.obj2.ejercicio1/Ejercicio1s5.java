package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1s5 {
    public static void main(String[]args){
        String[] nombre = {"dario","cesar", "leandro"};
        System.out.println(buscar('a', nombre));

    }

    private static String buscar(char letra, String[] nombres){
        int indice = 0;
        String retorno = "No encontrado";
        while(indice < nombres.length) {
            if(nombres[indice].charAt(0) == letra){
                retorno = nombres[indice];
                break;
            }
            indice++;
        }
        return retorno;
    }
}
