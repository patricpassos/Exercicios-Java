import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		do {
			System.out.println("Digite as coordenadas X e Y: ");
			x = sc.nextInt();
			y = sc.nextInt();

			if (x == 0 || y == 0) {
				break;
			} else if (x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			} else {
				System.out.println("QUADRANTE Q4");
			}

		} while (x != 0 && y != 0);

		sc.close();

	}

}
