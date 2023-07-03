package desafios;
import java.util.Scanner;

public class Desafio1014 {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x;
        double y, total;

        x=scan.nextInt();
        y=scan.nextDouble();

        total=x/y;

        System.out.printf("%.3f km/l\n",total);
        
         scan.close();
        }
}