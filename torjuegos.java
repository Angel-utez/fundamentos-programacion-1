
import java.util.Scanner;

public class torjuegos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int puntos;
        int acumulados = 0;
        int mayores1000 = 0;
        int menoresIguales1000 = 0;
        double promedio;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingresa los puntos de la partida " + i + ": ");
            puntos = teclado.nextInt();

            acumulados += puntos;

            if (puntos > 1000) {
                mayores1000++;
            } else {
                menoresIguales1000++;
            }
        }

        promedio = acumulados / 7.0;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Puntos acumulados: " + acumulados);
        System.out.println("Promedio de puntuación: " + promedio);
        System.out.println("Partidas con más de 1000 puntos: " + mayores1000);
        System.out.println("Partidas con 1000 puntos o menos: " + menoresIguales1000);
    }
}

