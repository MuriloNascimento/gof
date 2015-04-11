package pattern.Decorator;

public class EmissorBasico implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a mensage: ");
		System.out.println(mensagem);
	}

}
