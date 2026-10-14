package umg.javafundamentals.Cadenas;
public class ComparacionCadena {
    public static void main(String[] args) {
        String cadena1 = "UMG";
        String cadena2 = "UMG";
        
        // Uso de equals()
        System.out.println("¿cadena1 es igual a cadena2?: " + cadena1.equals(cadena2));
        
        // Uso de compareToIgnoreCase()
        String c = "UMG";
        int resultado = c.compareToIgnoreCase("umg");
        if (resultado == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        // Uso de contains()
        String parrafo = "Una secuencia de caracteres es una secuencia legible de valores de caracteres";
        System.out.println("¿Contiene 'ecue'?: " + parrafo.contains("ecue"));
        
        // Uso de indexOf()
        String saludo = "Hola mundo";
        System.out.println("Índice de 'a': " + saludo.indexOf('a'));
        System.out.println("Índice de 'e' (no existe): " + saludo.indexOf('e'));
        
        // Uso de startsWith()
        String hello = "HelloWorld";
        if (hello.startsWith("Hello")) {
            System.out.println("Empieza con la secuencia");
        } else {
            System.out.println("NO empieza con la secuencia");
        }
    }
}

