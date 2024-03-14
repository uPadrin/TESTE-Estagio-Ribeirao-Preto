package testes;

import java.util.Scanner;

public class Teste5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a palavra para inverter: ");
	        String input = scanner.nextLine();

	        char[] caracteres = input.toCharArray();
	        int tamanho = caracteres.length;

	        
	        for (int i = 0; i < tamanho / 2; i++) {
	            char temp = caracteres[i];
	            caracteres[i] = caracteres[tamanho - 1 - i];
	            caracteres[tamanho - 1 - i] = temp;
	        }

	        String invertedString = new String(caracteres);

	        System.out.println("String invertida: " + invertedString);

	        scanner.close();
	}

}
