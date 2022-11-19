import java.util.Scanner;
import java.util.Locale;
public class DesafioNotas {

	public static void main(String[] args) {
		double media = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas notas deseja calcular ? ");
		
		int quantNotas = leitor.nextInt();
		double notas[] = new double [quantNotas];
		
		for (int i = 0 ; i < notas.length; i++) {
			System.out.printf("Informe a %dº nota :",i + 1);
			notas[i] = leitor.nextDouble();
		    media = media + notas[i] / 2;
		} 

		System.out.println("--------------MÈdia-------------------");
		System.out.printf("%.2f%n" , media);
		leitor.close();
	}

}
