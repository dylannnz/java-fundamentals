package umg.javafundamentals.poo;

import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        Galleta g1 = new Galleta();
        g1.forma = "corazon";
        g1.color = "rosado";
        
        Galleta g2 = new Galleta();
        g2.forma = "nube";
        g2.color = "rosado";
        
        Galleta g3 = new Galleta();
        g3.forma = "triangulo";
        g3.color = "amarillo";
        
        estudiantes e1 = new estudiantes ();
        e1.nombre = "Dylan";
        e1.apellido = "Zuleta";
        e1.carrera = "Sistemas";
        e1.carnet = "266134";
        e1.semestre = 2;
        
        ArrayList<estudiantes> lista = new ArrayList();
        lista.add(e1);
        
    }
}