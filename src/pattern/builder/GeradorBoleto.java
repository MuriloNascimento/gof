package pattern.builder;

import java.util.Calendar;

public class GeradorBoleto {
	private BoletoBuilder boletBuilder;

	public GeradorBoleto(BoletoBuilder boletBuilder) {
		this.boletBuilder = boletBuilder;
	}
	
	public Boleto geraBoleto(){
		this.boletBuilder.buildSacado("Murilo Nascimento");
		this.boletBuilder.buildCedente("K19 Cursos");
		this.boletBuilder.buildValor(300.00);
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE,30) ;
		this.boletBuilder.buildVencimento(vencimento);
		this.boletBuilder.buildNossoNumero(1234);
		Boleto boleto = boletBuilder.getBoleto();
		return boleto;
	}
	
}
