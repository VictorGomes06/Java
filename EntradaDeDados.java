import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// Para trocar o separador de casas decimais de , para .
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		double real, dolar, totalDolar ,euro,totalEuro;
		
		System.out.print("Informe o valor em Reais: ");
		real = entrada.nextDouble();
		
		System.out.print("Informe o valor do Dolar: ");
		dolar = entrada.nextDouble();
		
		System.out.print("Informe o valor do Euro: ");
		euro = entrada.nextDouble();
		
		totalEuro = real / euro;
		totalDolar = real / dolar;
		
		System.out.printf("%.2f%n",totalDolar);
		System.out.printf("%.2f%n",totalEuro);
		
		//fechar o objeto entrada 
		entrada.close();	
		
	}

}
