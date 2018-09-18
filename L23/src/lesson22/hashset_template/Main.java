package lesson22.hashset_template;

import java.io.File;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Set set = new HashSet();
        Object testObject1 = new Object();
        Object testObject2 = new Object();
        File testObject3 = new File("d:/dir1/fname.txt");
        Object testObject4 = new Object();
        String testObject5 = "jahdfjhfg";
        Object testObject6 = new Scanner(System.in);
        Object testObject7 = new Object();

        set.add(testObject1);
        set.add(testObject1);
        set.add(testObject2);
        set.add(testObject3);
        set.add(testObject4);
        set.remove(testObject1);
        set.add(testObject5);
        set.add(testObject6);


        System.out.println(set.contains(testObject1));//false
        System.out.println(set.contains(testObject2));//true
        System.out.println(set.contains(testObject3));//true
        System.out.println(set.contains(testObject4));//true
        System.out.println(set.contains(testObject5));//true
        System.out.println(set.contains(testObject6));//true
        System.out.println(set.contains(testObject7));//false

        
        System.out.println(set.size());
        
        System.out.println(set.next());//someobject1
        System.out.println(set.next());//someobject2
        System.out.println(set.next());//someobject3
        System.out.println(set.next());//someobject4
        System.out.println(set.next());//someobject5
        System.out.println(set.next());//someobject1
        System.out.println(set.next());//someobject2
        System.out.println(set.next());//someobject3
        System.out.println(set.next());//someobject4
        System.out.println(set.next());//someobject5




        /*
        Set catsSet = new HashSet();
        Set dogSet = new HashSet();
        Set filesSet = new HashSet();
        
        filesSet.add(new File("somefile"));
        File f;
        if ((f = (File) filesSet.next()) instanceof File )
        	f = (File) filesSet.next();
    	}*/

    }
}
