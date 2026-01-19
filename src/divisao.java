import java.util.Locale;
import java.util.Scanner;

public class divisao {
	
	static void razao (int numerador, int denominador) {
		if (denominador == 0) {
			System.out.print("DIVISÃO IMPOSSIVEL\n");
		} else {
			double razao = (double) numerador / denominador;
			System.out.printf("DIVISAO = %.2f\n", razao);
		}
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.printf("Quanto casos você vai digitar? ");
		int entrada = sc.nextInt();

		for (int i = 0; i < entrada; i++) {
			System.out.print("Entre com o numerador: ");
			int numerador = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			int denominador = sc.nextInt();

			razao(numerador, denominador);
		}

		sc.close();

	}

}
