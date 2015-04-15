package pattern.observer;

import java.util.HashSet;
import java.util.Set;

public class Acao {
	
	private String codigo;
	private double valor;
	private Set<AcaoObserver> interessados = new HashSet<AcaoObserver>() ;
	
	public void registraInteressados(AcaoObserver acaoObserver){
		this.interessados.add(acaoObserver);
	}
	
	public void cancelaInteressados(AcaoObserver acaoObserver){
		this.interessados.remove(acaoObserver);
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Acao(String codigo, double valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}

}
