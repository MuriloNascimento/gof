package pattern.factory;

public class EmissorSMS implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a mensagem por sms");
		System.out.println(mensagem);
	}

}
