package atividade12B;

import java.util.Scanner;

public class Bexercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("adicione o primeiro numero:");
        double numero1= sc.nextInt();
        double pi = 3.14;
        double resultado = 0;
        resultado = numero1*pi;
        System.out.printf("a area sera %.2f%n" ,resultado*2);
    }
}
