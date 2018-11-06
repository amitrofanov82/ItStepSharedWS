package lesson35.datetime;

@SuppressWarnings("serial")
public class InputUserClassExceptions extends RuntimeException {
	public  InputUserClassExceptions () {
        super();
        
    }

    public  InputUserClassExceptions (String s) {
        super(s);
    }
    
}
