package sidmeyer.tictactoe;

public class Point {
	private final int x, y;
	private boolean checked = false;
	private Figure figure = new Figure(Figures.EMPTY);

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Figure getFigure() {
		return figure;
	}
	
	public void setFigure(Figure figure) {
		this.figure = figure;
	}
	
	public boolean isPointEmpty() {
		return figure.getFigure().equals(Figures.EMPTY) ? true: false;
	}
}
