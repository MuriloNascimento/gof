package pattern.adapter;

public class TestaControlePonto {

	public static void main(String[] args) throws InterruptedException {
		ControleDePonto cp = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario("Murilo");
		
		cp.registraEntrada(funcionario);
		Thread.sleep(3000);
		cp.registraSaida(funcionario);

	}

}
