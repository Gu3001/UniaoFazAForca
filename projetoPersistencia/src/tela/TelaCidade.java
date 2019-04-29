	// persist salva
	// merge altera
	// remove apaga
	// find busca
package tela;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dao.DAOCidade;
import dao.DAOEstado;
import entidade.Cidade;
import entidade.Estado;
import principal.Principal;

public class TelaCidade {
	private Scanner scan = new Scanner(System.in);
	private String menu = " 1 - Inserir \n 2 - Excluir \n 3 - Alterar \n 4 - Consultar \n";
	private Estado estado = new Estado();
	private DAOCidade daocidade = new DAOCidade();
	private Principal principal = new Principal();
	
	public TelaCidade() {
		
		String r = "s";
		int op = 0;
		do {
			do {
				System.out.println(menu);
				op = scan.nextInt();
				scan.nextLine();
			}while(op < 1 && op > 4);
			
			if(op == 1) {
				Cidade cidade = new Cidade();
				DAOEstado daoestado = new DAOEstado();
				Estado estado = new Estado();
				
				System.out.println("Nome da cidade: ");
				String nome = scan.nextLine();
				cidade.setNome(nome);
				
				
				List<Estado> lista = daoestado.buscar();
				for (Estado est : lista) {
					System.out.println("Id: "+est.getId()+" Estado: "+est.getNome()+" - "+est.getSigla());
				}
				
				System.out.println("Insira o ID: ");
				long id = scan.nextLong();
				estado.setId(id);
				cidade.setEstado(estado);
				daocidade.inserir(cidade);
			}if (op ==2) {
				
			}
			if (op ==3) {
			
			}
			
			if(op == 4) {
			
				
			}

			
			System.out.println("Deseja realmente continuar? (s/n)");
			
			r = scan.nextLine();
			
		}while(r.contentEquals("s"));
	}
	
	//Só para fazer a listar todos os cadastros em operações

}
