package umg.javafundamentals.condicionales;
import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba el numero de dia:");
        int dia = sc.nextInt();
        
        // Estructura de Condición Múltiple
        switch (dia) {
            case 1: 
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miercoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Viernes");
                break;
            case 6: 
                System.out.println("Sabado");
                break;
            case 7: 
                System.out.println("Domingo");
                break;
            default: 
                System.out.println("Día de la semana no válido");
                break;
        }
        
        sc.close();
    }
}

