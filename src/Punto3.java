public class Punto3 {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;
        double c = 2.0;
        double suma = a + b + c;
        double resta = a - b - c;
        double multiplicacion = a * b * c;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        try {
            double division = (a + b) / c;
            System.out.println("División: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida");
        }
    }
}