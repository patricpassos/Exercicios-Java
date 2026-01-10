import java.util.Scanner;

public class MenorDeTres {

	static void menorDeTres(int a, int b, int c) {
		int menor;
		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}
		System.out.println("MENOR = " + menor);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Seguundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();

		menorDeTres(a, b, c);

		sc.close();

	}

}
