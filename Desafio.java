package teste;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();

        if (numero1 != 0) {
            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();

            if (numero2 != 0) {
                System.out.println("Digite o terceiro número:");
                int numero3 = scanner.nextInt();

                if (numero3 != 0) {
                    System.out.println("Digite o quarto número:");
                    int numero4 = scanner.nextInt();

                    if (numero4 != 0) {
                        System.out.println("Digite o quinto número:");
                        int numero5 = scanner.nextInt();

                        if (numero5 != 0) {
                            System.out.println("Os números digitados são: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4 + ", " + numero5);
                        } else {
                            System.out.println("Você inseriu o número 0. Programa encerrado.");
                        }
                    } else {
                        System.out.println("Você inseriu o número 0. Programa encerrado.");
                    }
                } else {
                    System.out.println("Você inseriu o número 0. Programa encerrado.");
                }
            } else {
                System.out.println("Você inseriu o número 0. Programa encerrado.");
            }
        } else {
            System.out.println("Você inseriu o número 0. Programa encerrado.");
        }

        scanner.close();
    }
}

