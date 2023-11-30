public class Ejercicio07 {
    public static void main(String[] args) {
        int i, n;
        float num, dem;
        double div, rta, result;
        rta = 0;
        i = 1;
        n = 10;
        num = 1;
        dem = 0;
        result = 0;
        while (i <= n){
            num = num * (-1);
             System.out.print("("+num + "/" + dem + ") + ");
            dem = dem + 1;
            div = (num / dem);
            rta = div;
            result = (result + rta);
            i = i + 1;
        }   
        System.out.println("Sumatoria total: " + result);
    }
    
}
