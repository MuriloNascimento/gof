package pattern.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestePrototype {

	public static void main(String[] args) {
		String nome = "M104";
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("curso");
		hashSet.add("java");
		hashSet.add("M104 tecnology");
		
		Campanha campanha = new Campanha(nome, vencimento, hashSet);
		System.out.println(campanha);
		
		Campanha clone = campanha.clone();
		System.out.println(clone);
		
		clone.setNome("M104 v2.0");
		System.out.println(clone);
	}

}
