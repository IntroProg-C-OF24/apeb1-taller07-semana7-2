import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion, limitCli, i;
        double descuento1, descuento2, costoCompu, costoFinal;
        String nombCli;
        i = 1;
        limitCli = 7;
        while (i <= limitCli){
            System.out.println("Ingrese el nombre del cliente: ");
            nombCli = teclado.next();
            System.out.println("Ingrese el costo de la computadora: ");
            costoCompu = teclado.nextDouble();
            System.out.println("¿Qué tipo de cliente es usted? 1/2: "); 
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cliente tipo 1");  
                    System.out.println("Compra de un computador con precio de " + costoCompu);
                    costoFinal = (costoCompu * 0.10);
                    System.out.println("El costo final es de " + costoFinal);
                    break;
                case 2:
                    System.out.println("Cliente tipo 2");
                    System.out.println("Compra de un computador con precio de " + costoCompu);
                    costoFinal = (costoCompu * 0.20);
                    System.out.println("El costo final es de " + costoFinal);
                    break;
                case 3:
                    System.out.println("Compra de un computador con precio de " + costoCompu);
            }
            i = i + 1;
        }       
    }    
}
