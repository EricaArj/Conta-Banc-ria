package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		 // Teste da Classe Conta
		Conta c1 = new Conta(3, 123, 1, "Erica Araujo da Silva", 500000.0f);
		c1.visualizar();
		c1.sacar(2000.0f);
		c1.visualizar();
		c1.depositar(30000.0f);
		c1.visualizar();
        
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Vitoria linda ", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(2500.0f);
		cc1.visualizar();
		cc1.depositar(30000.0f);
		cc1.visualizar();
		
        // Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Julia maria", 100000.0f,15);
		cp1.visualizar();
		
		int numero, agencia,tipo,anivesario; 
		String titular; 
		float saldo,limite;
			
        
		int opcao;
		
		
		while(true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND +"********************************************************************");
			System.out.println("********************************************************************");
			System.out.println("																	");
			System.out.println("																	");
			System.out.println("			BANCO UNITODOS 											");
			System.out.println("																	");
			System.out.println("																	");
			System.out.println(" *******************************************************************");
			System.out.println(" *******************************************************************");
			System.out.println("			1- Criar conta											");
			System.out.println("			2- Listar Todas as contas								");
			System.out.println("			3- Buscar conta por numero								");
			System.out.println("			4- Atualizar dados da conta								");
			System.out.println("			5- Apaga conta											");
			System.out.println("			6- Sacar												");
			System.out.println("			7- Depositar											");
			System.out.println("			8- Transferecia entre contas							");
			System.out.println("			9- Sair													");
			System.out.println(" *******************************************************************");
			System.out.println(" *******************************************************************");
			System.out.println("		Para mais informações visite o nosso site					");
			System.out.println(" 			www.BancoUnitodos.com.br								");
			System.out.println(" *******************************************************************");
			System.out.println(" *******************************************************************");
			
			opcao =leia.nextInt();
			
			if(opcao == 9) {
				
				System.out.println(Cores.TEXT_WHITE_BOLD +"***************************************************************");
				System.out.println("\n  		BANCO INITODOS - RELIZAMOS OS SEUS SONHOS			 ");
				System.out.println("\n			TENHA UM OTIMO DIA! 								");
				System.out.println(" ***************************************************************");
				leia.close();
				System.exit(0);
				
			}
			

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				
				System.out.println("Numero da Agência: ");
				agencia =leia.nextInt();
				System.out.println("Nome o Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				do {
					System.out.println("Tipo da Conta(1-CC /2-CP: ");
					tipo =leia.nextInt();
				}while(tipo < 1 && tipo >2);
				
				System.out.println("Saldo da Conta: ");
				saldo =leia.nextFloat();
				
				switch(tipo) {
				case 1->{
					System.out.println("Limite da Conta Corrente: ");
					limite =leia.nextFloat();
					ContaCorrente cc =new ContaCorrente(0,agencia,tipo,titular,saldo,limite);
					cc.visualizar();
				}
				case 2 ->{
					System.out.println("Aniversario da Conta Poupança: ");
					anivesario =leia.nextInt();
					ContaPoupanca cp =new ContaPoupanca(0,agencia,tipo,titular,saldo,anivesario);
					cp.visualizar();
				
				}
				}
				
				
				

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

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
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}

	}

}