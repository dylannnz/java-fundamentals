package umg.javafundamentals.ciclos;
import java.util.Scanner;

public class CalcularAreas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        double base, altura, radio, area;
        
        // PSeInt: Mientras op <> 4 Hacer
        while (op != 4) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Triangulo");
            System.out.println("2. Circulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Salir");
            op = teclado.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Ingrese la base:");
                    base = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();
                    area = (base * altura) / 2;
                    System.out.println("El area del triangulo es: " + area);
                    break;
                case 2:
                    System.out.println("Ingrese el radio:");
                    radio = teclado.nextDouble();
                    // Utilizamos la constante nativa Math.PI
                    area = Math.PI * radio * radio; 
                    System.out.println("El area del circulo es: " + area);
                    break;
                case 3:
                    System.out.println("Ingrese la base:");
                    base = teclado.nextDouble();
                    System.out.println("Ingrese la altura:");
                    altura = teclado.nextDouble();
                    area = base * altura;
                    System.out.println("El area del rectangulo es: " + area);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        teclado.close();
    }
}

