import java.util.Scanner;

public class SomaImpares {

	static int somaNumerosImpares(int x, int y) {
		int a = 0;
		int soma = 0;
		//ordenação de numeros
		if (x > y) {
			a = x;
			x = y;
			y = a;
		}

		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		return soma;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		char resp;

		do {
			System.out.println("Digite dois numeros:");
			x = sc.nextInt();
			y = sc.nextInt();

			int somaImpares = somaNumerosImpares(x, y);
			System.out.println("SOMA DOS IMPARES = " + somaImpares);

			System.out.print("Deseja continuar (s/n): ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();

	}

}
