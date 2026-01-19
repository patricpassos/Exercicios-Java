import java.util.Scanner;

public class SequenciaImpares {
	
	static void sequenciaImpares (int x) {
		for (int i = 1; i <= x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();

		sequenciaImpares(x);

		sc.close();

	}

}
