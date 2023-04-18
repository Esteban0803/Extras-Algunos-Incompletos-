//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
//validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
package ej.guia2;
import java.util.Scanner;

public class EjGuia2 {
public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num1;
       int num2;
       
        System.out.println("Ingrese dos numeros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        esMultiplo(num1,num2);
    }   
        public static void esMultiplo(int numA,int numB)
    {      
        if (numA>=numB)
        {
            if(numA%numB==0 )
            {
                System.out.println("Es multiplo");
            }else
            {
                System.out.println("No es multiplo");
            }   
        }else
        {
            System.out.println("El primer numero es menor al segundo");
        }
        return;
    }
}
