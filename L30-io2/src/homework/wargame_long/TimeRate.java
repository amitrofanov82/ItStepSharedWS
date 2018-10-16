import java.util.Scanner;

public class TimeRate {

	private double s1, x1, x2;
	private double t1, t2;
	private double p, d;

	public TimeRate() {

		System.out.print("Enter please s1 = ");
		s1 = inputShuttlePuth();
		System.out.print("Enter please x1 = ");
		x1 = inputVasjaStart(s1);
		System.out.print("Enter please x2 = ");
		x2 = inputVasjaFinish(s1, x1);
		System.out.print("Enter please t1 = ");
		t1 = inputObjectTimePerSecond();
		System.out.print("Enter please t2 = ");
		t2 = inputObjectTimePerSecond();
		System.out.print("Enter please p = ");
		p = ShuttlePoint(s1);
		System.out.print("Enter please d = ");
		d = inputBusDirection();

	}

	public double vasyaTime() {
		double vasyaTime = (x2 - x1) * t2;
		if (x1 > x2) {
			vasyaTime = -vasyaTime;
		}

		return vasyaTime;
	}

	public double busTime(double vasyaTime) {
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

	public double checkParameter() {
		Scanner input = new Scanner(System.in);
		boolean numberFormatCheck = false;
		double j = 0;
		try {
			String s = input.nextLine();
			j = Double.parseDouble(s);
			numberFormatCheck = true;
		} catch (NumberFormatException e) {
		}
		if (numberFormatCheck == false) {
			throw new InputExceptions("Entered symbols isn't double");
		}

		if (j < 0) {
			throw new InputExceptions("Entered symbols is negative number"
					+ "\nEnter please positive enteger");
		}
		return j;
	}

	public double inputParameter() {
		boolean checkParameter = true;
		double d = 0;
		while (checkParameter) {
			try {
				d = checkParameter();
				checkParameter = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return d;
	}

	public double inputShuttlePuth() {
		boolean checkParameter = true;
		double d = 0;
		while (checkParameter) {
			try {
				d = checkParameter();
				if (d > 2000 || d < 2) {
					throw new InputExceptions(
							"Enter the puth of shuttle bigger than 2"
									+ "\n and smaller than 2000");
				}
				checkParameter = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return d;
	}

	public double inputVasjaStart(double s1) {
		boolean checkParameter = true;
		double d = 0;
		while (checkParameter) {
			try {
				d = checkParameter();
				if (d > s1 || d < 0) {
					throw new InputExceptions(
							"Enter point smaller shuttle puth"
									+ "\n and bigger than 0");
				}
				checkParameter = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return d;
	}

	public double inputVasjaFinish(double shuttlePuth, double vasjaStartPoint) {
		boolean checkParameter = true;
		double vasjaFinishPoint = 0;
		while (checkParameter) {
			try {
				vasjaFinishPoint = checkParameter();
				if (vasjaFinishPoint > shuttlePuth || vasjaFinishPoint < 0) {
					throw new InputExceptions(
							"Enter point smaller shuttle puth"
									+ "\n and bigger than 0");
				}
				if (vasjaFinishPoint == vasjaStartPoint) {
					throw new InputExceptions("Vajya have already arrived"
							+ "\n enter new point");
				}
				checkParameter = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return vasjaFinishPoint;
	}

	public double ShuttlePoint(double shuttlePuth) {
		boolean checkParameter = true;
		double d = 0;
		while (checkParameter) {
			try {
				d = checkParameter();
				if (d > shuttlePuth - 1 || d < 1) {
					throw new InputExceptions(
							"Enter the shuttle point bigger than 1"
									+ "\n and smaller than shuttle Puth - "
									+ (shuttlePuth - 1));
				}
				checkParameter = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return d;
	}

	public double inputBusDirection() {
		Scanner input = new Scanner(System.in);
		boolean checkDirection = true;
		double shuttleDirection = 0;
		while (checkDirection) {
			try {
				shuttleDirection = Double.parseDouble(input.nextLine());
				if (shuttleDirection != -1 && shuttleDirection != 1) {
					throw new InputExceptions("Enter please direction"
							+ "\n 1 - forward; -1 - return");
				}
				checkDirection = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return shuttleDirection;
	}

	public double inputObjectTimePerSecond() {
		boolean checkParameter = true;
		double d = 0;
		while (checkParameter) {
			try {
				d = checkParameter();
				if (d > 2000 || d < 1) {
					throw new InputExceptions("Enter number bigger than 2"
							+ "\n and smaller than 2000");
				}
				checkParameter = false;
			} catch (InputExceptions e) {
				System.out.println(e.getMessage());
				System.out.println("try again");
			}
		}
		return d;
	}

}
