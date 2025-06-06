package interacao;

import java.util.Scanner;

import requisicao.Requisicao;

public class Interacao_Usuario extends Requisicao {

	private Scanner scanner = new Scanner(System.in);
	private double valor;
	private int opcao;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void interacao_menu() {
		System.out.println("***************");
		System.out.println("Conversor de Moeda");
		System.out.println("***************");
		
		System.out.println("Selecione uma opção: "
				+ "\n1) Dólar para Peso Argentino\n"
				+ "2) Peso Argentino para Dólar\n"
				+ "3) Dólar para Real Brasileiro\n"
				+ "4) Real Brasileiro para Dólar\n"
				+ "5) Dólar para Peso Colombiano\n"
				+ "6) Peso Colombiano para Dólar\n"
				+ "7) Sair\n");
		System.out.print("Digite: ");
		setOpcao(scanner.nextInt());
		System.out.println("***************");
	}
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	
	
	
}
