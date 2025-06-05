
package proyect01_clase03_dataops;

import java.util.Scanner;
public class Proyect01_clase03_dataops {

    public static void main(String[] args) {
        // TODO code application logic here
         // Declarar variables
        double num1, num2, suma, promedio;
        Scanner lectura = new Scanner(System.in);
        
        // Entrada de datos
        System.out.print("Ingresar número 1: ");
        num1 = lectura.nextDouble();
        System.out.print("Ingresar número 2: ");
        num2 = lectura.nextDouble();
        
        // Proceso de datos
        suma = num1 + num2;
        promedio = suma / 2;
        
        // Salida de datos
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
    }
    
}
    
