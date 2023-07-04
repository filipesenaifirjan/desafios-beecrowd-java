package desafios;
import java.util.Scanner;

public class Desafio1017 {
    

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int horas, velocidade;
        double distancia, combustivel=12.0;

        horas=scan.nextInt();
        velocidade=scan.nextInt();

        distancia=(velocidade*horas)/combustivel;

        System.out.printf("%.3f\n", distancia);

        scan.close();

    } 
}