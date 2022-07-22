package aulas;

import java.util.Scanner;

public class AtividadeEstruturaCondicional2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int primeiroNumero = 0;
		int segundoNumero = 0;
		int terceiroNumero = 0;

		System.out.println("Digite 3 números aleatórios e descubra qual dentre eles é o maior.");

		System.out.print("\n1° Número: ");
		primeiroNumero = scan.nextInt();
		System.out.print("2° Número: ");
		segundoNumero = scan.nextInt();
		System.out.print("3° Número: ");
		terceiroNumero = scan.nextInt();

		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && primeiroNumero != segundoNumero
				&& primeiroNumero != terceiroNumero) {
			System.out.println("\nO número de maior valor é " + primeiroNumero + ".");
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && segundoNumero != primeiroNumero
				&& segundoNumero != terceiroNumero) {
			System.out.println("\nO número de maior valor é " + segundoNumero + ".");
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && terceiroNumero != primeiroNumero
				&& terceiroNumero != segundoNumero) {
			System.out.println("\nO número de maior valor é " + terceiroNumero + ".");
		} else {
			System.out.println("\nPor favor, digite números inteiros que possuam valores diferentes. Tente novamente.");
		}

		scan.close();
	}

}
