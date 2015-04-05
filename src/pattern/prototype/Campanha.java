package pattern.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {
	private String nome;
	private Calendar vencimento;
	private Set<String> palavras;
	
	public Campanha(String nome, Calendar vencimento, Set<String> palavras) {
		super();
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavras = palavras;
	}
	
	public Campanha clone(){
		System.out.println("copia da campanha "+this.nome);
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set<String> palavrasChave = new HashSet<String>(this.palavras);
		Campanha campanha = new Campanha(nome,vencimento,palavrasChave);
		return campanha;
	}
	
	@Override
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("------------------");
		buffer.append("\n");
		buffer.append("Noma da campanha:");
		buffer.append(this.nome);
		buffer.append("\n");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format(this.vencimento.getTime());
		buffer.append("Data do vencimento:"+format);
		buffer.append("\n");
		
		buffer.append("Palavras chave:\n");
		for (String palavraChave : this.palavras) {
			buffer.append("- "+palavraChave);
			buffer.append("\n");
		}
		buffer.append("------------------");
		buffer.append("\n");
		
		return buffer.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getVencimento() {
		return vencimento;
	}

	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public Set<String> getPalavras() {
		return palavras;
	}

	public void setPalavras(Set<String> palavras) {
		this.palavras = palavras;
	}
	
	
	
}
