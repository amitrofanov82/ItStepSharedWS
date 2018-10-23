package homework.notebook.notebook_data;

import java.util.Date;

public class FutureTask implements Comparable<FutureTask> {
    private Date currentDate;
    private String taskDate;
    private String task;

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
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
