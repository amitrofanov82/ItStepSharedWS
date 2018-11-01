package lesson35.enums;

public enum DoW {
    MON("мандей","пон-к"),TUE,WED("wednesday","передчетвергом"),THU,FRI,SHA("shabat","евродень"),SUN;
	
	private String englishName = "some day";
	private String russianName = "я день недели";
	
	private DoW() {
		//System.out.println("создаю новый день недели");
	}
	
	private DoW(String ename, String rname) {
		//System.out.println("создаю день недели крутым конструктором");
		englishName = ename;
		russianName = rname;
	}
	
	public String getLocaliazedName(Lang language){
		return (language == Lang.ENGLISH ? englishName : russianName) ;
	}
	
	
}
