import java.util.Scanner;

public class ParImpar {
	
	static void condicionalParImpar (int n) {
		
		if (n == 0) {
			System.out.println("NULO");
		} else if (n % 2 == 0 && n < 0) {
			System.out.println("PAR NEGATIVO");
		} else if (n % 2 == 0) {
			System.out.println("PAR POSITIVO");
		} else if (n % 2 != 0 && n < 0) {
			System.out.println("IMPAR NEGATIVO");
		} else {
			System.out.println("IMPAR POSITVO");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int entrada, n;
		
		System.out.print("Quantos numeros você vai digitar? ");
		entrada = sc.nextInt();
		
		for (int i = 0; i < entrada; i++) {
			System.out.print("Digite um número: ");
			n = sc.nextInt();
			
			condicionalParImpar(n);
			
		}
		
		sc.close();

	}

}
