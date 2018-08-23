package lesson17.encapsulation;
public class Labirinth {

    private final static int[] K = {0, 0, -1, 1}; //массив для проверки соседних ячеек справа и слева
    private final static int[] L = {-1, 1, 0, 0}; //массив для проверки соседних ячеек сверху и снизу

    private int[] exit = {0, 0}; //найденый выход запишется сюда
    private boolean exitFound = false;
    private int[][] labirint = {
						        {1, 3, 1, 1, 1, 1, 1},
						        {1, 0, 0, 0, 0, 0, 1},
						        {1, 0, 0, 1, 0, 0, 1},
						        {1, 0, 1, 1, 0, 0, 1},
						        {1, 0, 0, 1, 1, 5, 1},
						        {1, 0, 1, 0, 0, 0, 1},
						        {1, 1, 1, 1, 1, 1, 1}
						      };

    public Labirinth(int labSize, double probability) {
        //labirint = new int[labSize][labSize];
	}

    private void dfs(int[][] lab, int x, int y) { //поиск в глубину
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
    
    public void move(int direction) {
    	//TODO: сделать переход хода
    }

	public int[][] getLabirint() {
		return labirint;
	}

}
