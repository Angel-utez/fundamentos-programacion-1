import java.util.Scanner;

public class envpaq {

    public static void mostrarEtiqueta(int numeroGuia, String destino, double peso) {
        System.out.println("ETIQUETA DEL PAQUETE");
        System.out.println("Numero de guia: " + numeroGuia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso del paquete: " + peso + " kg");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("DATOS DEL PRIMER PAQUETE");
        System.out.print("Ingresa el numero de guia: ");
        int guia1 = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Ingresa la ciudad de destino: ");
        String destino1 = teclado.nextLine();

        System.out.print("Ingresa el peso del paquete: ");
        double peso1 = teclado.nextDouble();

        System.out.println("\nDATOS DEL SEGUNDO PAQUETE");
        System.out.print("Ingresa el numero de guia: ");
        int guia2 = teclado.nextInt();

        teclado.nextLine();

        System.out.print("Ingresa la ciudad de destino: ");
        String destino2 = teclado.nextLine();

        System.out.print("Ingresa el peso del paquete: ");
        double peso2 = teclado.nextDouble();

        mostrarEtiqueta(guia1, destino1, peso1);
        mostrarEtiqueta(guia2, destino2, peso2);
    }


}
