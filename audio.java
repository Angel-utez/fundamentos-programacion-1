import java.util.Scanner;

public class audio {


    public static double calcularRenta(double tarifa, double horas) {
        return tarifa * horas;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("COMPROBANTE DE RENTA");
        System.out.println("Total a pagar: $" + total);
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("RENTA DE CAMARAS");

        System.out.print("Ingresa la tarifa por hora: $");
        double tarifa = entrada.nextDouble();

        System.out.print("Ingresa la cantidad de horas de uso: ");
        double horas = entrada.nextDouble();

        if (tarifa <= 0) {
            System.out.println("Error: La tarifa debe ser mayor que cero.");
        } else if (horas <= 0) {
            System.out.println("Error: Las horas deben ser mayores que cero.");
        } else {

            double total = calcularRenta(tarifa, horas);

            mostrarComprobante(total);
        }
    }


}
