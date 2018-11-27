package notebook.model.notebook_data;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FutureTask implements Comparable<FutureTask> {
    private String currentDate;
    private String taskDate;
    private String task;

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
    	this.currentDate = new SimpleDateFormat("dd.MM.yyyy (E), hh:mm:ss a").format(currentDate).toString();
    }
    
    public void setCurrentDate(String currentDate) {
    	this.currentDate = currentDate;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public int compareTo(FutureTask o) {
        return currentDate.compareTo(o.currentDate);
    }
}
