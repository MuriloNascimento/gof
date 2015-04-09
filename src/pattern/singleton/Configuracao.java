package pattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {

	private Map<String, String> propriedades;
	private static Configuracao instance;
	
	private Configuracao(){
		this.propriedades = new HashMap<String, String>();
		this.propriedades.put("time-zone", "america");
		this.propriedades.put("local", "pt-br");
	}
	
	public static Configuracao getInstance(){
		if(Configuracao.instance == null){
			Configuracao.instance = new Configuracao();
		}
		return Configuracao.instance;
	}
	
	public String getPropriedades(String nomeDaPropriedade){
		return this.propriedades.get(nomeDaPropriedade);
	}
		
}
