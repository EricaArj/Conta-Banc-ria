package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Conta c1 = new Conta(1, 123, 1, "Erica Araújo", 30000.0f);

        //visualizamos os dados da conta c1
        c1.visualizar();

        //alteramos o saldo da conta c1
        c1.setSaldo(35000.0f);

        //vizualizamos apenas o saldo da conta c1
        c1.getSaldo();
        System.out.println(c1.getSaldo());

        c1.sacar(1000.0f);

        System.out.println(c1.getSaldo());

        c1.depositar(10000.0f);
        c1.visualizar();
		
	
		
		
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