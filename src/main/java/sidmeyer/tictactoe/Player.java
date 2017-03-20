package sidmeyer.tictactoe;

public class Player {
	private final String name;
	private final Figure figure;
	
	
	public Player(String name, Figure figure) {
		super();
		this.name = name;
		this.figure = figure;
	}


	public String getName() {
		return name;
	}

	public Figure getFigure() {
		return figure;
	}
	
}
