package pattern.command;

import java.util.ArrayList;
import java.util.List;

public class CommandList {
	private List<Command> comands = new ArrayList<Command>();
	
	public void add(Command command){
		this.comands.add(command);
	}
	
	public void executa(){
		for (Command command : comands) {
			command.executa();
		}
	}
}
