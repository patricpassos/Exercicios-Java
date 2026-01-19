import java.util.Scanner;

public class SomaDeNumerosInteiros {

	/**
	 * Faz a adição de dois valores inteiros
	 * @param x: valor inteiro
	 * @param y: valor inteiro
	 * @return: adição de dois valores
	 */
	static int adicao(int x, int y) {
		int adicaoInteiro = x + y;
		return adicaoInteiro;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		char resp;

		do {
			System.out.print("Digite o valor de X: ");
			x = sc.nextInt();
			System.out.print("Digite o valor de Y: ");
			y = sc.nextInt();

			int soma = adicao(x, y);
			System.out.print("SOMA = " + soma);

			System.out.print("\n\nDeseja continuar (s/n): ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();

	}

}
