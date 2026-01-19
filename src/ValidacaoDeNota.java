import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notaA, notaB, media;

		System.out.print("Digite a primeira nota: ");
		notaA = sc.nextDouble();

		while (notaA < 0.0 || notaA > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			notaA = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		notaB = sc.nextDouble();

		while (notaB < 0.0 || notaB > 10.0) {
			System.out.print("Valor invalido! Tente novamente: ");
			notaB = sc.nextDouble();
		}

		media = (notaA + notaB) / 2;
		System.out.printf("MEDIA = %.2f\n", media);

		sc.close();

	}

}
