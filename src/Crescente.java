import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		do {
			System.out.println("Digite dois numeros:");
			a = sc.nextInt();
			b = sc.nextInt();

			if (a > b) {
				System.out.println("DECRESCENTE!");
			} else if (a < b) {
				System.out.println("CRESCENTE!");
			} else {
				break;
			}

		} while (a != b);

		sc.close();

	}

}
