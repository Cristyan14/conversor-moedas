package requisicao;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;




public class Requisicao {
	private String moeda;
	private double valor;
	
	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String fazerRequisicao() throws IOException, InterruptedException {
		String endereco = "https://v6.exchangerate-api.com/v6/c0a403325f03d30dced54000/latest/" + moeda;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();
	}
	
	public void conversorGson(String base, String destino) throws IOException, InterruptedException {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
	    setMoeda(base); 
	    String json = fazerRequisicao();
	    RespostaAPI resposta = gson.fromJson(json, RespostaAPI.class);

	    double taxaConversao = resposta.conversion_rates.get(destino);  
	    System.out.println("1 " + base + " = " + taxaConversao + " " + destino);
	}
}
