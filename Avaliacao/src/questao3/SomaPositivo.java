package questao3;

import java.util.Scanner;

public class SomaPositivo {

	public static void main(String[] args) {
		int num;
		int soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num = ler.nextInt();
		
		while(num >= 0) {
			soma = soma + num;
			System.out.println("A soma total é: " + soma);
			System.out.println("Digite outro número");
			num = ler.nextInt();
		}
		
		System.out.println("Você digitou um número negativo.");
		
		ler.close();
	}

}
