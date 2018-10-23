package homework.wargame_short;

import java.util.Scanner;

public class MainDzWargamingShort {

	private static double s1 = 5, x1 = 4, x2 = 0;
	private static double t1 = 1, t2 = 2;
	private static double p = 3, d = 1;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter please s1 = ");
		s1 = Double.parseDouble(input.nextLine());
		System.out.print("Enter please x1 = ");
		x1 = Double.parseDouble(input.nextLine());
		System.out.print("Enter please x2 = ");
		x2 = Double.parseDouble(input.nextLine());
		System.out.print("Enter please t1 = ");
		t1 = Double.parseDouble(input.nextLine());
		System.out.print("Enter please t2 = ");
		t2 = Double.parseDouble(input.nextLine());
		System.out.print("Enter please p = ");
		p = Double.parseDouble(input.nextLine());
		System.out.print("Enter please d = ");
		d = Double.parseDouble(input.nextLine());

		double vasyaTime = vasyaTime();
		double busTime = busTime(vasyaTime);

		if (vasyaTime < busTime) {
			System.out.println("Going by foot is better for Vasya");
		} else {
			System.out.println("To take the bus is better for Vasya");
		}

		System.out.println("Vasya's time - " + vasyaTime);
		System.out.println("Bus time - " + busTime);

	}

	public static double vasyaTime() {
		double vasyaTime = (x2 - x1) * t2;
		if (x1 > x2) {
			vasyaTime = -vasyaTime;
		}

		return vasyaTime;
	}

	public static double busTime(double vasyaTime) {
		double start = 0;
		double time = 0, busTime = 0;
		double vasyaPosition = x1, busPosition = p;
		double vasyaDirection = 1;

		while (time < vasyaTime) {
			time++;
			if (x1 > x2) {
				vasyaDirection = -1;
			}

			if (busPosition == s1) {
				d = -1;
			}

			if (busPosition == start) {
				d = 1;
			}

			vasyaPosition = vasyaPosition + vasyaDirection / t2;
			busPosition = busPosition + d / t1;

			if (t1 < t2 && vasyaDirection == d && vasyaPosition == busPosition) {
				break;
			}
		}

		busTime = time + (x2 - busPosition) * d;

		return busTime;
	}

}
