package pattern.singleton;

public class TestaConfiguracao {

	public static void main(String[] args) {
		
		Configuracao configuracao = Configuracao.getInstance();
		System.out.println(configuracao.getPropriedades("local"));

	}

}
