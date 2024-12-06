public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Metodo imprime datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
    }

    public static void main(String[] args) {

        Persona persona1 = new Persona("Maria", 36, 1.63);
        Persona persona2 = new Persona("Manolo", 21, 1.75);

        System.out.println("Datos de Persona 1:");
        persona1.imprimirDatos();
        System.out.println();

        System.out.println("Datos de Persona 2:");
        persona2.imprimirDatos();
    }
}