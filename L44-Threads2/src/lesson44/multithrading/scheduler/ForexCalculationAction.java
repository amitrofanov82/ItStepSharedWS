package lesson44.multithrading.scheduler;

import java.util.Date;

public class ForexCalculationAction extends Action {

	@Override
	public double execute() {
		System.out.println("Считаю курс доллара...");
		try {
			Thread.sleep((long) (Math.random()*12000));
		} catch (InterruptedException e) {
			//nothing
		}
		double result = Math.random();
		System.out.println(new Date() + " доллар = " + result);
		return result;
	}

}
