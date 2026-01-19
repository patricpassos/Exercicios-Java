import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor de X: ");
		double x = sc.nextDouble();

		System.out.print("Valor de Y: ");
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.print("Origem");
		} else if (x != 0.0 && y == 0.0) {
			System.out.print("Eixo X");
		} else if (x == 0.0 && y != 0.0) {
			System.out.print("Eixo Y");
		} else if (x > 0.0 && y > 0.0) {
			System.out.print("Eixo Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.print("Eixo Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.print("Eixo Q3");
		} else {
			System.out.print("Eixo Q4");
		}

		sc.close();

	}

}
