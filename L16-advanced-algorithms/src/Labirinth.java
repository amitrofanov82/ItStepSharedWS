public class Labirinth {

    private final static int[] k = {0, 0, -1, 1}; //массив для проверки соседних ячеек справа и слева
    private final static int[] l = {-1, 1, 0, 0}; //массив для проверки соседних ячеек сверху и снизу

    private static int[] exit = {0, 0}; //найденый выход запишется сюда

    
    private static boolean exitFound = false;

    private static void printArr2d(int[][] arrIn) { //метод вывода массива
        for (int i = 0; i < arrIn.length; i++) {
            for (int j = 0; j < arrIn.length; j++) {
                System.out.print(arrIn[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static void dfs(int[][] lab, int x, int y) { //поиск в глубину
    	if (exitFound) {
    		return;
    	}
    	
        lab[x][y] = 2;
        for (int i = 0; i < 4; i++) {
            if (lab[x + k[i]][y + l[i]] == 3) {
                exit[0] = x + k[i];
                exit[1] = y + l[i];
                exitFound = true;
                return;
            } else if (lab[x + k[i]][y + l[i]] == 0) {
                dfs(lab, x + k[i], y + l[i]);
            }
        }


    }

    public static void main(String[] args) {

        //0 - пустая клетка, 1 - стенка, 2 - клетка где были, 3 - выход, 5 начальная точка
        int[][] labirint = {
                {1, 3, 1, 1, 1, 1, 1},
                {1, 5, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 1},
                {1, 0, 0, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}
             };

        dfs(labirint, 1, 1); //запускаем поиск, передаем лабиринт и координаты начальной точки


        printArr2d(labirint); //выводим пройденый лабиринт
        System.out.println("выход в точке x = " + exit[1] + " y = " + exit[0]); //выводим координаты выхода
    }
}
