package testes;

import java.util.Scanner;

public class Teste2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int atual = 1, anterior = 0, num;

		System.out.println("Insira o valor desejado:");
		num = sc.nextInt();

		while (atual < num) {
			int prox = anterior + atual;
			anterior = atual;
			atual = prox;
		}
		if (atual == num) {
			System.out.println("O número " + num + " pertence a sequecia");
		} else {
			System.out.println("O número " + num + " não pertence a sequecia");
		}
	}
}