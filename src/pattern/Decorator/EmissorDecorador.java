package pattern.Decorator;

public abstract class EmissorDecorador implements Emissor{
	
	private Emissor emissor;
	
	public Emissor getEmissor() {
		return emissor;
	}

	public void setEmissor(Emissor emissor) {
		this.emissor = emissor;
	}

	public EmissorDecorador(Emissor emissor) {
		this.emissor = emissor;
	}

	@Override
	public void envia(String mensagem) {}
}
