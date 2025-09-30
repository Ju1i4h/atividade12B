package atividade12B;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Cria um objeto Scanner para ler a entrada do sistema
        System.out.print("Digite o valor da base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
    }
}
