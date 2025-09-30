package atividade12B;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicita ao usuário que insira a idade em anos
        System.out.print("Digite a idade da pessoa em anos: ");
        int idadeAnos = sc.nextInt();
        int idadeMeses = idadeAnos * 12;
        System.out.println("A idade em meses é: " + idadeMeses + " meses.");

    }
}
