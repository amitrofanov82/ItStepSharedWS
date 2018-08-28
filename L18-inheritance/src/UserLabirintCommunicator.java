
import java.util.Scanner;

public class UserLabirintCommunicator {

    private Scanner scanner = new Scanner(System.in);
    private String userName;

    public void askName() {
        System.out.println("Введите ваше имя");
        this.userName = scanner.nextLine();
    }

    public String getUserName() {
        return userName;
    }

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
            sendMessage("Введите вероятность стенки от 0.1 до 1:");
            userInput = scanner.nextLine();
        } while (!stringIsNumber(userInput));
        return Double.parseDouble(userInput);
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public void drawLabirinth(Labirinth lab) {
        int[][] arrIn = lab.getLabirint();
        System.out.print("\r");
        for (int i = 0; i < arrIn.length; i++) {
            for (int j = 0; j < arrIn.length; j++) {
                System.out.print(arrIn[i][j] + "|");
            }
            System.out.println();
        }
    }

    /**
     * @return 0 - exit, 1-4 from up clockwise
     */
    public int askNextMove() {
        String userInput;
        do {
            sendMessage("Куда пойдем, " + userName + "?");
            sendMessage("1 - вверх, 2 - вправо 3 - вниз, 4 - влево, 0 - выход");
            userInput = scanner.nextLine();
        } while (!stringIsNumber(userInput));
        return Integer.parseInt(userInput);
    }

    //спросить в конце игры
    public int askEnd() {
        sendMessage("0 - завершить программу, 1 - запустить заново");
        String userInput;
        do {
            userInput = scanner.nextLine();
        } while (!stringIsNumber(userInput));
        return Integer.parseInt(userInput);
    }

    //проверка нет ли ничего в строке кроме цифр и точки
    private boolean stringIsNumber(String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            if ((int) userInput.charAt(i) < 46 || (int) userInput.charAt(i) > 57) {
                sendMessage("Данные не корректны! Повторите ввод");
                return false;
            }
        }
        return true;
    }

}
