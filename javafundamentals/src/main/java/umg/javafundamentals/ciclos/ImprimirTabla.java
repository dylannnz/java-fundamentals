package umg.javafundamentals.ciclos;
import java.util.Scanner;

public class ImprimirTabla {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escriba el numero para la tabla de multiplicar:");
        int num = teclado.nextInt();
        
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (i * num));
            i = i + 1;
        }
        teclado.close();
    }
}