package lesson40.swing2.notebook.model.notebook_data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
    private String currentDate;
    private String note;

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
    	this.currentDate = new SimpleDateFormat("dd.MM.yyyy (E), hh:mm:ss a").format(currentDate).toString();
    }
    
    public void setCurrentDate(String currentDate) {
    	this.currentDate = currentDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
