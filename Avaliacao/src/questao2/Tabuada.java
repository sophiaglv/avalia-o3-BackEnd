package questao2;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int num;
		int tabuada;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num = ler.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			tabuada = num * i;
			System.out.println(num + "X" + i + "=" + tabuada);
		}
		
		ler.close();
	}

}
