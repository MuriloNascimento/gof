package pattern.abstractfactory;

public class ReceptorVisa implements Receptor{

	@Override
	public String recebe() {
		System.out.println("Recebendo mensagem visa");
		String mensagem = "Concluido com sucesso";
		return mensagem;
	}

}
