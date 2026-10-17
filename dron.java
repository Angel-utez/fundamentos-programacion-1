import java.util.Scanner;

public class dron {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int bateria;
        int minuto = 1;

        System.out.print("Bateria inicial: ");
        bateria = teclado.nextInt();

        while (bateria >= 7) {
            bateria = bateria - 7;

            System.out.println("Minuto " + minuto + " -> " + bateria + "%");

            minuto++;
        }
    }
}