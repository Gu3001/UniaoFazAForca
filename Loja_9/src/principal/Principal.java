
package principal;

import java.util.Scanner;

import entidade.Cliente;
import entidade.Fornecedor;
import tela.TelaCliente;
import tela.TelaFornecedor;

public class Principal {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Gerenciar Cliente");
		System.out.println("2 - Gerenciar Fornecedor");
		int op = scan.nextInt();
		scan.nextLine();
		
		if(op == 1) {
			TelaCliente tela = new TelaCliente();
		}
		if (op == 2) {
			TelaFornecedor tela = new TelaFornecedor();
		}
	}
	
}

