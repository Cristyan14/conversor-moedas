package exececoes;

public class Moeda_Exception extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return mensagem;
	}
}
