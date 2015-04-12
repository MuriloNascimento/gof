package pattern.command;

public class Player {
	public void play(String filename) throws InterruptedException{
		System.out.println("Tocando o arquivo "+filename);
		Thread.sleep(1000);
		System.out.println("Fim");
	}
	public void increaseVolum(int levels){
		System.out.println("Aumentando o volume em: "+levels);
	}
	public void decreaseVolum(int levels){
		System.out.println("Diminuindo o volume em: "+levels);
	}
}
