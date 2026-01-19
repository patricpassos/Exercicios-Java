import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		int contDentro = 0;
		int contFora = 0;

		System.out.print("Quantos números você vai digitar? ");
		x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.print("Digite um numero: ");
			y = sc.nextInt();
			if (y >= 10 && y <= 20) {
				contDentro++;
			} else {
				contFora++;
			}
		}
		System.out.println(contDentro + " DENTRO");
		System.out.println(contFora + " FORA");

		sc.close();

	}

}
