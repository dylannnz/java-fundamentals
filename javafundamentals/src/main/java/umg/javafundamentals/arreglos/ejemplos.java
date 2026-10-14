
package umg.javafundamentals.arreglos;
import java.util.Scanner;

public class ejemplos {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {      
       ejercicio2(); 
    } 
    public static void ejemplo1() {
        String[] nombres = new String [5];
        for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese un nombre");
        nombres[i] = sc.nextLine();
        }
        
        System.out.println("Orden iverso...");
        for (int i=4; i>=0;i--) {
        System.out.println(nombres[i]);
        }
    }
    
    public static void ejercicio1() {
        int[] numeros = new int [5];
        for (int i = 0; i < 5; i++) {
        System.out.println("Ingrese un nuevo numero: ");
        numeros[i] = sc.nextInt();
        }
        System.out.println("|Indice|Valor|Reslutado|");
        for (int i=0; i<5;i++) {
            if (i==4) {
            System.out.println("|"+i+"|"+numeros[i]+"|"+numeros[i]*numeros[i+1]+"|");
            }
            else {
            System.out.println("|"+i+"|"+numeros[i]+"|"+numeros[i]+"|");
            }
        } 
    }
    
    public static void ejercicio2() {
        System.out.println("Cuantos numeros desea ingresar?");
        int num = sc.nextInt();
        float numeros[] = new float [num];
        
        for (int i = 0; i < num; i++) {
        System.out.println("Ingrese un nuevo numero: ");
        numeros[i] = sc.nextFloat();
        }
        
        float suma = 0;
        float promedio = 0;
        float multi = 1;
        
        for (int i=0; i<num ;i++) {
            suma = numeros[i] + suma;
            multi = numeros[i] * multi;
            
        } 
        promedio = suma/num;
        System.out.println("La suma es: "+ suma);
        System.out.println("La multiplicacion es: "+ multi);
        System.out.println("El promedio es: "+ promedio);
    }
}
