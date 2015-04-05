package pattern.abstractfactory;

public class ReceptorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	
	public Receptor create(int tipoDoReceptor){
		if(tipoDoReceptor == ReceptorCreator.VISA){
			return new ReceptorVisa();
		} else if (tipoDoReceptor == ReceptorCreator.MASTERCARD){
			return new ReceptorMasterCard();
		} else {
			throw new IllegalArgumentException("tipo do receptor insuportavel");
		}
	}
}
