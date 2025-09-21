package conta_bancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		// PRECISO CRIAR UM MENU PARA O BANCO MALOTES COM ALGUMAS OPCOES
    Scanner leia = new Scanner(System.in);
    
    int opcao;
	
    // VOU USAR A OPCAO WHILE PARA APARECER O MENU PQ NÃO PRECISA ACONTECER NADA ANTES PARA A TELA APARECER
    while (true) {
	
    	System.out.println("***********************************************");
	    System.out.println("                                               ");
	    System.out.println("               BANCO DO MALOTE                 ");
	    System.out.println("                                               ");
        System.out.println("***********************************************");
	    System.out.println("                                               ");
        System.out.println("        1 - Criar Conta                        ");
	    System.out.println("        2-  Listar todas as Contas              ");
	    System.out.println("        3 - Buscar Conta por Número            ");
	    System.out.println("        4 - Atualizar Dados da Conta           ");
	    System.out.println("        5 - Apagar Conta                       ");
	    System.out.println("        6 - Sacar                              ");
	    System.out.println("        7 - Depositar                          ");
	    System.out.println("        8 - Transferir valores entre Contas    ");
	    System.out.println("        0 - Sair                               ");
	    System.out.println("***********************************************");
	    System.out.println("        Entre com a opção desejada             ");
	    System.out.println("                                               ");

	    opcao = leia.nextInt();
	   
	    if (opcao == 0) {
	    	System.out.println(" \nBanco do Malote - O seu futuro começa aqui! ");
	    	sobre();
	    	leia.close();
	    	System.exit(0);
	    }
	    
        switch (opcao) {
        	case 1:
        		System.out.println("Criar Conta \n\n");
        	
        		break;
        	case 2:
        		System.out.println("Listar todas as Contas\n\n");
        	
        		break;
        	case 3:
        		System.out.println("Consultar dados da Conta - por núemro\n\n");
        	
        		break;
        	case 4:
        		System.out.println("Atualizar dados da Conta\n\n");
        	
        		break;
        	case 5:
        		System.out.println("Apagar a Conta\n\n");
        	
        		break;
        	case 6:
        		System.out.println("Saque\n\n");
        	
        		break;
        	case 7:
        		System.out.println("Depósito\n\n");
        	
        		break;
        		
        	case 8:
        		System.out.println("Transferência entre Contas\n\n");
        	
        		break;
        	default:
        		System.out.println("\nOpçao Inválida\n");
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
