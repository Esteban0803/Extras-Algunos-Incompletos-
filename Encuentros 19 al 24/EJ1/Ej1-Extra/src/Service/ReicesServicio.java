//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos,
//llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. Luego, en RaicesServicio las operaciones
//que se podrán realizar son las siguientes:
//Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con
//los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
package Service;

import Entidad.Raices;
import java.util.Scanner;

public class ReicesServicio {
    private Scanner leer = new Scanner(System.in);
    Raices r1 = new Raices();

    public double getDiscriminante(double aa, double bb, double cc) {
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();

        double total = (b * b) - 4 * a * c;
        return total;
    }

    public boolean tieneRaices(double total) {
        if (total > 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean tieneRaiz(double total) {
        if (total == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void obtenerRaices() {
        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();
        double Dis = getDiscriminante(a, b, c);
        boolean tR = tieneRaices(Dis);
        double p1 = (-b + Math.sqrt(Dis)) / (2 * a);
        double p2 = (-b - Math.sqrt(Dis)) / (2 * a);
        if (tR) {
            System.out.println("La primera Raiz es: " + p1);
            System.out.println("La segunda Raiz es: " + p2);
        }
    }

    public void calcular() {
        boolean val1, val2;
        double Dis;
        val1 = false;
        val2 = false;
        System.out.println("Ingrese numero 'A' a calcular: ");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese numero 'B' a calcular: ");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese numero 'C' a calcular: ");
        r1.setC(leer.nextDouble());
        Dis = getDiscriminante(r1.getA(), r1.getB(), r1.getC());
        val1 = tieneRaices(Dis);
        val2 = tieneRaiz(Dis);

        if (val1 == true) {
            this.obtenerRaices();
        } else if (val2 == true) {
            this.obtenerRaices();
        } else {
            System.out.println("no tiene raiz");
        }

    }
}
