package lesson36.enumcontinue;

public  enum Lang {
    RUSSIAN(1),ENGLISH(2);	
	
	int a;
	
	Lang(int i) {
		a = i;
	}
	
	public String getAlfabet(){
		switch(this){
		case RUSSIAN:
			return "абв";
		case ENGLISH:
			return "abc";
		default: 
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Суахили я";
	}
	
	//@Override - final
	//public String name() {
		//return "Не скажу";

	//}
}
