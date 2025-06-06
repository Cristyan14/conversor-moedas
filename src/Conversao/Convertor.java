package Conversao;

import java.io.IOException;

import interacao.Interacao_Usuario;

public class Convertor extends Interacao_Usuario{
	public void conversor() throws IOException, InterruptedException {
		while(getOpcao() != 7) {
			interacao_menu();
			if(getOpcao() == 1) {
				conversorGson("USD", "ARS");
			}else if(getOpcao() == 2){
				
				 conversorGson("ARS", "USD");
			}else if(getOpcao() == 3){
				
				conversorGson("USD", "BRL");
			}else if(getOpcao() == 4){
			
				 conversorGson("BRL", "USD");
			}else if(getOpcao() == 5){
				conversorGson("USD", "COP");
			}else if(getOpcao() == 6){
				conversorGson("COP", "USD");
			}
		}
		
	}
}
