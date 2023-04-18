//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
package extra.pkg4;
import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int opciones = leer.nextInt();
            switch (opciones){
                case 1:
                 System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                default:
                    break;
       }
      }
    }