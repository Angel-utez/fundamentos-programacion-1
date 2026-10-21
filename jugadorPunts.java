
import java.util.Scanner;

public class jugadorPunts {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int puntos = 100;
        int opcion;

        while (true) {
            System.out.println(" MENU DE PUNTOS ");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    puntos = puntos + 20;
                    System.out.println("Ganaste 20 puntos.");
                    System.out.println("Puntos actuales: " + puntos);
                    break;

                case 2:
                    if (puntos >= 15) {
                        puntos = puntos - 15;
                        System.out.println("Gastaste 15 puntos.");
                        System.out.println("Puntos actuales: " + puntos);
                    } else {
                        System.out.println("No tienes suficientes puntos.");
                    }
                    break;

                case 3:
                    System.out.println("Tus puntos actuales son: " + puntos);
                    break;

                case 4:
                    System.out.println("Saliendo del juego...");
                    System.out.println("Puntos restantes: " + puntos);
                    return;

                default:
                    System.out.println("Opcion no valida. Intenta de nuevo.");
                    break;
            }
        }
    }
}
