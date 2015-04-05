package pattern.factory;

public class TestaEmissor {

	public static void main(String[] args) {
		EmissorCreator emissorCreator = new EmissorCreator();
		
		Emissor emissor = emissorCreator.create(EmissorCreator.SMS);
		emissor.envia("Enviandor por sms");
		
		Emissor emissor2 = emissorCreator.create(EmissorCreator.EMAIL);
		emissor2.envia("Enviandor por email");
	}

}
