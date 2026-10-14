package umg.javafundamentals.Cadenas;
public class Cadenas {
    public static void main(String[] args) {
        // Inicialización básica
        String umg = "UMG";
        String carrera = "Ingenieria en sistemas";
        String cadenaVacia = "";
        
        // Uso de length()
        System.out.println(umg + " tiene " + umg.length() + " caracteres");
        System.out.println(carrera + " tiene " + carrera.length() + " caracteres");
        
        // Uso de charAt()
        String nombre = "Pepito";
        char letra = nombre.charAt(0);
        System.out.println("La primera letra de Pepito es: " + letra);
        
        // Uso de isEmpty()
        System.out.println("¿La cadena está vacía?: " + cadenaVacia.isEmpty());
        
        // Uso de concat()
        String cadena1 = "Algo";
        String cadena2 = "ritmos";
        String union = cadena1.concat(cadena2);
        System.out.println("Palabra concatenada: " + union);
    }
}

