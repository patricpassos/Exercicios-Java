import java.util.Scanner;

public class MenorDeTres {

	public static int menorDeTres(int a, int b, int c) {
		int menor;
		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}
		return menor;
	}
	
	public static void menor(int menor) {
		System.out.println("MENOR = " + menor);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.print("Primeiro valor: ");
		a = sc.nextInt();
		System.out.print("Segundo valor: ");
		b = sc.nextInt();
		System.out.print("Terceiro valor: ");
		c = sc.nextInt();

		int menor = menorDeTres(a, b, c);
		
		menor(menor);

		sc.close();

	}

}
