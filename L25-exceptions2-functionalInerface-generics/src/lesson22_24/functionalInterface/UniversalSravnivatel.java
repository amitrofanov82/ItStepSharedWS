package lesson22_24.functionalInterface;

public class UniversalSravnivatel implements Sravnivatel {

	@Override
	public int sravni(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return o1.getClass().toString().compareTo(o2.getClass().toString()) ;
	}

}
