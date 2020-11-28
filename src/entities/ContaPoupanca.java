package entities;

public class ContaPoupanca extends ContaBancaria{
	
	private double taxaRendimento;
	
	public ContaPoupanca() {
		super();
	}
	
	
	public ContaPoupanca(int numero, String cliente, double saldo, double taxaRendimento) {
		super(numero, cliente, saldo);
		this.taxaRendimento = taxaRendimento;
	}
	

	public double getTaxaRendimento() {
		return taxaRendimento;
	}


	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public void atualizaSaldo() {
		
		saldo = saldo * taxaRendimento;
	}
}
