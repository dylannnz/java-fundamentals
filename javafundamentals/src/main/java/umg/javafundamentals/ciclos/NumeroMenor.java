package umg.javafundamentals.ciclos;

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Programa que muestra el número menor de N números");
        System.out.println("¿Cuántos números quiere evaluar?");
        int cantidad = teclado.nextInt();
        
        System.out.println("Ingrese el primer número:");
        int numMenor = teclado.nextInt();
        
        // Ciclo For (Para i=2 hasta cantidad, incrementando de 1 en 1)
        for (int i = 2; i <= cantidad; i++) {
            System.out.println("Ingrese un número:");
            int nuevo = teclado.nextInt();
            
            // Condicional interno
            if (nuevo < numMenor) {
                numMenor = nuevo;
            }
        }
        
        System.out.println("El número menor es: " + numMenor);
        teclado.close();
    }
}
