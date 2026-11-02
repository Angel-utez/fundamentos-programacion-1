import java.util.Scanner;

public class bateria {

    public static int calcularMinutos(int porcentaje) {

        int minutos = 0;

        while (porcentaje < 100) {
            porcentaje = porcentaje + 8;
            if (porcentaje > 100) {
                porcentaje = 100;
            }
            minutos++;
        }
        return minutos;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--- SIMULADOR DE CARGA DE BATERIA ---");

            System.out.print("Ingresa el porcentaje inicial de bateria: ");
            int porcentaje = entrada.nextInt();

            if (porcentaje < 0 || porcentaje > 100) {

                System.out.println("Error: El porcentaje debe estar entre 0 y 100.");

            } else {
                int minutos = calcularMinutos(porcentaje);

                System.out.println("Minutos necesarios para completar la carga: " + minutos);
            }
            System.out.println("\n¿Deseas realizar otra simulacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();

        } while (opcion == 1);

        System.out.println("Programa finalizado.");

    }


}
