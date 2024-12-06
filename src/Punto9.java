import java.util.ArrayList;
import java.util.List;

public class Punto9 {
    public static void main(String[] args) {
        String[] datos = {"Antony", "32", "Fredy", "33", "Maria", "23"};
        List<String> nombres = new ArrayList<>();
        List<String> edades = new ArrayList<>();
        for (int i = 0; i < datos.length; i++) {
            if (i % 2 == 0) { // Índices pares son nombres
                nombres.add(datos[i]);
            } else { // Índices impares son edades
                edades.add(datos[i]);
            }
        }
        System.out.println("Nombres: " + nombres);
        System.out.println("Edades: " + edades);
    }
}