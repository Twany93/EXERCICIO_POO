package Exercicio06;

public class ContaBancária {
	
	String banco;
	int numeroDaConta;
	double saldoBancario;
	boolean aberta;
	
	void extrato() {
		if(this.aberta == false)
			System.out.println("Conta bloqueada");
		else
			System.out.println("Conta ativa");
		    
	}
	
	void bloquear() {
		this.aberta = false;
	}
	
	void desbloquear() {
		this.aberta = true;
	}

}
