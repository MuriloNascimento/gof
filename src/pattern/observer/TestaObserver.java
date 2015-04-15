package pattern.observer;

public class TestaObserver {

	public static void main(String[] args) {
		Acao acao = new Acao("Petrobras", 12.42);
		
		Corretora c1 = new Corretora("Aa");
		Corretora c2 = new Corretora("Bb");
		
		acao.registraInteressados(c1);
		acao.registraInteressados(c2);
		
		acao.setValor(13);
	}

}
