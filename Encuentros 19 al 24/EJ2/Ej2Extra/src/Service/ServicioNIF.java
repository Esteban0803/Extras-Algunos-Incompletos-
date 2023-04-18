//Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
//Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. En NIFService se dispondrá de los siguientes métodos:
//Métodos getters y setters para el número de DNI y la letra.
//Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
//Una vez calculado, le asigna la letra que le corresponde según
//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
//La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera:
//Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
//El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente.
package Service;
import Entidad.NIF;
import java.util.Scanner;

public class ServicioNIF {

    private static Scanner leer = new Scanner(System.in);
    NIF n1 = new NIF();
    public void crearNif() {
        System.out.println("Ingrese su DNI");
        n1.setDni(leer.nextLong());
        long DNI = n1.getDni();
        String[] Letra = new String[23];
        Letra[0] = "T";
        Letra[1] = "R";
        Letra[2] = "W";
        Letra[3] = "A";
        Letra[4] = "G";
        Letra[5] = "M";
        Letra[6] = "Y";
        Letra[7] = "F";
        Letra[8] = "P";
        Letra[9] = "D";
        Letra[10] = "X";
        Letra[11] = "B";
        Letra[12] = "N";
        Letra[13] = "J";
        Letra[14] = "Z";
        Letra[15] = "S";
        Letra[16] = "Q";
        Letra[17] = "V";
        Letra[18] = "H";
        Letra[19] = "L";
        Letra[20] = "C";
        Letra[21] = "K";
        Letra[22] = "E";
        int dividir = (int) (DNI % 23);
        String ln = Letra[dividir];
        n1.setLetra(ln);
    }
    public void mostrar() {
        System.out.println(n1.getDni() + "---" + n1.getLetra());
    }
}
