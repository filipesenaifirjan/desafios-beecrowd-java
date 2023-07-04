package desafios;
import java.util.Scanner;


public class Desafio1016 {
    

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x, total;

        x=scan.nextInt();
        
        total=(x*2);

        System.out.printf("%d minutos\n",total);
        
        scan.close();

    }
    
}