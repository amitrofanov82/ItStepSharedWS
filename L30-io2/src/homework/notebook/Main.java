
public class Main {

    public static void main(String[] args) {
        NotebookCommunicator com = new NotebookCommunicator();
        while (!com.isExit()) {
            com.start();
        }
    }

}
