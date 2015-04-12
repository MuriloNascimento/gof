package pattern.command;

public class PlayCommand implements Command{
	
	private Player player;
	private String file;

	public PlayCommand(Player player, String file) {
		super();
		this.player = player;
		this.file = file;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public void executa() {
		try {
			this.player.play(this.file);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
