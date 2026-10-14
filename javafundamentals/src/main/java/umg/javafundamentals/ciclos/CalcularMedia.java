package umg.javafundamentals.ciclos;
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String numerosIngresados = "";
        double suma = 0;
        int contador = 0;
        double num = 1;
        
        System.out.println("Programa que calcula la media de una serie de numeros positivos");
        
        while (num > 0) {
            contador = contador + 1;
            System.out.println("Ingrese el numero " + contador + " de la serie.");
            System.out.println("Un valor menor o igual a cero indica la terminacion del programa");
            num = teclado.nextDouble();
            
            if (num != 0) {
                if (numerosIngresados.equals("")) {
                    numerosIngresados = String.valueOf(num);
                } else {
                    numerosIngresados = numerosIngresados + ", " + num;
                }
                suma = suma + num;
            }
        }
        
        System.out.println("Lista de numeros ingresados: " + numerosIngresados);
        // Evitar división por cero si el primer ingreso fue 0
        if (contador > 1) { 
            double promedio = suma / (contador - 1);
            System.out.println("El promedio de los numeros es: " + promedio);
        }
        teclado.close();
    }
}

