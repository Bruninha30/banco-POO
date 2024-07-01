import java.util.ArrayList;
import java.util.List;


public class Banco {
	private String nome;
	private String endereco;
	private int numeroDeAgencias;
	private List<Conta> contas;
	private List<Cliente> clientes;

	
	public Banco (String nome, String endereco, int numeroDeAgencias) {
		this.nome = nome;
		this.endereco = endereco;
		this.numeroDeAgencias = numeroDeAgencias;
		this.clientes = new ArrayList<>();
		
	}
	 
	public void adicionarCliente(Cliente cliente) {
	        this.clientes.add(cliente);
	
	}
	 public void setContas(List<Conta> contas) {
 		this.contas = contas;
 		}

	 public void listarClientes() {
	        System.out.println("Clientes do banco " + this.nome + ":");
	        for (Cliente cliente : this.clientes) {
	            System.out.println("Nome: " + cliente.getNome());
	            System.out.println("CPF: " + cliente.getCpf());
	            System.out.println("Endereço: " + cliente.getEndereco());}
	        }
	 
	 
	public String getNome() {
		return nome;
	}
	

	public String getEndereco() {
		return endereco;
	}
	public int getNumeroDeAgencias() {
		return numeroDeAgencias;
	}
	public List<Conta> getContas() {
		return contas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	

	
}

	

