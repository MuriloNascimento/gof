package pattern.abstractfactory;

public class EmissorMasterCard implements Emissor{

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando a seguinte mensagem para a Master:");
		System.out.println(mensagem);
	}
	
}
