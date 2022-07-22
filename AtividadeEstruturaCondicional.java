package aulas;

import java.util.Scanner;

public class AtividadeEstruturaCondicional {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int primeiroNumero = 0;
		int segundoNumero = 0;

		System.out.print("Por favor, digite um número inteiro aleatório: ");
		primeiroNumero = scan.nextInt();
		System.out.print("Agora, digite um segundo número: ");
		segundoNumero = scan.nextInt();

		if (primeiroNumero > segundoNumero) {
			System.out.println("\nO número de maior valor é " + primeiroNumero + ".");
		} else if (segundoNumero > primeiroNumero) {
			System.out.println("\nO número de maior valor é " + segundoNumero + ".");
		} else {
			System.out.println("\nDigite números inteiros que possuam valores diferentes. Tente novamente.");
		}

		scan.close();

	}

}
