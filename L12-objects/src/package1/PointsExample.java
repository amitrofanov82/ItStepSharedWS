package package1;

import package2.Point;


public class PointsExample {
	
	/*static class Point {
		int x;
		int y;
	}*/
	
	public static void main(String[] args) {
		//int[][] massivTochek = new int[20][3];
		
		
		Point p = new Point();
		Point p2 = new Point();
		System.out.println(p.x);
		p.y=2;
		p.x=5;
		System.out.println(p.x);
		
		
		PointsExample pe = new PointsExample();
		
		Point[] massivTochek = new Point[20];
		
		for (int i=0; i < massivTochek.length; i++) {
			massivTochek[i] = new Point();
			massivTochek[i].x = (int) (Math.random()*100);
			massivTochek[i].y = (int) (Math.random()*100);
		}
		
		printPointsArray(massivTochek);
		
		double minDist = distance(massivTochek[0], massivTochek[1]);
		System.out.println("initial minDist = " + minDist);
		for (int i=0; i < massivTochek.length; i++) {
			for (int j=i+1; j < massivTochek.length; j++) {
				if (distance(massivTochek[i],massivTochek[j]) < minDist) {
					minDist = distance(massivTochek[i],massivTochek[j]);
					System.out.println("p1.x = " + massivTochek[i].x 
							+ "p1.y = " + massivTochek[i].y
							+ "p2.x = " + massivTochek[j].x
							+ "p2.y = " + massivTochek[j].y
							+ ": new minD = " + minDist);
				}
			}
		}
		System.out.println(minDist);

	}

	private static double distance(Point p1, Point p2) {
		double d = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
		return d;
	}
	
	private static void printPointsArray(Point[] massivTochek) {
		for (int i = 0; i < massivTochek.length; i++) {
			massivTochek[i].print();
		}
	}

}
