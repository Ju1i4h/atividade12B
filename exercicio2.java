package atividade12B;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //peca ao usuario que adicione um numero
        System.out.println("adicione o pimeiro numero:");
        double numero1= sc.nextInt();
        double soma = numero1*2;
        System.out.println("Seu dobro e de "+soma );
    }
}
