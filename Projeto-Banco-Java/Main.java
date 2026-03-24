package ContaBancaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaPoupanca contap1 = new ContaPoupanca("Cauã", "11111", 0);
		System.out.println("-----Conta Poupança-----");
		contap1.setNomeCliente("Caua");
		contap1.setNumCliente("11111");
		contap1.depositar(1500);
		contap1.sacar(1700);
		contap1.sacar(1300);
		contap1.setDiaRendimento(19);
		
		if(contap1.calcularNovoSaldo(0.3)) {
			System.out.println("Rendimento mensal aplicado. Novo saldo: " + contap1.getSaldo());
		} else {
			System.out.println("Data atual não corresponde ao dia de rendimento mensal. Saldo inalterado: " + contap1.getSaldo());
		}
		System.out.println(contap1);
		System.out.println("-----Conta Especial-----");
		
		ContaEspecial contae1 = new ContaEspecial(null, null, 0);
		contae1.setNomeCliente("David");
		contae1.setNumCliente("22222");
		contae1.setLimite(500);
		contae1.depositar(1000);
		contae1.sacar(1500);
		System.out.println(contae1);
	}
}
