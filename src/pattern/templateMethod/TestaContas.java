package pattern.templateMethod;

public class TestaContas {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.deposita(30.0);
		cc.saca(10.0);
		
		cp.deposita(30.0);
		cp.deposita(10.0);
		
		System.out.println("Saldo da conta corrente: "+cc.getSaldo());
		System.out.println("Saldo da conta corrente: "+cp.getSaldo());

	}

}
