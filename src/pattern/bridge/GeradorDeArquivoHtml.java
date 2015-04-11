package pattern.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoHtml implements GeradorDeArquivos{

	@Override
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream("recibo.html");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
