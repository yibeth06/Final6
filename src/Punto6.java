import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de la tabla de multiplicar:");

        int numero = scanner.nextInt();
        int contador = 1;
        while (contador <= 20) {

            System.out.println(numero + " x " + contador + " = " + (numero * contador));

            contador++;

        }
        scanner.close();
    }
}

