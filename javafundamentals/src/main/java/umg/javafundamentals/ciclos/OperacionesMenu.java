package umg.javafundamentals.ciclos;
import java.util.Scanner;

public class OperacionesMenu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1, num2, suma, resta, multi, div;
        int op;
        String continuar = "S";
        
        // PSeInt: Mientras Mayusculas(continuar) = "S" Hacer
        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("\n¿Que operacion desea calcular?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            op = teclado.nextInt();
            
            System.out.println("Ingrese el primer operando:");
            num1 = teclado.nextDouble();
            System.out.println("Ingrese el segundo operando:");
            num2 = teclado.nextDouble();
            
            switch (op) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    multi = num1 * num2;
                    System.out.println("La multiplicacion es: " + multi);
                    break;
                case 4:
                    div = num1 / num2;
                    System.out.println("La division es: " + div);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
            System.out.println("\n¿Desea continuar? S/N");
            // Limpiamos el buffer del teclado antes de leer un String
            teclado.nextLine(); 
            continuar = teclado.nextLine();
        }
        teclado.close();
    }
}

