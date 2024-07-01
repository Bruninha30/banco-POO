
public class Main {

	public static void main(String[] args) {
		Cliente bruna = new Cliente();
		bruna.setNome("Bruna");
		Banco banco = new Banco("Banco Santander","Rua da Praça,111", 500);

		Conta cc = new ContaCorrente(bruna);
		Conta poupanca = new ContaPoupanca (bruna);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		 Cliente cliente1 = new Cliente("João da Silva", "123.456.789-00", "Rua da Praça, 123");
	        Cliente cliente2 = new Cliente("Maria dos Santos", "987.654.321-00", "Rua do Centro, 456");
	        Cliente cliente3 = new Cliente("José de Oliveira", "555.555.555-55", "Rua do Lado, 789");

	       
		
			banco.adicionarCliente(cliente1);
	        banco.adicionarCliente(cliente2);
	        banco.adicionarCliente(cliente3);

	        banco.listarClientes();
		
		
	}

}
