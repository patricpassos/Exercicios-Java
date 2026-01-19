import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.print("Digite a senha: ");

		do {
			senha = sc.nextInt();
			if (senha == 2002) {
				System.out.println("Acesso permitido!");
			} else {
				System.out.print("Senha Invalida! Tente Novamente: ");
			}

		} while (senha != 2002);

		sc.close();

	}

}
