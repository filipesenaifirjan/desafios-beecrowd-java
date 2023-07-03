package desafios;
import java.util.Scanner;


public class Desafio1002 {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        double n=3.14159;
        double raio = scan.nextDouble();
        double area=n*(double)(Math.pow(raio, 2));       
         
        System.out.printf("A=%.4f %n",area);  
        
        scan.close();
    }   
}