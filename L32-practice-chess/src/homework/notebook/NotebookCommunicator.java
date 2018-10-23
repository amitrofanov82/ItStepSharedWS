package homework.notebook;

import java.util.Scanner;

public class NotebookCommunicator {
    private Notebook notebook = new Notebook();
    private Scanner in = new Scanner(System.in);
    private boolean exit = false;

    public boolean isExit() {
        return exit;
    }

    public void start() {
        switch (askType()) {
            case 1:
                operationNote(askOperation());
                break;
            case 2:
                operationFutureTask(askOperation());
                break;
            case 3:
                operationCredentialRecord(askOperation());
                break;
            case 4:
                exit = true;
                break;
            default:
                print("Такого действия не существует!");
                break;
        }
    }

    private int askType() {
        while (true) {
            print("Выберите тип данных");
            print("1 - Заметка");
            print("2 - Задача");
            print("3 - Пароль к сайту");
            print("4 - Завершить программу");
            try {
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                print("Некорректный ввод! Повторите попытку!");
            }
        }
    }

    private int askOperation() {
        while (true) {
            print("Что вы хотите сделать?");
            print("1 - Добавить запись");
            print("2 - Показать запись");
            print("3 - Показать все записи");
            print("4 - Удалить запись");
            print("5 - Удалить все записи");
            print("6 - Заменить запись");
            try {
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                print("Некорректный ввод! Повторите попытку!");
            }
        }
    }


    private void operationNote(int numberOperation) {
        switch (numberOperation) {
            case 1:
                print("Введите текст заметки");
                print(notebook.addNote(in.nextLine()));
                break;
            case 2:
                while (true) {
                    print("Введите номер заметки");
                    try {
                        print(notebook.getNote(Integer.parseInt(in.nextLine())));
                        break;
                    } catch (NumberFormatException e) {
                        print("Некорректный ввод! Повторите попытку!");
                    }
                }
                break;
            case 3:
                print(notebook.getAllNotes());
                break;
            case 4:
                while (true) {
                    print("Введите номер удаляемой заметки");
                    try {
                        print(notebook.removeNote(Integer.parseInt(in.nextLine())));
                        break;
                    } catch (NumberFormatException e) {
                        print("Некорректный ввод! Повторите попытку!");
                    }
                }
                break;
            case 5:
                print(notebook.removeAllNotes());
                break;
            case 6:
                int number;
                while (true) {
                    print("Введите номер изменяемой заметки");
                    try {
                        number = Integer.parseInt(in.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        print("Некорректный ввод! Повторите попытку!");
                    }
                }
                print("Введите новый текст заметки");
                print(notebook.changeNote(number, in.nextLine()));
                break;
            default:
                print("Такого действия не существует!");
                break;
        }
    }

    private void operationFutureTask(int numberOperation) {
        switch (numberOperation) {
            case 1:
                print("Введи описание задачи");
                String task = in.nextLine();
                print("Введите дату исполнения");
                print(notebook.addFutureTask(task, in.nextLine()));
                break;
            case 2:
                while (true) {
                    print("Которую по очереди?");
                    try {
                        print(notebook.getFutureTask(Integer.parseInt(in.nextLine())));
                        break;
                    } catch (NumberFormatException e) {
                        print("Некорректный ввод! Повторите попытку!");
                    }
                }
                break;
            case 3:
                print(notebook.getAllFutureTask());
                break;
            case 4:
                while (true) {
                    print("Которую по очереди?");
                    try {
                        print(notebook.removeFutureTask(Integer.parseInt(in.nextLine())));
                        break;
                    } catch (NumberFormatException e) {
                        print("Некорректный ввод! Повторите попытку!");
                    }
                }
                break;
            case 5:
                print(notebook.removeAllFutureTasks());
                break;
            case 6:
                print("Введи описание задачи");
                String task2 = in.nextLine();
                print("Введите дату исполнения");
                String date = in.nextLine();
                while (true) {
                    print("Какую по очереди заменить?");
                    try {
                        print(notebook.changeFutureTask(task2, date, Integer.parseInt(in.nextLine())));
                        break;
                    } catch (NumberFormatException e) {
                        print("Некорректный ввод! Повторите попытку!");
                    }
                }
                break;
            default:
                print("Такого действия не существует!");
                break;
        }
    }

    private void operationCredentialRecord(int numberOperation) {
        switch (numberOperation) {
            case 1:
                print("Введите адрес сайта");
                String url = in.nextLine();
                print("Введите логин");
                String login = in.nextLine();
                print("введите пароль");
                String pass = in.nextLine();
                print(notebook.addUrlPass(url, login, pass));
                break;
            case 2:
                print("Введите адрес сайта");
                print(notebook.getUrlPass(in.nextLine()));
                break;
            case 3:
                print(notebook.getAllUrlPass());
                break;
            case 4:
                print("Введите адрес сайта");
                print(notebook.removeUrlPass(in.nextLine()));
                break;
            case 5:
                print(notebook.removeAllUrlPass());
                break;
            case 6:
                operationCredentialRecord(1);
                break;
        }
    }

    private void print(String text) {
        System.out.println(text);
    }
}
