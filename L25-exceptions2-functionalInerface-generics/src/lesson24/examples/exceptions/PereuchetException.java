package lesson24.examples.exceptions;

import java.time.LocalDate;

public class PereuchetException extends RuntimeException {
    private String guiltySalesPerson;
    private LocalDate kosyakTime = LocalDate.now();
	


    public PereuchetException(String message, String guiltySalesPerson) {
        super(message);
        this.guiltySalesPerson = guiltySalesPerson;
    }

	public String getGuiltySalesPerson() {
		return guiltySalesPerson;
	}

	public LocalDate getKosyakTime() {
		return kosyakTime;
	}


}
