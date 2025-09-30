package atividade12B;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Solicita ao usuário que digite o salário atual
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = sc.nextDouble();
        // Calcula o valor do aumento (10%)
        double valorAumento = salarioAtual * 0.10;
        double novoSalario = salarioAtual + valorAumento;
        System.out.printf("O salário com 10%% de aumento é: R$ %.2f%n", novoSalario);
        sc.close();
    }
}
