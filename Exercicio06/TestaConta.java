package Exercicio06;

public class TestaConta {

	public static void main(String[] args) {
		
	ContaBanc�ria x = new ContaBanc�ria();
		
		x.banco = "Banco Generation";
		x.numeroDaConta = 1486;
		x.saldoBancario = 0.00;
		x.aberta = true;
		
		x.extrato();
		
		if(x.aberta == true) 
			System.out.println("Consulta da conta "+x.numeroDaConta+" do banco "+x.banco+", possui R$"+x.saldoBancario+" de saldo");
	}

}
