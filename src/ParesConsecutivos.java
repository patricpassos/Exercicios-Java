import java.util.Scanner;

public class ParesConsecutivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int soma = 0;
		do {
			System.out.println("Digite um número inteiro: ");
			x = sc.nextInt();

			if (x == 0) {
				break;
			} else if (x % 2 != 0) {
				x += 1;
			}
			soma = 5 * x + 20;
			System.out.println("SOMA = " + soma);

		} while (x != 0);

		sc.close();

	}

}
