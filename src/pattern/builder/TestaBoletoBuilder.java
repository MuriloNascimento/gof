package pattern.builder;

public class TestaBoletoBuilder {

	public static void main(String[] args) {
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorBoleto geradorBoleto = new GeradorBoleto(boletoBuilder);
		Boleto boleto = geradorBoleto.geraBoleto();
		System.out.println(boleto);
	}

}
