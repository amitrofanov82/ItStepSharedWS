package lesson17.encapsulation;

import java.util.Scanner;

public class UserLabirintCommunicator {
	
	private Scanner scanner = new Scanner(System.in);
	private String userName = "Пятачок";
	
	public int askLabirinthSize() {
		String userInput;
		do {
			sendMessage("Введите размер лабиринта:");
			userInput = scanner.nextLine();
		} while (!stringIsNumber(userInput));
		return Integer.parseInt(userInput);
	}

	public double askWallProbability() {
		String userInput;
		do {
			sendMessage("Введите вероятность стенки:");
			userInput = scanner.nextLine();
		} while (!stringIsNumber(userInput));
		return Double.parseDouble(userInput);
	}
	
	public void sendMessage(String message) {
		System.out.println(message);
	}
	
	public void drawLabirinth(Labirinth lab) {
		int[][] arrIn = lab.getLabirint();
        for (int i = 0; i < arrIn.length; i++) {
            for (int j = 0; j < arrIn.length; j++) {
                System.out.print(arrIn[i][j] + "|");
            }
            System.out.println();
        }
	}
	
	/** @return 0 - exit, 1-4 from up clockwise */
	public int askNextMove() {
		String userInput;
		do {
			sendMessage("Куда пойдем, :" + userName);
			userInput = scanner.nextLine();
		} while (!stringIsNumber(userInput));
		return Integer.parseInt(userInput);
	}
	
	private boolean stringIsNumber(String userInput) {
		// TODO проверить в цикле, что там цифры и точка
		return true;
	}

}
