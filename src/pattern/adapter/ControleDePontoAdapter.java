package pattern.adapter;

public class ControleDePontoAdapter extends ControleDePonto {
	
	private ControleDePontoNovo controleDePontoNovo;
	
	public ControleDePontoAdapter() {
		this.controleDePontoNovo = new ControleDePontoNovo();
	}
	
	public ControleDePontoNovo getControleDePontoNovo() {
		return controleDePontoNovo;
	}
	
	public void setControleDePontoNovo(ControleDePontoNovo controleDePontoNovo) {
		this.controleDePontoNovo = controleDePontoNovo;
	}
	
	@Override
	public void registraEntrada(Funcionario f) {
		this.controleDePontoNovo.registra(f, true);
	}
	
	@Override
	public void registraSaida(Funcionario f) {
		this.controleDePontoNovo.registra(f, false);
	}
	
}
