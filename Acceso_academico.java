
import java.util.Scanner;
public class Acceso_academico {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Acceso Academico");

        System.out.printf("Ingrese su promedio: ");
        double prom  = teclado.nextDouble();
        System.out.printf("Ingrese el total de sus asistencias ");
        double asis  = teclado.nextDouble();

        if (prom <70 && asis >=80 ){
            System.out.println("Reprobado por calificacion");
        } else if (prom >=70 && asis<80){
            System.out.println("Reprobado por asistencia");
        } else if (prom <70 && asis<80){
            System.out.println("Reprobado por promedio y asistencia");
        } else {
            System.out.println("Aprobado regular");
        }
    }
}
