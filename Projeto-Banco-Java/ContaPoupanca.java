package ContaBancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	public ContaPoupanca(String nomeCliente, String numCliente, double saldo) {
		super(nomeCliente, numCliente, saldo);
		// TODO Auto-generated constructor stub
	}



	private int diaRendimento;
	
	
	
	public int getDiaRendimento() {
		return diaRendimento;
	}



	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}



	public boolean calcularNovoSaldo(double valor) {
		Calendar hoje = Calendar.getInstance();
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
		if(diaHoje == diaRendimento) {
			this.setSaldo(this.getSaldo() + this.getSaldo() * valor);
			return true;
		} return false;
	}
	
	
}
