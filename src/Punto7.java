import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double nota;

        do {
            System.out.println("Ingrese una nota ò -1 para terminar:");
            nota = scanner.nextDouble();

            if (nota != -1) {
                if (nota >= 0) {
                    suma += nota;
                    contador++;
                } else {
                    System.out.println("Nota no válida. Ingrese un valor positivo o -1 para salir.");
                }
            }
        } while (nota != -1);

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio de las notas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }

        scanner.close();
    }
}