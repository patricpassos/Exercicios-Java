import java.util.Scanner;

public class Idades {
	
	/**
	 * Calcula a media das idades de duas pessoas
	 * @param idade1: idade da primeira pessoa
	 * @param idade2: idade da segunda pessoa
	 * @return: a media das idades
	 */
	static double mediaIdade(double idade1, double idade2) {
		double idade =  (idade1 + idade2) / 2;
		return idade;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome1, nome2;
		int idade1, idade2;
		
		System.out.printf("Dados da primeira pessoa: \n");
		System.out.print("NOME: ");
		nome1 = sc.nextLine();
		System.out.print("IDADE: ");
		idade1 = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("Dados da segunda pessoa: \n");
		System.out.print("NOME: ");
		nome2 = sc.nextLine();
		System.out.print("IDADE: ");
		idade2 = sc.nextInt();
		sc.nextLine();


		double mediaIdade =  mediaIdade(idade1, idade2);
		System.out.print("A idade de " + nome1 + " e " + nome2 + " é de " + mediaIdade + " anos");

		sc.close();

	}

}
