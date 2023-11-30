import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String alum;
        double nota, numAlum;
        int i;
        i = 1;
        numAlum = 1;
        while (i < 3) {
            System.out.println("Ingrese el nombre del estudiante: ");
        alum = teclado.next();
        System.out.println("Ingrese el promedio final del estudiante: ");
        nota = teclado.nextDouble();
        if (nota >= 7 && nota <= 10) { 
            System.out.println("Estudiante: " + alum);
            System.out.println("Promedio: " + nota);
            System.out.println("Aprobado");
        }else{
               System.out.println("Estudiante: " + alum);
            System.out.println("Promedio: " + nota);
            System.out.println("Reprobado");
            i = i + 1;
            }
        }
    }
}
