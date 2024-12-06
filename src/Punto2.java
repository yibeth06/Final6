import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número (1, 2, o 3):");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Cuenta Corriente");
                break;
            case 2:
                System.out.println("Cuenta de Ahorro");
                break;
            case 3:
                System.out.println("Cuenta Nómina");
                break;
            default:
                System.out.println("Opción no válida");
        }
        scanner.close();
    }
}