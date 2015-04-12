package pattern.decorator;

public class EmissorDecoratorCriptografado extends EmissorDecorador{

	public EmissorDecoratorCriptografado(Emissor emissor) {
		super(emissor);
	}
	
	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando mensagem com criptografia");
		this.getEmissor().envia(criptografa(mensagem));
	}
	
	public String criptografa(String mensagem){
		String mensagemCrip = new StringBuffer(mensagem).reverse().toString();
		return mensagemCrip;
	}

}
