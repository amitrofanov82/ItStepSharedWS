
public class LabirinthGame {
	
	public void play(){

        UserLabirintCommunicator userCom = new UserLabirintCommunicator();

        while (true) {
            //Запрашиваем имя
            userCom.askName();

            //Приветствуем пользователя:
            userCom.sendMessage("Приветствую, " + userCom.getUserName() + "!!! Приступим!");

            //Спрашиваем размер и вероятность стенки в случйной клетке, создаем лабиринт
            int labSize;
            double probability;
            Labirinth lab;

            do {
                labSize = userCom.askLabirinthSize();
                probability = userCom.askWallProbability();
                lab = new Labirinth(labSize, probability);
            } while (lab.getLabirint() == null);

            //Рисуем лабиринт
            userCom.drawLabirinth(lab);


            //цикл:
            int userAnswer = -1;
            while (userAnswer != 0 && !lab.getExitFoundUsr()) {
                //спрашиваем куда пойти, или, быть может, выйти из программы
                //перерисываем или выходим, если пользователь попросит
                userAnswer = userCom.askNextMove();
                switch (userAnswer) {
                    case 0:
                        userCom.sendMessage("Вы вышли из игры");
                        break;
                    case 1:
                        lab.move(2);
                        userCom.drawLabirinth(lab);
                        break;
                    case 2:
                        lab.move(1);
                        userCom.drawLabirinth(lab);
                        break;
                    case 3:
                        lab.move(3);
                        userCom.drawLabirinth(lab);
                        break;
                    case 4:
                        lab.move(0);
                        userCom.drawLabirinth(lab);
                        break;
                    default:
                        userCom.sendMessage("Не знаю такого направления, повторите вашу мысль");
                }
            }

            if (userCom.askEnd() == 0) {
                break;
            } else {
                continue;
            }

        }
        System.out.println("Конец");
		
	}
	
	
	
}
