package Exercício02;

public class classeAvião {

	String modeloAviao;
	String destino;
	int numeroPassageiros;
	double preçoDaPassagem;
	boolean turbina;
	
	void voo() {
		if(this.turbina == false) 
		{
			System.out.println("Impossivel voar, uma das turbinas está com problema");
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
