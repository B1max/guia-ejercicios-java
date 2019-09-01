package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1s5 {
    public static void main (String[]args){
        String texto = "By using this site you are agreeing to the use of cookies and related technologies " +
                "to personalize and enhance your experience of using eveonline.com, allowing us to serve you c" +
                "ontent and marketing that best suit your preferences through the data we collect.";
        char letraBuscada = '.';
        System.out.println("El caracter " + letraBuscada + " se encuentra " + contarLetra(letraBuscada, texto)+" veces");
    }
    private static int contarLetra (char letra, String txt){
        if (txt.length() == 1){
            if(txt.charAt(0) == letra){
                return 1 ;
            }else{
                return 0;
            }
        }else{
            String izq = txt.substring(0, (txt.length()/2));
            String der = txt.substring((txt.length())/2);
            return contarLetra(letra,izq )+ contarLetra(letra,der) ;
        }
    }
}
