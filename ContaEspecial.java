package ContaBancaria;

public class ContaEspecial extends ContaBancaria {
	public ContaEspecial(String nomeCliente, String numCliente, double saldo) {
		super(nomeCliente, numCliente, saldo);
		// TODO Auto-generated constructor stub
	}

	private double limite;
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean sacar(double saque) {
		double saldoComLimite = this.getSaldo() + limite;
		
		if( saque <= 0) {
			System.out.println("Valor inválido.");
			return false;
		}
		
		if(saque <= saldoComLimite) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saque de " + saque + " reais realizado. Saldo atual: " + this.getSaldo());
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
			}
	}
	
	public String toString() {
		String s = "";
		 s += "Nome do cliente: " + this.getNomeCliente() + "; ";
		 s += "Número do cliente " + this.getNumCliente() + "; ";
		 s += "Saldo: " + this.getSaldo() + "; ";
		 s += "Limite: " + limite;
		return s;
	}
}
