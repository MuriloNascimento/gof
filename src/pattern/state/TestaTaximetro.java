package pattern.state;

public class TestaTaximetro {
	
	public static void main(String[] args) {
		Bandeira b1 = new Bandeira1();
		Bandeira b2 = new Bandeira2();
		
		Taximetro taximetro = new Taximetro(b1);
		double valor = taximetro.calculaValorDaCorrida(10, 20);
		System.out.println("valor da bandeira 1 = "+valor);
		
		Taximetro taximetro2 = new Taximetro(b2);
		double valor2 = taximetro2.calculaValorDaCorrida(10, 20);
		System.out.println("valor da bandeira 2 = "+valor2);
	}
	
}
