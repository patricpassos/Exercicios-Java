import java.util.Locale;
import java.util.Scanner;

public class MediaDeIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade;
		int soma = 0;
		int cont = 0;

		System.out.println("Digite as idades:");
		do {
			idade = sc.nextInt();
			if (idade > 0) {
				while (idade >= 0) {
					soma += idade;
					cont += 1;
					idade = sc.nextInt();
				}
				double media = (double) soma / cont;
				System.out.printf("MÉDIA = %.2f", media);
			} else {
				System.out.println("IMPOSSIVEL CALCULAR");
			}
		} while (idade >= 0);

		sc.close();

	}

}
