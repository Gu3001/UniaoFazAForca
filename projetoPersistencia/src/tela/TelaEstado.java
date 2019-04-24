package tela;

import java.util.Scanner;

import dao.DAOEstado;
import entidade.Estado;

public class TelaEstado {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";
	private Estado estado = new Estado();
	private DAOEstado dao = new DAOEstado();
	
	public TelaEstado() {
		
		String r = "s";
		int op = 0;
		do {
			do {
				System.out.println(menu);
				op = scan.nextInt();
				scan.nextLine();
			}while(op < 1 && op > 4);
			
			if(op == 1) {
				System.out.println("INSERIR NOVO ESTADO \n\n\n\n");
				System.out.println("Nome do estado:");
				String nome = scan.nextLine();
				
				System.out.println("Sigla do estado:");
				String sigla = scan.nextLine();
				
				estado.setNome(nome);
				estado.setSigla(sigla);
				
				dao.inserir(estado);
			}
			
			if(op == 2) {
				System.out.println("BUSCAR UM ESTADO\n\n\n\n");
				dao.buscar();
			}
			
			System.out.println("Deseja realmente buscar? (s/n)");
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
}
