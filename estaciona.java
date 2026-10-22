
import java.util.Scanner;

public class estaciona {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas;
        int automoviles = 0;
        int conDescuento = 0;
        double pago;
        double totalRecaudado = 0;
        double promedio;

        System.out.println("ESTACIONAMIENTO");

        System.out.print("Ingrese las horas estacionado (0 para terminar): ");
        horas = teclado.nextInt();

        while (horas != 0) {

            if (horas < 0) {
                System.out.println("Error: las horas negativas no son validas.");
            } else {
                pago = horas * 15;

                if (horas > 5) {
                    pago = pago - 10;
                    conDescuento++;
                    System.out.println("El automovil recibio un descuento de $10.");
                }

                System.out.println("Horas estacionado: " + horas);
                System.out.println("Total a pagar: $" + pago);

                automoviles++;
                totalRecaudado = totalRecaudado + pago;
            }

            System.out.print("\nIngrese las horas estacionado (0 para terminar): ");
            horas = teclado.nextInt();
        }

        System.out.println("\n Historial");
        System.out.println("Total de automoviles atendidos: " + automoviles);
        System.out.println("Total de dinero recaudado: $" + totalRecaudado);
        System.out.println("Automoviles con descuento: " + conDescuento);

        if (automoviles > 0) {
            promedio = totalRecaudado / automoviles;
            System.out.println("Promedio pagado por automovil: $" + promedio);
        } else {
            System.out.println("No se atendieron automoviles.");
        }
        
    }
}

