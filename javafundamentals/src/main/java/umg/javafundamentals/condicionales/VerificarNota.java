
package umg.javafundamentals.condicionales;


import java.util.Scanner;

public class VerificarNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba la nota del alumno:");
        // En Java declaramos e inicializamos en la misma línea
        int nota = sc.nextInt(); 
        
        // Estructura Condicional
        if (nota >= 61) {
            System.out.println("Aprobó");
        } else {
            System.out.println("Reprobó");
        }
        
        sc.close();
    }
}
