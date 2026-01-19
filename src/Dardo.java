import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	static void maiorDistancia(double a, double b, double c) {
		double maior;
		if (a > b && a > c) {
			maior = a;
		} else if (b > c) {
			maior = b;
		} else {
			maior = c;
		}
		System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double distanciaA, distanciaB, distanciaC;

		System.out.println("Digite as três distâncias de arremesso: ");
		distanciaA = sc.nextDouble();
		distanciaB = sc.nextDouble();
		distanciaC = sc.nextDouble();
		maiorDistancia(distanciaA, distanciaB, distanciaC);

		sc.close();

	}

}
