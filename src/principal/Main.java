package principal;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import repositories.ClienteRepository;

public class Main {
	/*
	 * Public = Permissão (Visibilidade da classe); Static = Tipo; Void = parâmetro
	 * vazio; main = nomenclatura padrão; (String[] args) = espaço vazio do array;
	 * ********************************************* * Checar depois se eu ainda
	 * lembro...;
	 */
	public static void main(String[] args) {
		System.out.println("Sistema para cadastro de cliente ");
		System.out.println("Turma de Java WebDeveloper - Sábado.");
		
		var cliente = new Cliente();
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
		cliente.setCpf (JOptionPane.showInputDialog("Informe o cpf: "));
		cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
		cliente.setEmail(JOptionPane.showInputDialog("Informe e-mail: "));
		
		System.out.println("\nDados do cliente........: ");
		System.out.println("\tId do cliente...........: "+cliente.getId());
		System.out.println("\tNome do cliente.........: "+cliente.getNome());
		System.out.println("\tCPF do cliente..........: "+cliente.getCpf());
		System.out.println("\tTelefone do cliente.....: "+cliente.getTelefone());
		System.out.println("\te-mail do cliente.......: "+cliente.getEmail());
		
		var clienteRepository = new ClienteRepository();
		clienteRepository.exportarDados(cliente);
	}
}
