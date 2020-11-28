package application;

import entities.ContaBancaria;
import entities.ContaBancariaEmpresarial;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		ContaBancaria cb = new ContaBancaria(1001, "Viviane", 0.00);
		ContaBancariaEmpresarial cemp= new ContaBancariaEmpresarial(2002, "Wendell", 0.00, 500.00);
		
		//UPCASTING é transformar o objeto da superClasse em um objeto da subClasse, já que o objeto da subclasse é um objeto da superClasse, logo...
		//o objeto da superClasse HERDA os atributos da subClasse;
		
		ContaBancaria cb01 = cemp;
		ContaBancaria cb02 = new ContaBancariaEmpresarial(2003, "Sandra", 0.00, 300.00);
		
		ContaPoupanca  cp = new ContaPoupanca(2002, "Hebert", 0.00, 1.03);

		ContaBancaria cp01 = cp;
		ContaBancaria cp02 = new ContaPoupanca(3003, "Chuca", 0.00, 1.05);
		
		//DOWNCASTING é transformar o objeto da subClasse em superClasse;
		
		ContaBancariaEmpresarial cemp02 = (ContaBancariaEmpresarial) cb01;
		
		cemp02.depositarGrana(200);
		
		// NAO É POSSIVEL FAZER ISSO 
		//ContaBancariaEmpresarial cp05 = (ContaBancariaEmpresarial) cemp02
		//Que é transformar um objeto da subClasse em outro objeto da subclasse(Conta Empresarial virar ContaPoupança),logo...
		//...é necessario usar o INSTANCE OF
		
		if(cp02 instanceof ContaBancariaEmpresarial) {
			ContaBancariaEmpresarial cp05 = (ContaBancariaEmpresarial) cemp02;
			cp05.depositarGrana(15.00);
		}
		
	}

}
	