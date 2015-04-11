package pattern.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
	
	public void registra(Funcionario f, boolean entrada){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		String format = sdf.format(calendar.getTime());
		
		if(entrada == true){
			System.out.println("Entrada: " + f.getNome() + " as " + format);
		} else {
			System.out.println("Saida: " + f.getNome() + " as " + format);
		}
	}

}
