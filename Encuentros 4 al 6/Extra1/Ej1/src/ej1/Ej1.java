//Dado un tiempo en minutos, calcular su equivalente en días y horas. 
//Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package ej1;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los segundos");
       int num = leer.nextInt();
       int minutos = num * 60;
       int horas = num / 1440;
       int dias = num / 60;
        System.out.println("Los minutos son: " + minutos);
        System.out.println("Las horas son: " + horas);
        System.out.println("Los dias son: " + dias);
    }
}
