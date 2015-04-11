package pattern.bridge;

public class TestaRecibo {

	public static void main(String[] args) {
		GeradorDeArquivos gerador = new GeradorDeArquivoHtml();
		Recibo recibo = new Recibo("M104", "Murilo", 1200, gerador);
		recibo.gerarArquivo();
	}

}
