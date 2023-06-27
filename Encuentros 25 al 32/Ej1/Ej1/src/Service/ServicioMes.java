//Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año, en minúsculas. 
//A continuación, declara una variable mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
//El programa debe pedir al usuario que adivine el mes secreto. 
//Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  
//Un ejemplo de ejecución del programa podría ser este:
//Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
//
//No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
//
//¡Ha acertado!
package Service;
import Entidad.Mes;
import java.util.Scanner;

public class ServicioMes {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Mes mes = new Mes();
    public void Juego() {
        String mess = mes.getHimitsu();
        String[] mess2 = new String[mes.getHimitsu().length()];
        mess2 = mes.getMes();
        boolean valor = true;
        do {
            System.out.println("Cual mes crees que es?\n ");
            String adivina = leer.next().toLowerCase();
            for (int i = 0; i < 11; i++) {
                if (adivina.equals(mess)) {
                    System.out.println("Lo lograste!!");
                    valor = false;
                    break;
                } else {
                    System.out.println("Ese no es! Intente de nuevo");
                    break;
                }
            }
        } while (valor);
    }
}
