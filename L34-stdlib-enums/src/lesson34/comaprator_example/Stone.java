package lesson34.comaprator_example;

public class Stone implements Comparable<Stone>{
	String form = Math.random() > 0.5 ? "krug" : "kvadrat";
	int weight = (int) (Math.random() *100) ;
	
	@Override
	public int compareTo(Stone o) {
		// TODO Auto-generated method stub
		//return this.form.charAt(1) > o.form.charAt(1) ? 1 : -1;
		return this.form.compareTo(o.form);
	}
	
	@Override
	public String toString() {
		return "Камень " + form + " весом " + weight;
	}

}
