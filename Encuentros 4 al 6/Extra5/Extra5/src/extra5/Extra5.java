//Una obra social tiene tres clases de socios:
//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

package extra5;
import java.util.Scanner;

public class Extra5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el costo del tratamiento");
            int num = leer.nextInt();
            System.out.println("MENU: ");
            System.out.println("1 - Socio A ");
            System.out.println("2 - Socio B");
            System.out.println("3 - Socio C");
            int tratamiento = leer.nextInt();
           switch (tratamiento){
               case 1:
                   System.out.println("Su descuento es del 50%, Total: " + (num / 2));
                   break;
               case 2:
                   System.out.println("Su descuendo es del 35%, Total:" + (num / 1.5));
                   break;
               case 3:
                   System.out.println("Disculpe, usted no tiene acceso a descuentos");
                   break;
               default:
                       System.out.println("Usted no eligio una opcion correcta");
                       break;
           }
    }
}
