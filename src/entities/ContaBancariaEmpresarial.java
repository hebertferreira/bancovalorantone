package entities;

public class ContaBancariaEmpresarial extends ContaBancaria{
	
	private double limiteParaEmprestimo;
	
	public ContaBancariaEmpresarial() {
		super();
	}

	public ContaBancariaEmpresarial(int numero, String cliente, double saldo, double limiteParaEmprestimo) {
		super(numero, cliente, saldo);
		this.limiteParaEmprestimo = limiteParaEmprestimo;
	}

	public double getLimiteParaEmprestimo() {
		return limiteParaEmprestimo;
	}

	public void setLimiteParaEmprestimo(double limiteParaEmprestimo) {
		this.limiteParaEmprestimo = limiteParaEmprestimo;
	}
	
	public void pegarCredito() {
		
		saldo = saldo + limiteParaEmprestimo;
	}

}
