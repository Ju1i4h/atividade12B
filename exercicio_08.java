package atividade12B;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(System.in);
        System.out.print("Digite o primeiro número inteiro:");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero inteiro");
        int n2= sc.nextInt();
        int div = n1/n2;
        System.out.println("seu resultado sera:"+div);
        double div2=(double) div/2;
        System.out.println("a divisao de resto foi"+div2);
    }
}
