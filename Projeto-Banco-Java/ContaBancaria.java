package ContaBancaria;

public class ContaBancaria {
	private String nomeCliente;
	private String numCliente;
	private double saldo;
	
	
	
	
	public ContaBancaria(String nomeCliente, String numCliente, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numCliente = numCliente;
		this.saldo = saldo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double saque) {
		if(saque <= saldo && saque > 0) {
			saldo -= saque;
			System.out.println("Saque de " + saque + " realizado. Saldo atual: " + saldo);
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
			}
		}
	
	public boolean depositar(double deposito) {
		if(deposito <= 0) {
			System.out.println("Valor inválido.");
			return false;
		}
		
		saldo += deposito;
		System.out.println("Depósito de " + deposito + " reais realizado. Saldo atual: " + saldo);
		return true;
	}
	
	public String toString() {
		String s = "";
		 s += "Nome do cliente: " + nomeCliente + "; ";
		 s += "Número do cliente " + numCliente + "; ";
		 s += "Saldo: " + saldo;
		return s;
	}
	
}
