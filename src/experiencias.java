import java.util.Locale;
import java.util.Scanner;

public class experiencias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos casos de teste serão digitados? ");
		int n = sc.nextInt();

		int somaCoelho = 0;
		int somaRato = 0;
		int somaSapo = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print("Quantidade de cobaias: ");
			int quantidade = sc.nextInt();
			System.out.print("Tipo de cobaias: ");
			char tipoCobaia = sc.next().charAt(0);

			if (tipoCobaia == 'C') {
				somaCoelho += quantidade;
			} else if (tipoCobaia == 'R') {
				somaRato += quantidade;
			} else if (tipoCobaia == 'S') {
				somaSapo += quantidade;
			}

		}

		int total = somaCoelho + somaRato + somaSapo;
		double percentualCoelho = (double) somaCoelho / total * 100;
		double percentualRato = (double) somaRato / total * 100;
		double percentualSapo = (double) somaSapo / total * 100;

		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.printf("Total: %d cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", somaCoelho);
		System.out.printf("Total de ratos: %d\n", somaRato);
		System.out.printf("Total de sapos: %d\n", somaSapo);
		System.out.printf("Percentual de coelhos: %.2f\n", percentualCoelho);
		System.out.printf("Percentual de ratos: %.2f\n", percentualRato);
		System.out.printf("Percentual de sapos: %.2f\n", percentualSapo);

		sc.close();

	}

}
