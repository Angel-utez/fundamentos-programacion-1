

import java.util.Scanner;
public class elevador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingeese el numero de pisos");
        int pisoini = teclado.nextInt();
        System.out.println("ingrese el numero del piso");
        int pisofin = teclado.nextInt();

        if (pisoini == 0 || pisofin == 0) {
            System.out.println("no se admite piso 0");

        } else if (pisoini <= pisofin) {
            while (pisoini <= pisofin) {
                System.out.println(pisoini);
                System.out.println("Usted esta subiendo de piso en el elevador");
                pisoini += 1;
            }
        } else if (pisofin >= pisoini) {
            while (pisofin >= pisoini) {
                System.out.println("bajando en el elevador ");
                System.out.println(pisoini);
                System.out.println("usted esta bajando de piso");
                pisoini--;
            }
        }
        System.out.println("a llegado a su destino(piso):" + pisofin);
    }
}

