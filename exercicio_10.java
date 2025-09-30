package atividade12B;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("digite seu primeiro numero real:");
        double n1=sc.nextDouble();
        System.out.println("digite seu segundo numero real:");
        double n2=sc.nextDouble();
        System.out.println("digite seu terceiro numero real:");
        double n3=sc.nextDouble();
        double media = (n1+n2+n3) /3;
        System.out.println("a sua media aritmetica e:"+media);

    }
}
