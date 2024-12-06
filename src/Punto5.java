import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el total de su compra:");
        double total = scanner.nextDouble();
        if (total >= 1000) {
            total *= 0.8; // Descuento del 20%
            System.out.println("El total después del descuento es: " + total);
        } else if (total >= 500 && total <1000) {
            total *= 0.9; // Descuento del 10%
            System.out.println("El total después del descuento es: " + total);
        } else {
            System.out.println("No se aplica descuento");
        }
        scanner.close();
    }
}