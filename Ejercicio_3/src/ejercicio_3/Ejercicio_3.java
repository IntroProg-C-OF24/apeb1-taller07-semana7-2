package ejercicio_3;
import java.util.Scanner;
public class Ejercicio_3 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nomEmp; 
	int cantDias, cantEmpleados, contador;
	double costoxDia, totalDpagar;
        contador = 1;
	cantEmpleados = 1;
	while (cantEmpleados <= 5) {
            System.out.println("Ingrese el nombre del empleado");
            nomEmp = teclado.next();
            System.out.println("Ingrese el numero de dias que trabajo");
            cantDias = teclado.nextInt();
            System.out.println("Ingrese el costo pagado por dia");
            costoxDia = teclado.nextDouble();
                System.out.println("Nombre Empleado: " + nomEmp);
                System.out.println("Numero de dias trabajados: " + cantDias);
                System.out.println("Costo por dia: " + costoxDia);
                totalDpagar = (cantDias * costoxDia);
                System.out.println("El total a pagar es: " + totalDpagar + " Dolares");
                contador = contador + 1;
        } 
    }
}

