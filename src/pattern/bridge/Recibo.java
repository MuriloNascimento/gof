package pattern.bridge;


public class Recibo implements Documento{
	
	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorDeArquivos geradorDeArquivos;

	public Recibo(String emissor, String favorecido, double valor,
			GeradorDeArquivos geradorDeArquivos) {
		super();
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivos = geradorDeArquivos;
	}

	@Override
	public void gerarArquivo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Recibo: ");
		buffer.append("\n");
		buffer.append("Empresa: "+this.emissor);
		buffer.append("\n");
		buffer.append("Cliente: "+this.favorecido);
		buffer.append("\n");
		buffer.append("Valor: "+this.valor);
		buffer.append("\n");
		this.geradorDeArquivos.gera(buffer.toString());
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public GeradorDeArquivos getGeradorDeArquivos() {
		return geradorDeArquivos;
	}

	public void setGeradorDeArquivos(GeradorDeArquivos geradorDeArquivos) {
		this.geradorDeArquivos = geradorDeArquivos;
	}

}
