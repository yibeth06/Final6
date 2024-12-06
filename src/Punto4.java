public class Punto4 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares de 1 a 100 es: " + suma);
    }
}