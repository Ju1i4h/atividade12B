package atividade12B;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Solicitar ao usuario que insira o número de dias
        System.out.print("Digite a quantidade de dias: ");
        int dias = sc.nextInt();
        int horas = dias * 24;
        System.out.println(dias + " dias equivalem a " + horas + " horas.");
        sc.close();
    }
}
