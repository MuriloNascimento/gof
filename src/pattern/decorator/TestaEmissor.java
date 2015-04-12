package pattern.decorator;

public class TestaEmissor {

	public static void main(String[] args) {
		String mensagem = "Ola mundo";
		
		Emissor emissorC = new EmissorDecoratorCriptografado(new EmissorBasico());
		emissorC.envia(mensagem);

	}

}
