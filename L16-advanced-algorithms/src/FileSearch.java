import java.io.File;

public class FileSearch {
	
	public static void main(String[] args) {
		File f = new File("E:\\Eclipce_WS\\ItStepSharedWS\\LabyrinthExit\\");
		System.out.println("Root file is:\n"+f.getName());
		fun(f,"");
	}
	
	public static void fun (File file, final String outputIndent) {
		File [] fList = file.listFiles(); // создаем массив файла из его элементов
		for (int i = 0; i<fList.length; i++) { // перебираем массив
			if (fList[i].isDirectory()) { // проверяем не папка ли
				System.out.println(outputIndent+"DIR: "+fList[i].getName()); // печать табов+ статус (ДИР) + имя папки
				fun(fList[i], outputIndent + "\t"); // если папка - рекурсивно проверяем ее содержимое
			} else { // если убрать else - тоже красиво выходит
				System.out.println(outputIndent+"File: "+fList[i].getName()); // если файла все же не "папка", 
																// то, рекурсия заканчивается
																// печать табов+ статус (ФАЙЛ) + имя файла
			}
		}
		
	}
	
}
