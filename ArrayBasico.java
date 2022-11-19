
public class ArrayBasico {

	public static void main(String[] args) {
		System.out.println("Olá Java");
		
		int valor[] = new int[3];
		double notas[] = new double[4];
		String nomes[] = new String[10];
		
		valor[0] = 45;
		valor[1] = 26;
		valor[2] = 38;
		
		notas[0] = 4.2;
		notas[1] = 7.2;
		notas[2] = 1.2;
		notas[3] = 8.2;
		
		nomes[0] = "Nome do aluno";
		System.out.println(valor[0]);
		System.out.println(valor[1]);
		System.out.println(valor[2]);
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
			
		}

		
	
			
	}

}
