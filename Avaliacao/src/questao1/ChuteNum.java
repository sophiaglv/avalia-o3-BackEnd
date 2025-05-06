package questao1;

import java.util.Random;
import java.util.Scanner;

public class ChuteNum {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int numSecreto = aleatorio.nextInt(5) + 1;

		int chute;

		Scanner ler = new Scanner(System.in);

		System.out.println("Chute um número de 1 a 100 - 5 tentativas");
		chute = ler.nextInt();

		for(int i = 0; i < 4; i++) {
			if(chute < numSecreto) {
				System.out.println("O número secreto é maior");
				chute = ler.nextInt();
			}else if(chute > numSecreto){
				System.out.println("O número secreto é menor");
				chute = ler.nextInt();
			}else if(chute == numSecreto){
				System.out.println("Parabéns você acertou! O número secreto era:  " + numSecreto);
			}
		}
		
		if(chute != numSecreto){
			System.out.println("Acabaram as tentativas, o número secreto era: " + numSecreto);
		}else if(chute == numSecreto){
			System.out.println("Parabéns você acertou! O número secreto era:  " + numSecreto);
		}

		ler.close();

	}

}

