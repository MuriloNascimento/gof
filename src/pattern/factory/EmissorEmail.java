package pattern.factory;

public class EmissorEmail implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a mensagem por email");
		System.out.println(mensagem);
	}

}
