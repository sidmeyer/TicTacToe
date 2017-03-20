package sidmeyer.tictactoe;

public class FieldViewer {
	public static void showField(GameField field) {
		for(int y=0; y<field.getSize(); y++) {
			for(int x=0; x<field.getSize(); x++) {
				System.out.print(pointString(field.getPoint(x, y)));
				if(x != field.getSize()-1)
					System.out.print("|");
			}
			System.out.println();
			if(y != field.getSize()-1) {
				for(int i=0; i<field.getSize()-1; i++) {
					System.out.print("----");
				}
				System.out.println("---");
				
			}
				
		}
	}
	
	private static String pointString(Point point) {
		switch(point.getFigure().getFigure()) {
		case X:	return " X ";
		case O: return " O ";
		}
		return "   ";
	}
}
