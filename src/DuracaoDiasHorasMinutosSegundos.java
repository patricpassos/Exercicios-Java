import java.util.Scanner;

public class DuracaoDiasHorasMinutosSegundos {
	
	static void duracao (int tempoSegundos) {
		int dias = tempoSegundos / 86400;
		int horas = (tempoSegundos % 86400) / 3600;
		int minutos = (tempoSegundos % 3600) / 60;
		int segundos = (tempoSegundos % 60);
		
		System.out.print(dias + " dias " + horas + " horas " + minutos + " mintos " + segundos + " sgundos");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int duracaoSegundos;
		
		System.out.print("Digite a duração em segundos: ");
		duracaoSegundos = sc.nextInt();
		
		duracao(duracaoSegundos);
		
		sc.close();

	}

}
