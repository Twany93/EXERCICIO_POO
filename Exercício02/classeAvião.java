package Exerc�cio02;

public class classeAvi�o {

	String modeloAviao;
	String destino;
	int numeroPassageiros;
	double pre�oDaPassagem;
	boolean turbina;
	
	void voo() {
		if(this.turbina == false) 
		{
			System.out.println("Impossivel voar, uma das turbinas est� com problema");
		}
		else if(this.turbina == true) {
			System.out.println("Decolando...");
		}   
	}
	
	void desligarTurbina() {
		this.turbina = false;
	}
	
	void ligarTurbina() {
		this.turbina = true;
	}
		

}
