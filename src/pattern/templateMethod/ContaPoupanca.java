package pattern.templateMethod;

public class ContaPoupanca extends Conta {
	@Override
	public double calculaTaxa() {
		return 1;
	}
}
