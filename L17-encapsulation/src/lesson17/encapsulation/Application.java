package lesson17.encapsulation;

public class Application {
	
	public static void main(String[] args) {
		
		//Приветствуем пользователя:
		UserLabirintCommunicator userCom = new UserLabirintCommunicator();
		userCom.sendMessage("Hi, lets play labirinth!");
		
		//Спрашиваем размер и вероятность стенки в случйной клетке
		int labSize = userCom.askLabirinthSize();
		double probability = userCom.askWallProbability();
		
		//создать лабиринт, и рисуем получившийся лабиринт
		Labirinth lab = new Labirinth(labSize, probability);
		userCom.drawLabirinth(lab);
		
		//цикл:
		int userAnswer = -1;
		while (userAnswer != 0){
			//спрашиваем куда пойти, или, быть может, выйти из программы
			//перерисываем или выходим, если пользователь попросит
			userAnswer = userCom.askNextMove();
			switch (userAnswer){
			case 1:
				//go up
				break;
			case 2:
				//go right
				break;
			case 3:
				//go down
				break;
			case 4:
				//go left
				break;
			default: 	
				userCom.sendMessage("Не знаю такого направления, повторите вашу мысль");
			}
		}
		System.out.println("Конец");
		
	}
	
}
