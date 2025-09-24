package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		// PRECISO CRIAR UM MENU PARA O BANCO MALOTES COM ALGUMAS OPCOES
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		// INSTANCIAR OBJETOS DA CLASSE CONTA numero da conta, agencia, tipo conta correte titular da conta, saldo da conta
		
		Conta c1 = new Conta(1, 123, 1, "Tayná Alves", 50000.00f);
		
		Conta c2 = new Conta(2, 123, 2, "Telma Alves", 50000.00f);

		System.out.println("O saldo da conta é: " + c1.getSaldo());

		c1.getSaldo();
		
		System.out.println("O saldo da conta é: " + c1.getSaldo());

		c1.visualizar();

		c2.visualizar();
		
		
		System.out.println(c1.sacar(1000));
		System.out.println("O saldo da conta é: " + c1.getSaldo());

		System.out.println(c2.sacar(10000000));
		System.out.println("O saldo da conta é: " + c1.getSaldo());

		c1.depositar(5000);
		System.out.println("O saldo da conta é: " + c1.getSaldo());

         // instranciar objetos da Classe ContaCorrente
		
		ContaCorrente cc1 = new ContaCorrente(3, 456, 1, "Thuany Silva", 1000000.00f, 100000.00f);
		
		cc1.visualizar();
		
		// SACAR DA CONTA CORRENTE
		System.out.println(cc1.sacar(2000000.00f));
		cc1.visualizar();
		
		System.out.println(cc1.sacar(200.00f));
		cc1.visualizar();
		
		// DEPOSISTAR NA CONTA CORRENTE
		cc1.depositar(5000.00f);
		cc1.visualizar();
	
		
		// VOU USAR A OPCAO WHILE PARA APARECER O MENU PQ NÃO PRECISA ACONTECER NADA
		// ANTES PARA A TELA APARECER
		
		while (true) {

			System.out.println(Cores.TEXT_BLACK + Cores.ANSI_YELLOW_BACKGROUND
					+ "***********************************************");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("               BANCO DO MALOTE                 ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("        1 - Criar Conta                        ");
			System.out.println("        2-  Listar todas as Contas             ");
			System.out.println("        3 - Buscar Conta por Número            ");
			System.out.println("        4 - Atualizar Dados da Conta           ");
			System.out.println("        5 - Apagar Conta                       ");
			System.out.println("        6 - Sacar                              ");
			System.out.println("        7 - Depositar                          ");
			System.out.println("        8 - Transferir valores entre Contas    ");
			System.out.println("        0 - Sair                               ");
			System.out.println("***********************************************");
			System.out.println("        Entre com a opção desejada             ");
			System.out.println("                                               " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println(Cores.TEXT_RED_BOLD + " \nBanco do Malote - O seu futuro começa aqui! ");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_RED_BOLD + "Criar Conta \n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_RED_BOLD + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_RED_BOLD + "Consultar dados da Conta - por núemro\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_RED_BOLD + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_RED_BOLD + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_RED_BOLD + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_RED_BOLD + "Depósito\n\n");

				break;

			case 8:
				System.out.println(Cores.TEXT_RED_BOLD + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpçao Inválida\n");
				break;
			}

		}

	}

	public static void sobre() {
		System.out.println("\n*****************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Thuany Silva - thuany.aline@hotmail.com");
		System.out.println("github.com/ThuanyAline");
		System.out.println("*****************************************************");

	}

}
