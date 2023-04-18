//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
//A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
package ej2;
import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese los valores iniciales");
             System.out.println("Valores iniciales");     
             int A = 1, B = 2, C = 3, D = 4, AUX;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C = " + B);
        System.out.println("C toma el valor de A = " + C);
        System.out.println("A toma el valor de D = " + A);
        System.out.println("D toma el valor de B = " + D);    
    }
    
}
