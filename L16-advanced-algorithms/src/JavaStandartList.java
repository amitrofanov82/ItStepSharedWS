import java.util.ArrayList;
import java.util.LinkedList;

public class JavaStandartList {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		
		al.add("array element 1");
		al.add("array element 2");
		al.set(0, "перезаписан 0");
		
		System.out.println(al);
		
	}
	
}
