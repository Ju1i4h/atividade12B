package atividade12B;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em graus Celsius:");
        double celsius = sc.nextDouble();
        double resultado = (celsius * 9 / 5);
        System.out.println("A temperatura convertida em farenheit será:" + resultado);
    }}
