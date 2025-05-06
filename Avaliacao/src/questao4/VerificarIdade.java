package questao4;

import java.util.Scanner;

public class VerificarIdade {

	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a sua idade");
		idade = ler.nextInt();
		
		if(idade < 12) {
			System.out.println("Você é uma criança");
		}else if(idade > 12 && idade <= 17) {
			System.out.println("Você é um adolescente");
		}else if(idade >= 18 && idade <= 59) {
			System.out.println("Você é um adulto");
		}else {
			System.out.println("Você é um idoso");
		}
		
		ler.close();
	}

}
