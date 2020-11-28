package entities;

public class ContaBancaria {

	private int numero;
	private String cliente;
	protected double saldo;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(int numero, String cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositarGrana(double valorDepositado) {
		saldo = saldo + valorDepositado;
	}
	
	public void sacarGrana(double valorSacado) {
		saldo = saldo + valorSacado;
	}
	
}
