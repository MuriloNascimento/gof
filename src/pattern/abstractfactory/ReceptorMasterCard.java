package pattern.abstractfactory;

public class ReceptorMasterCard implements Receptor {

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem master card");
		String mensagem = "Master Card";
		return mensagem;
	}

}
