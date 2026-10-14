package umg.javafundamentals.ciclos;
import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números a sumar:");
        int cantidad = sc.nextInt();
        
        int contador = 1;
        int suma = 0; // Este es nuestro acumulador
        
        // Ciclo While (Mientras)
        while (contador <= cantidad) {
            System.out.println("Ingrese el número a sumar:");
            int num = sc.nextInt();
            
            suma = suma + num;
            contador = contador + 1; // En Java también puedes escribir contador++;
        }
        
        System.out.println("La suma total es: " + suma);
        sc.close();
    }
}
