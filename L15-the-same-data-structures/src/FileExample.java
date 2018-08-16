import java.io.File;

public class FileExample {
	
	public static void main(String[] args) {
		File f = new File("u:\\Mitrofanov\\Eclipse_WS\\");
		File f2 = new File("jhsd\t$$''\"gashajkgf");
		File f3 = new File("jhsajkgf");
		
		
		System.out.println("exists: " + f.exists());
		System.out.println("isDirectory: " + f.isDirectory());
		System.out.println("list: " + f.list());
		System.out.println("listFiles: " + f.listFiles());
		System.out.println("getName: " + f.getName());
		System.out.println("getAbsolutePath: " + f.getAbsolutePath());
		
		System.out.println("-----------------------");
		System.out.println("exists: " + f2.exists());
		System.out.println("isDirectory: " + f2.isDirectory());
		System.out.println("list: " + f2.list());
		System.out.println("listFiles: " + f2.listFiles());
		System.out.println("getName: " + f2.getName());
		System.out.println("getAbsolutePath: " + f2.getAbsolutePath());
		
		System.out.println("----------------------");
		System.out.println("exists: " + f3.exists());
		System.out.println("isDirectory: " + f3.isDirectory());
		System.out.println("list: " + f3.list());
		System.out.println("listFiles: " + f3.listFiles());
		System.out.println("getName: " + f3.getName());
		System.out.println("getAbsolutePath: " + f3.getAbsolutePath());
		
		
	}
	
}
