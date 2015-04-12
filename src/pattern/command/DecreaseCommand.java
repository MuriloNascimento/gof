package pattern.command;

public class DecreaseCommand implements Command {
	
	private Player player;
	private int levels;

	@Override
	public void executa() {
		this.player.decreaseVolum(levels);
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getLevels() {
		return levels;
	}

	public void setLevels(int levels) {
		this.levels = levels;
	}

	public DecreaseCommand(Player player, int levels) {
		super();
		this.player = player;
		this.levels = levels;
	}

}
