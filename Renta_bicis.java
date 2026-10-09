import java.util.Scanner;

public class Renta_bicis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("RENTA DE BICICLETAS");
        System.out.println("1. Bicicleta urbana - $40 por hora");
        System.out.println("2. Bicicleta de montana - $60 por hora");
        System.out.println("3. Bicicleta electrica - $90 por hora");
        System.out.print("Selecciona el tipo de bicicleta: ");
        int opc = teclado.nextInt();

        int tarifa = 0;
        String tipo = "";
        boolean opcionValida = true;

        switch (opc) {
            case 1:
                tipo = "Bicicleta urbana";
                tarifa = 40;
                break;
            case 2:
                tipo = "Bicicleta de montana";
                tarifa = 60;
                break;
            case 3:
                tipo = "Bicicleta electrica";
                tarifa = 90;
                break;
            default:
                opcionValida = false;
                System.out.println("Opcion no valida");
        }

        if (opcionValida) {
            System.out.print("Cantidad de horas de renta: ");
            int horas = teclado.nextInt();

            if (horas > 0) {
                System.out.print("Tiene membresia? (true/false): ");
                boolean membresia = teclado.nextBoolean();

                double subtotal = tarifa * horas;
                double descuento = 0;
                if (membresia) {
                    descuento = subtotal * 0.20;
                }
                double total = subtotal - descuento;

                System.out.println("Ticket de venta");
                System.out.println("Tipo de bicicleta: " + tipo);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);
            } else {
                System.out.println("La cantidad de horas debe ser mayor que cero.");
            }
        }

    }
}
