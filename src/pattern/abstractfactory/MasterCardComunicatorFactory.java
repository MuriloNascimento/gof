package pattern.abstractfactory;

public class MasterCardComunicatorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.MASTERCARD);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(EmissorCreator.MASTERCARD);
	}
}
