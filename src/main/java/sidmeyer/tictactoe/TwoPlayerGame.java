package sidmeyer.tictactoe;

public class TwoPlayerGame {
	Player[] players = {new Player("Player1", new Figure(Figures.X)), new Player("Player2", new Figure(Figures.O))};
	GameField field = new GameField(3);
	public void start() {
		boolean gameContinue = true;
		field.initializeField();
		FieldViewer.showField(field);
		int activePlayerIndex = 0;
		Player activePlayer = players[activePlayerIndex];
		while(gameContinue) {
			
			//move
			while(true) {
				System.out.println(activePlayer.getName() + ", enter coordinates. Example: \"1 3\"");
				int[] coodrinates = MoveInput.getCoordinates(activePlayer);
				int playerX = coodrinates[0];
				int playerY = coodrinates[1];
				if(playerX>=field.getSize() || playerY>=field.getSize()) {
					System.out.println("Out of field!");
					continue;
				}
				//System.out.println("isPointEmpty: " + field.getPoint(playerX, playerY).isPointEmpty());
				// isPointEmpty()
				if(field.getPoint(playerX, playerY).isPointEmpty()) {
					field.getPoint(playerX, playerY).setFigure(activePlayer.getFigure());
					break;
				}
				System.out.println("This cell is filled. Repeat move.");
			}
			
			FieldViewer.showField(field);
			//System.out.println("checking is victory..."); //test
			//field.isVictory();
			if(field.isVictory()) {
				System.out.println(activePlayer.getName() + " won this game!!!");
				gameContinue = false;
			}
			//check avail
			//check game end
			//change player
			if(activePlayerIndex==0) {
				activePlayer = players[1];
				activePlayerIndex = 1;
			} else {
				activePlayer = players[0];
				activePlayerIndex = 0;
			}
			
			//check field full
			if(field.isFieldFull()) {
				System.out.println("Field is full.");
				gameContinue = false;
			}
			
		}
		
		System.out.println("End of game.");
	}
}
