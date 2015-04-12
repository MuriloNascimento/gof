package pattern.command;

public class TestCommand {

	public static void main(String[] args) {
		Player player =  new Player();
		CommandList comandList = new CommandList();
		
		comandList.add(new PlayCommand(player, "the_bledding.mp3"));
		comandList.add(new IncreaseCommand(player, 30));
		
		comandList.executa();
	}

}
