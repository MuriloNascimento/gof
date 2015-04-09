package pattern.multiton;

public class TestaMultinton {

	public static void main(String[] args) {
		
		Tema temaFire = Tema.getInstance(Tema.FIRE);
		System.out.println("Tema"+temaFire.getNome());
		System.out.println("Cor Da Fonte :"+temaFire.getCorDaFonte());
		System.out.println("Cor Do Fundo:"+temaFire.getCorDoFundo());
		
		Tema tema2 = Tema.getInstance(Tema.FIRE);
		System.out.println("Tema"+tema2.getNome());
		System.out.println("Cor Da Fonte :"+tema2.getCorDaFonte());
		System.out.println("Cor Do Fundo:"+tema2.getCorDoFundo());
		
	}

}
