package questao5;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		int num1;
		int num2;

		String resultado;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num1 = ler.nextInt();
		System.out.println("Digite outro número");
		num2 = ler.nextInt();
		
		resultado = (num1 > num2) ? "O primeiro número é maior" : "O segundo número é maior";
		
		System.out.println(resultado);
		
		ler.close();
	}

}
