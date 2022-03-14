package Exercício02;

public class TestaAvião {

	public static void main(String[] args) {
		classeAvião x = new classeAvião ();
		
		x.modeloAviao = "Generarion Airbus xuxu";
		x.numeroPassageiros = 153;
		x.preçoDaPassagem = 900.00;
		x.turbina = false;
		x.destino= "Madrid";
		
		x.voo();
		
		if(x.turbina == false) 
			System.out.println("O voo da "+x.modeloAviao+", com destino a"+ x.destino+" esta decolando com "+x.numeroPassageiros+" passageiros e com a passagem a R$"+x.preçoDaPassagem+". Boa viagem!");
	}

}
