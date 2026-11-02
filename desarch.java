import java.util.Scanner;

public class desarch {

    public static double calcularTiempo(double tamaño, double velocidad) {
        return tamaño / velocidad;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("CALCULADORA DE TIEMPO DE DESCARGA");

        System.out.print("Ingresa el tamaño del archivo en MB: ");
        double tamaño = teclado.nextDouble();

        System.out.print("Ingresa la velocidad de descarga en MB/s: ");
        double velocidad = teclado.nextDouble();

        if (tamaño < 0) {
            System.out.println("Error: El tamaño del archivo no puede ser negativo.");
        } else if (velocidad <= 0) {
            System.out.println("Error: La velocidad debe ser mayor que cero.");
        } else {

            double tiempo = calcularTiempo(tamaño, velocidad);

            System.out.println("El tiempo estimado de descarga es: " + tiempo + " segundos.");
        }
    }


}
