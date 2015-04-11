package pattern.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {
	
	public void registraEntrada(Funcionario f){
		Calendar calendario = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = sdf.format(calendario.getTime());
		System.out.println("Entrada: " + f.getNome() + " as " + format);
	}
	
	public void registraSaida(Funcionario f){
		Calendar calendario = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = sdf.format(calendario.getTime());
		System.out.println("Saida: " + f.getNome() + " as " + format);
	}

}
