package sidmeyer.tictactoe;

public class GameField {
	private final int size;
	Point[][] points;
	
	public GameField(int size) {
		super();
		this.size = size;
		this.points = new Point[size][size];
	}
	
	public Point getPoint(int x, int y) {
		return points[x][y];
	}
	
	public int getSize() {
		return size;
	}

	public void initializeField() {
		for(int y=0; y<points.length; y++) {
			for(int x=0; x<points[y].length; x++) {
				points[x][y] = new Point(x, y);
			}
		}
	}
	
	public boolean isFieldFull() {
		for(int y=0; y<points.length; y++) {
			for(int x=0; x<points[y].length; x++) {
				if(points[x][y].getFigure().getFigure().equals(Figures.EMPTY)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isVictory() {
		if(isRowVictory()) return true;
		if(isColumnVictory()) return true;
		if(isDiagonalVictory()) return true;
		return false;
	}

	private boolean isDiagonalVictory() {
		for(int x=0, y=0; x<size-1; x++, y++) {
			if(points[x][y].getFigure().getFigure().equals(Figures.EMPTY)) break;
			if(!points[x][y].getFigure().getFigure().equals(points[x+1][y+1].getFigure().getFigure())) {
				break;
			} else if(x+1 == size-1) {
				System.out.println("Diagonal \\ Win!"); //test
				return true;
			}
		}
		for(int x=0, y=size-1; x<size-1; x++, y--) {
			if(points[x][y].getFigure().getFigure().equals(Figures.EMPTY)) break;
			if(!points[x][y].getFigure().getFigure().equals(points[x+1][y-1].getFigure().getFigure())) {
				break;
			} else if(x+1 == size-1) {
				System.out.println("Diagonal / Win!"); //test
				return true;
			}
		}
		return false;
	}

	private boolean isColumnVictory() {
		for(int x=0; x<size; x++) {
			for(int y=0; y<size-1; y++) {
				if(points[x][y].getFigure().getFigure().equals(Figures.EMPTY)) break;
				if(!points[x][y].getFigure().getFigure().equals(points[x][y+1].getFigure().getFigure())) {
					break;
				} else if(y+1 == size-1) {
					System.out.println("Column Win!"); //test
					return true;
				}
			}
		}
		return false;
	}

	private boolean isRowVictory() {
		for(int y=0; y<size; y++) {
			for(int x=0; x<size-1; x++) {
				if(points[x][y].getFigure().getFigure().equals(Figures.EMPTY)) break;
				if(!points[x][y].getFigure().getFigure().equals(points[x+1][y].getFigure().getFigure())) {
					break;
				} else if (x+1 == size-1) {
					System.out.println("Row Win!"); //test
					return true;
				}
			}
		}
		return false;
	}
}
