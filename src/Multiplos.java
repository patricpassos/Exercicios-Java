import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois numeros inteiros: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String resp = (a % b == 0 || b % a == 0) ? "São multiplos" : "Não são multiplos";
		System.out.println(resp);

		sc.close();

	}

}
