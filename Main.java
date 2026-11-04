
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int peso;
        int tipo;
        int fragil;

        int aceptados = 0;
        int rechazados = 0;
        int fragiles = 0;

        double totalPagar;
        double recaudacion = 0;
        double costoMasAlto = 0;

        while (true) {

            System.out.print("Ingrese el peso del paquete (0 para terminar): ");
            peso = teclado.nextInt();

            if (peso == 0) {
                break;
            }

            if (peso < 0) {
                System.out.println("Peso negativo. Intente nuevamente.");
            } else {


                do {
                    System.out.println("Tipo de envio:");
                    System.out.println("1. Local");
                    System.out.println("2. Nacional");
                    System.out.println("3. Express");
                    System.out.print("Seleccione una opcion: ");
                    tipo = teclado.nextInt();

                    if (tipo < 1 || tipo > 3) {
                        System.out.println("Opcion no valida. Intente nuevamente.");
                    }

                } while (tipo < 1 || tipo > 3);

                if ((tipo == 1 && peso > 12) ||
                        (tipo == 2 && peso > 20) ||
                        (tipo == 3 && peso > 5)) {

                    System.out.println("Paquete rechazado por exceder el peso maximo.");
                    rechazados++;

                } else {

                    if (tipo == 1) {
                        totalPagar = 30 + (8 * peso);
                    } else if (tipo == 2) {
                        totalPagar = 50 + (12 * peso);
                    } else {
                        totalPagar = 80 + (20 * peso);
                    }


                    do {
                        System.out.println("¿El paquete es fragil?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.print("Seleccione una opcion: ");
                        fragil = teclado.nextInt();

                        if (fragil != 1 && fragil != 2) {
                            System.out.println("Opcion no valida. Intente nuevamente.");
                        }

                    } while (fragil != 1 && fragil != 2);

                    if (fragil == 1) {
                        totalPagar = totalPagar + 25;
                        fragiles++;
                    }

                    aceptados++;
                    recaudacion = recaudacion + totalPagar;

                    if (totalPagar > costoMasAlto) {
                        costoMasAlto = totalPagar;
                    }

                    System.out.println("PAQUETE ACEPTADO");

                    if (tipo == 1) {
                        System.out.println("Tipo de envio: Local");
                    } else if (tipo == 2) {
                        System.out.println("Tipo de envio: Nacional");
                    } else {
                        System.out.println("Tipo de envio: Express");
                    }

                    System.out.println("Peso: " + peso + " kg");
                    System.out.println("Total a pagar: $" + totalPagar);
                }
            }
        }


        System.out.println("RESULTADOS FINALES");
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Dinero recaudado: $" + recaudacion);
        System.out.println("Paquetes fragiles aceptados: " + fragiles);
        System.out.println("Costo mas alto: $" + costoMasAlto);


    }
}
