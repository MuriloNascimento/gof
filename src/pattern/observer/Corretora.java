package pattern.observer;

public class Corretora implements AcaoObserver{
	
	private String name;

	@Override
	public void notifyAll(Acao acao) {
		System.out.println("Corretora "+this.name+" sendo notificada.");
		System.out.println("A ação "+acao.getCodigo()+" teve seu valor alterado "+acao.getValor());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Corretora(String name) {
		super();
		this.name = name;
	}

}
