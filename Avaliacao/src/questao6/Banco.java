package questao6;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		int saldo = 0;
		int verificar;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 1 - depositar, 2 - sacar, 3 - ver saldo, 4 - sair");
		verificar = ler.nextInt();

		while(verificar > 0) {
			if(verificar == 1) {
				System.out.println("Digite o valor que deseja depositar: ");
				int valor = ler.nextInt();
				saldo = saldo + valor;

				System.out.println("Deseja fazer algo a mais?");
				System.out.println("1 - depositar, 2 - sacar, 3 - ver saldo, 4 - sair");
				verificar = ler.nextInt();
			}else if(verificar == 2) {
				System.out.println("Digite o valor que deseja sacar: ");
				int valor = ler.nextInt();
				if(valor <= saldo) {
					saldo = saldo - valor;

					System.out.println("Deseja fazer algo a mais?");
					System.out.println("1 - depositar, 2 - sacar, 3 - ver saldo, 4 - sair");
					verificar = ler.nextInt();
				}else {
					System.out.println("Saldo insuficiente. A perte 1 para depositar, 3 para ver saldo ou 4 para sair");
					verificar = ler.nextInt();
				}
			}else if(verificar == 3) {
				System.out.println("O saldo atual é: R$" + saldo);

				System.out.println("Deseja fazer algo a mais?");
				System.out.println("1 - depositar, 2 - sacar, 3 - ver saldo, 4 - sair");
				verificar = ler.nextInt();
			}else if(verificar == 4){
				System.out.println("Encerrando...");
				
				System.out.println("Digite 1 - depositar, 2 - sacar, 3 - ver saldo, 4 - sair. Caso queira voltar.");
				verificar = ler.nextInt();
			}
			else {
				System.out.println("Opção inválida!");
				System.out.println("Digite 1 - depositar, 2 - sacar, 3 - ver saldo");
				verificar = ler.nextInt();
			}
		}

		ler.close();
	}

}
