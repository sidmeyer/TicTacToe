package sidmeyer.tictactoe;

import java.util.Scanner;

public class MoveInput {
	public static int[] getCoordinates(Player player) {
		while(true) {
			try{
				Scanner scn = new Scanner(System.in);
				int[] coodrdinates = {scn.nextInt()-1, scn.nextInt()-1};
				return coodrdinates;
			} catch(Exception e) {
				System.out.println("Invalid input! Example: \"2 1\". Repeat.");
			}
		}
	}
}
