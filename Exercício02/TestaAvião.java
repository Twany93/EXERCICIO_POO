package Exerc�cio02;

public class TestaAvi�o {

	public static void main(String[] args) {
		classeAvi�o x = new classeAvi�o ();
		
		x.modeloAviao = "Generarion Airbus xuxu";
		x.numeroPassageiros = 153;
		x.pre�oDaPassagem = 900.00;
		x.turbina = false;
		x.destino= "Madrid";
		
		x.voo();
		
		if(x.turbina == false) 
			System.out.println("O voo da "+x.modeloAviao+", com destino a"+ x.destino+" esta decolando com "+x.numeroPassageiros+" passageiros e com a passagem a R$"+x.pre�oDaPassagem+". Boa viagem!");
	}

}
