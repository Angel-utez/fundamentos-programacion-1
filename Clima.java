
import java.util.Scanner;
public class Clima {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("SISTEMA DEL CLIMA");

        System.out.printf("Imprima la temperatura en grados Celsius: ");
        double tem = teclado.nextDouble();

        if (tem <10){
            System.out.println("Frio extremo");
        } else if (tem <=20){
            System.out.println("Clima fresco");
        } else if (tem <=30){
            System.out.println("Clima Agradable");
        } else {
            System.out.println("Calor extremo");
        }
    }
}
