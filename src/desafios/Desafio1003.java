package desafios;
 import java.util.Scanner;


public class Desafio1003 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a, b, SOMA=0; 

        a=scan.nextInt();

        b=scan.nextInt();

        SOMA=a+b;

        System.out.println("SOMA = "+ SOMA);

        scan.close();

    }
    
}
