public class Labirinth {

    private static final int[] K = {0, 0, -1, 1}; // массив для проверки соседних ячеек справа и слева
    private static final int[] L = {-1, 1, 0, 0}; // массив для проверки соседних ячеек сверху и снизу

    
    public int oneMoreField = 13;
	private int publichnoeVsemNuznoePole = 12;
    
    
    private int[] exit = {0, 0}; // найденый выход запишется сюда
    private boolean exitFound = false; //нашёл ли dfs выход
    private boolean exitFoundUsr = false; //нашёл ли игрок выход
    private int[][] labirinth; //массив лабиринта
    private int[] myPosition = new int[2]; //массив с данными о текущей позиции игрока

    public Labirinth(int labSize, double probability) {
        System.out.println("ГЕНЕРАЦИЯ ЛАБИРИНТА, ПОДОЖДИТЕ");
        int dfsCount = 0; //счетчик проверок на проходимость лабиринта
        //проверять лабиринт, переделывая, пока не станет проходимым
        while (!exitFound) {
            //содается лабиринт по указанному размеру + 2 доп строки и слобца для стен
            labirinth = new int[labSize + 2][labSize + 2];
            //края зполняются стенами
            for (int i = 0; i < labirinth.length; i++) {
                labirinth[0][i] = 1;
                labirinth[labirinth.length - 1][i] = 1;
                labirinth[i][0] = 1;
                labirinth[i][labirinth.length - 1] = 1;
            }

            //определяем выход по центру справа
            labirinth[(labirinth.length - 1) / 2][labirinth.length - 1] = 3;
            //и кол-во стен внутри
            int walls = (int) (labSize * labSize * probability);


            //заполнение лабиринта стенами
            while (walls != 0) {
                int a = (int) (Math.random() * labSize + 1);
                int b = (int) (Math.random() * labSize + 1);
                if (labirinth[a][b] == 0) {
                    labirinth[a][b] = 1;
                    walls--;
                }
            }

            //создаем копию лабиринта для проверки на проходимость
            int[][] temp = new int[labirinth.length][labirinth.length];
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    temp[i][j] = labirinth[i][j];
                }
            }

            //отправляем копию на проверку на проходимость
            dfs(temp, ((labirinth.length - 1) / 2), 1);
            dfsCount++;
            if (dfsCount == 100000 / labSize) {
                //если за 100000 попыток не удалось создать проходимый лабиринт
                System.out.println("Лабиринт с полученными данными не проходной! Введите корректные данные");
                labirinth = null;
                break;
            }

            //определяем начальную позицию игрока
            myPosition[0] = (labirinth.length - 1) / 2;
            myPosition[1] = 1;
            labirinth[myPosition[0]][myPosition[1]] = 5;
        }


    }

    // поиск в глубину
    private void dfs(int[][] lab, int x, int y) {
        if (exitFound) {
            return;
        }

        lab[x][y] = 2;
        for (int i = 0; i < 4; i++) {
            if (lab[x + K[i]][y + L[i]] == 3) {
                exit[0] = x + K[i];
                exit[1] = y + L[i];
                exitFound = true;
                return;
            } else if (lab[x + K[i]][y + L[i]] == 0) {
                dfs(lab, x + K[i], y + L[i]);
            }
        }
    }

    //ход игрока
    public void move(int direction) {
        //если в выбраной позиции свободно, переходим туда.
        if (labirinth[myPosition[0] + K[direction]][myPosition[1] + L[direction]] == 0) {
            labirinth[myPosition[0]][myPosition[1]] = 0;
            labirinth[myPosition[0] + K[direction]][myPosition[1] + L[direction]] = 5;
            myPosition[0] += K[direction];
            myPosition[1] += L[direction];
            //если там стена - выводим сообщение о стене, стоим на месте
        } else if (labirinth[myPosition[0] + K[direction]][myPosition[1] + L[direction]] == 1) {
            System.out.println("Вы уперлись в стену, ходите заново!");
            //если выход - поздравялем и выходим из цикла
        } else {
            System.out.println("----------------------------");
            System.out.println("Вы нашли выход! ПОЗДРАВЯЛЕМ!");
            System.out.println("----------------------------");
            labirinth[myPosition[0]][myPosition[1]] = 0;
            labirinth[myPosition[0] + K[direction]][myPosition[1] + L[direction]] = 5;
            exitFoundUsr = true;
        }
    }

    public int[][] getLabirint() {
        return labirinth;
    }

    public boolean getExitFoundUsr() {
        return exitFoundUsr;
    }

	public int getPublichnoeVsemNuznoePole() {
		// rasschityvaem znacheniem, chto-to proveryaem
		// return resultat
		//
		return publichnoeVsemNuznoePole;
	}

	public void setPublichnoeVsemNuznoePole(int publichnoeVsemNuznoePole) {
		this.publichnoeVsemNuznoePole = publichnoeVsemNuznoePole;
	}
}
