import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	/**
	 * Calcula as raizes reais de uma equação do segundo grau
	 * @param a: coeficiente a (não pode ser igual a zero) 
	 * @param b: coeficiente b 
	 * @param c: coeficiente c 
	 */
	static void formulaBaskara(double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (a == 0.0 || delta < 0.0) {
			System.out.print("Está equação não possui raizes reais");
		} else {
			double raizA = -b + Math.sqrt(delta) / 2 * a;
			System.out.printf("X1 = %.4f\n", raizA);
			double raizB = -b - Math.sqrt(delta) / 2 * a;
			System.out.printf("X2 = %.4f\n", raizB);
		}

	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double coeficienteA, coeficienteB, coeficienteC;

		System.out.print("Coeficiente a: ");
		coeficienteA = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		coeficienteB = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		coeficienteC = sc.nextDouble();

		formulaBaskara(coeficienteA, coeficienteB, coeficienteC);

		sc.close();

	}

}
