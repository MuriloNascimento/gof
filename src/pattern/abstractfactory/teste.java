package pattern.abstractfactory;

public class teste {

	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new MasterCardComunicatorFactory();
		
		String transacao = "Valor=300";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}

}
