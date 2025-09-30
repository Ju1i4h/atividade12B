package atividade12B;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //solicite ao usuario que adicione um numero
        System.out.println("adicione o primeiro numero:");
        int numero1= sc.nextInt();
        System.out.println(("o primeiro numero sera:"+numero1));
        //solicite ao usuario que adicione um segundo numero
        System.out.println("digite o segundo numero:");
        int numero2= sc.nextInt();
        System.out.println("o segundo numero sera:"+numero2);
        int soma= numero1+numero2;
        System.out.println("soma sera:"+soma);
    }
}
