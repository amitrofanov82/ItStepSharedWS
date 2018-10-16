
import java.util.Iterator;

import notebook_data.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Notebook {

    private List<Note> notes;
    private SortedSet<FutureTask> futureTasks;
    private Map<String, CredentialRecord> credentialRecordMap;

    private String formatDate(Date dateNow) {
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy (E), hh:mm");
        return date.format(dateNow);
    }

    public Notebook() {
        notes = new ArrayList<>();
        futureTasks = new TreeSet<>();
        credentialRecordMap = new HashMap<>();
    }

    public String addNote(String note) {
        Note newNote = new Note();
        newNote.setCurrentDate(new Date());
        newNote.setNote(note);
        notes.add(newNote);
        return Messages.ADD_NOTE;
    }

    public String getNote(int number) {
        if (number > notes.size()) {
            return Messages.NO_NOTE_EXISTS;
        } else {
            return number + ") " + formatDate(notes.get(number - 1).getCurrentDate()) + "\n"
                    + notes.get(number - 1).getNote() + "\n--------------\n";
        }
    }

    public String getAllNotes() {
        if (notes.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < notes.size(); i++) {
                text.append((i + 1) + ") " + formatDate(notes.get(i).getCurrentDate())
                        + "\n" + notes.get(i).getNote() + "\n");
                text.append("--------------\n");
            }
            return text.toString();
        }
    }

    public String removeNote(int number) {
        if (number > notes.size()) {
            return Messages.NO_NOTE_EXISTS;
        } else {
            notes.remove(number - 1);
            return Messages.NOTE_DELETED;
        }
    }

    public String removeAllNotes() {
        if (notes.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            while (notes.size() != 0) {
                notes.remove(0);
            }
            return Messages.NOTES_DELETED;
        }
    }

    public String changeNote(int number, String note) {
        if (number > notes.size()) {
            return Messages.NO_NOTE_EXISTS;
        } else {
            Note newNote = new Note();
            newNote.setCurrentDate(new Date());
            newNote.setNote(note);
            notes.set(number - 1, newNote);
            return Messages.NOTE_CHANGED;
        }
    }

    public String addFutureTask(String task, String date) {
        FutureTask newTask = new FutureTask();
        newTask.setCurrentDate(new Date());
        newTask.setTaskDate(date);
        newTask.setTask(task);
        futureTasks.add(newTask);
        return Messages.ADD_NOTE;
    }

    public String getFutureTask(int queue) {
        if (queue > futureTasks.size()) {
            return Messages.NO_NOTE_EXISTS;
        } else {
            Iterator<FutureTask> futureTaskIterator = futureTasks.iterator();
            FutureTask futureTask = null;
            for (int i = 0; i < queue; i++) {
                futureTask = futureTaskIterator.next();
            }
            return "Задача, опубликованная " + formatDate(futureTask.getCurrentDate()) + ":\n"
                    + futureTask.getTask() + "\nДата выполнения: " + futureTask.getTaskDate() + "\n--------------\n";
        }
    }

    public String getAllFutureTask() {
        if (futureTasks.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            Iterator<FutureTask> futureTaskIterator = futureTasks.iterator();
            FutureTask futureTask;
            StringBuilder text = new StringBuilder();
            for (int i = 0; i < futureTasks.size(); i++) {
                futureTask = futureTaskIterator.next();
                text.append("Задача, опубликованная " + formatDate(futureTask.getCurrentDate()) + ":\n"
                        + futureTask.getTask() + "\nДата выполнения: " + futureTask.getTaskDate());
                text.append("\n--------------\n");
            }
            return text.toString();
        }
    }

    public String removeFutureTask(int queue) {
        if (queue > futureTasks.size()) {
            return Messages.NO_NOTE_EXISTS;
        } else {
            Iterator<FutureTask> futureTaskIterator = futureTasks.iterator();
            for (int i = 0; i < queue; i++) {
                futureTaskIterator.next();
            }
            futureTaskIterator.remove();
            return Messages.NOTE_DELETED;
        }
    }

    public String removeAllFutureTasks() {
        if (futureTasks.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            futureTasks.clear();
            return Messages.NOTES_DELETED;
        }
    }

    public String changeFutureTask(String task2, String date, int change) {
        if (change > futureTasks.size()) {
            return Messages.NO_NOTE_EXISTS;
        } else {
            Iterator<FutureTask> futureTaskIterator = futureTasks.iterator();
            for (int i = 0; i < change; i++) {
                futureTaskIterator.next();
            }
            futureTaskIterator.remove();
            FutureTask newTask = new FutureTask();
            newTask.setCurrentDate(new Date());
            newTask.setTaskDate(date);
            newTask.setTask(task2);
            futureTasks.add(newTask);
            return Messages.NOTE_CHANGED;
        }
    }

    public String addUrlPass(String url, String login, String pass) {
        CredentialRecord logPass = new CredentialRecord();
        logPass.setLogin(login);
        logPass.setPassword(pass);
        credentialRecordMap.put(url, logPass);
        return Messages.ADD_NOTE;
    }

    public String getUrlPass(String url) {
        if (credentialRecordMap.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            Iterator<Map.Entry<String, CredentialRecord>> urlPassIterator = credentialRecordMap.entrySet().iterator();
            for (int i = 0; i < credentialRecordMap.size(); i++) {
                Map.Entry<String, CredentialRecord> entry = urlPassIterator.next();
                if (entry.getKey().equals(url)) {
                    return "Login: " + entry.getValue().getLogin()
                            + "\tPass: " + entry.getValue().getPassword() + "\n--------------\n";
                }
            }
            return Messages.NO_NOTE_EXISTS;
        }

    }

    public String getAllUrlPass() {
        if (credentialRecordMap.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            StringBuilder text = new StringBuilder();
            for (Map.Entry<String, CredentialRecord> entry : credentialRecordMap.entrySet()) {
                text.append(entry.getKey() + ":\n" + "Login: " + entry.getValue().getLogin()
                        + "\tPass: " + entry.getValue().getPassword());
                text.append("\n--------------\n");
            }
            return text.toString();
        }
    }

    public String removeUrlPass(String url) {
        if (credentialRecordMap.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            credentialRecordMap.remove(url);
            return Messages.NOTE_DELETED;
        }

    }

    public String removeAllUrlPass() {
        if (credentialRecordMap.size() == 0) {
            return Messages.NO_NOTES;
        } else {
            credentialRecordMap.clear();
            return Messages.NOTES_DELETED;
        }
    }
}

