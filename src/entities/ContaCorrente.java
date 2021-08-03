package entities;

public class ContaCorrente {

	
	private int cc;
	private String nomeCliente;
	private double saldo;
	
	public ContaCorrente(int cc, String nomeCliente, double initConta) {
		this.cc = cc;
		this.nomeCliente = nomeCliente;
		deposit(initConta); 
	}

	public ContaCorrente(int cc, String nomeCliente) {
		this.cc = cc;
		this.nomeCliente = nomeCliente;
	}
	
	public int getCc() {
		return cc;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void withDraw(double saque) {
		saldo-= saque + 5.00;
	}	
	
	public void deposit(double deposit) {
		saldo+= deposit;
	}	
	
	public String toString() {
		return
				"Account " 
				+ cc
				+ ", Holder: " 
				+ nomeCliente
				+ ", Balance: $"
				+ String.format("%.2f", saldo);
	}
	
		
}
