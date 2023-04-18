//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
package ej3;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una vocal");
        String frase = leer.nextLine(); 
        if (frase.equals("A") || frase.equals("E") ||frase.equals("I") || frase.equals("O") || frase.equals("U")){
            System.out.println("Correcto");
        }
        else {
            System.out.println("Incorrecto");
        }
    } 
}

