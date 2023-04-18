//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
//y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se 
//indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
//a e i o u
//@ # $ % *
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. 
//Utilice la estructura “según” para la transformación.
package ej.guia1;
import java.util.Scanner;

public class EjGuia1 {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in);
        
        String frase;
        String retorno;
        System.out.println("Ingrese frase:");
        frase = leer.nextLine();
        
        retorno = codificarFrase(frase);
        
        System.out.println("Frase original:"+ frase);
        System.out.println("Frase Modificada:"+retorno);
        System.out.println(frase.charAt(0));
    }
    public static String codificarFrase(String fraseACodificar)
    {
        String fraseCodificada;
        int largoFrase;
        fraseCodificada= "";
        fraseACodificar = fraseACodificar.toUpperCase();
        largoFrase= fraseACodificar.length();
         for (int i = 0; i < largoFrase; i++)
         {
            switch (fraseACodificar.substring(i,i+1))
              {            
                  case"A":
                     
                  fraseCodificada = fraseCodificada.concat("@");                      
                      break;
                  case"E":
                  fraseCodificada = fraseCodificada.concat("#");  
                      break;
                  case"I":
                  fraseCodificada = fraseCodificada.concat("$"); 
                      break;
                  case"O":
                  fraseCodificada = fraseCodificada.concat("%");                      
                      break;
                  case"U":
                  fraseCodificada = fraseCodificada.concat("*");                        
                      break;
                  default:
                  fraseCodificada = fraseCodificada.concat(fraseACodificar.substring(i,i+1));
              }      
        }
        return fraseCodificada;
    }
}
