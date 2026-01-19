import java.util.Scanner;

public class Tabuada {
	
	static void produto(int multiplicando) {
		for(int i = 1; i <= 10; i++) {
			int produto = multiplicando * i;
			System.out.println(multiplicando + " x " + i + " = " + produto);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		numero = sc.nextInt();
		
		produto(numero);
		
		sc.close();

	}

}
