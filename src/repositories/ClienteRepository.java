package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {
	public void exportarDados(Cliente cliente) {
		try {
			var printWriter = new PrintWriter("c:\\temp\\cliente_"+cliente.getId()+".txt");
			printWriter.write("\nId do cliente...........: "+cliente.getId());
			printWriter.write("\nNome do cliente.........: "+cliente.getNome());
			printWriter.write("\nCPF do cliente..........: "+cliente.getCpf());
			printWriter.write("\nTelefone do cliente.....: "+cliente.getTelefone());
			printWriter.write("\ne-mail do cliente.......: "+cliente.getEmail());
			printWriter.close();
			System.out.println("\nDados gravados com sucesso!");
		} catch (Exception e) {
			System.out.println("Falha ao gravar arquivo: "+e.getMessage());
		}
	}
}
