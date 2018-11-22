package lesson40.swing2.notebook.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import lesson40.swing2.notebook.model.notebook_data.*;

public class Notebook {
	
	private File notesFile = new File("notes.txt");
	private File ftFile = new File("tasks.txt");;
	private File credFile = new File("credentialRecords.txt");
	
	
	private List<Note> notes;
	private SortedSet<FutureTask> futureTasks;
	private Map<String, CredentialRecord> credentialRecordMap;

	public Notebook() {
		notes = new ArrayList<>();
		futureTasks = new TreeSet<>();
		credentialRecordMap = new HashMap<>();
	}
	
	public Notebook(File notesFile, 
			File ftFile, File credFile){
		this();
		this.notesFile = notesFile;
		this.ftFile = ftFile;
		this.credFile = credFile;
		try {
			restoreCredentialRecords();
			restoreNotes();
			restoreTasks();
		} catch (IOException e) {
			throw new RuntimeException("No access to given files");
		}
		
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
			return number + ") " + notes.get(number - 1).getCurrentDate() + "\n" + notes.get(number - 1).getNote()
					+ Messages.SEPARATOR;
		}
	}

	public String getAllNotes() {
		if (notes.size() == 0) {
			return Messages.NO_NOTES;
		} else {
			StringBuilder text = new StringBuilder();
			for (int i = 0; i < notes.size(); i++) {
				text.append((i + 1) + ") " + notes.get(i).getCurrentDate() + "\n" + notes.get(i).getNote());
				text.append(Messages.SEPARATOR);
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
			return "Задача, опубликованная " + futureTask.getCurrentDate() + ":\n" + futureTask.getTask()
					+ "\nДата выполнения: " + futureTask.getTaskDate() + Messages.SEPARATOR;
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
				text.append("Задача, опубликованная " + futureTask.getCurrentDate() + ":\n" + futureTask.getTask()
						+ "\nДата выполнения: " + futureTask.getTaskDate());
				text.append(Messages.SEPARATOR);
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
					return "Login: " + entry.getValue().getLogin() + "\tPass: " + entry.getValue().getPassword()
							+ Messages.SEPARATOR;
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
				text.append(entry.getKey() + ":\n" + "Login: " + entry.getValue().getLogin() + "\tPass: "
						+ entry.getValue().getPassword());
				text.append(Messages.SEPARATOR);
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

	public String saveNotes() throws IOException {
		if (notes.size() == 0) {
			return Messages.NO_NOTES;
		} else {
			BufferedWriter writeFile = new BufferedWriter(
					new FileWriter(notesFile));
			for (int i = 0; i < notes.size(); i++) {
				writeFile.write(notes.get(i).getCurrentDate() + "\n");
				writeFile.write(notes.get(i).getNote());
				writeFile.write(Messages.SEPARATOR);
			}
			writeFile.flush();
			writeFile.close();
			return Messages.NOTES_SAVED;
		}
	}

	public String restoreNotes() throws IOException {
		if (!notesFile.exists()) {
			return Messages.NO_LOADED_NOTES;
		} else {
			notes.clear();
			BufferedReader readFile = new BufferedReader(new FileReader(notesFile));
			String line;
			List<String> lines = new ArrayList<>();
			while ((line = readFile.readLine()) != null) {
				lines.add(line);
			}
			readFile.close();
			while (!lines.isEmpty()) {
				Note loadNote = new Note();
				loadNote.setCurrentDate(lines.get(0));
				lines.remove(0);
				loadNote.setNote(lines.get(0));
				lines.remove(0);
				notes.add(loadNote);
				lines.remove(0);
			}
			return Messages.NOTES_LOADED;
		}
	}

	public String saveTasks() throws IOException {
		if (futureTasks.size() == 0) {
			return Messages.NO_NOTES;
		} else {
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(ftFile));
			Iterator<FutureTask> futureTaskIterator = futureTasks.iterator();
			FutureTask futureTask;
			for (int i = 0; i < futureTasks.size(); i++) {
				futureTask = futureTaskIterator.next();
				writeFile.write(futureTask.getCurrentDate() + "\n");
				writeFile.write(futureTask.getTask() + "\n");
				writeFile.write(futureTask.getTaskDate());
				writeFile.write(Messages.SEPARATOR);
			}
			writeFile.flush();
			writeFile.close();
			return Messages.NOTES_SAVED;
		}
	}

	public String restoreTasks() throws IOException {
		if (!(ftFile.exists())) {
			return Messages.NO_LOADED_NOTES;
		} else {
			futureTasks.clear();
			BufferedReader readFile = new BufferedReader(new FileReader(ftFile));
			String line;
			List<String> lines = new ArrayList<>();
			while ((line = readFile.readLine()) != null) {
				lines.add(line);
			}
			readFile.close();
			while (!lines.isEmpty()) {
				FutureTask loadNote = new FutureTask();
				loadNote.setCurrentDate(lines.get(0));
				lines.remove(0);
				loadNote.setTask(lines.get(0));
				lines.remove(0);
				loadNote.setTaskDate(lines.get(0));
				lines.remove(0);
				futureTasks.add(loadNote);
				lines.remove(0);
			}
			return Messages.NOTES_LOADED;
		}
	}

	public String saveCredentialRecords() throws IOException {
		if (credentialRecordMap.size() == 0) {
			return Messages.NO_NOTES;
		} else {
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(credFile));
			Iterator<Map.Entry<String, CredentialRecord>> urlPassIterator = credentialRecordMap.entrySet().iterator();
			Map.Entry<String, CredentialRecord> credentialRecord;
			for (int i = 0; i < credentialRecordMap.size(); i++) {
				credentialRecord = urlPassIterator.next();
				writeFile.write(credentialRecord.getKey() + "\n");
				writeFile.write(credentialRecord.getValue().getLogin() + "\n");
				writeFile.write(credentialRecord.getValue().getPassword());
				writeFile.write(Messages.SEPARATOR);
			}
			writeFile.flush();
			writeFile.close();
			return Messages.NOTES_SAVED;
		}
	}

	public String restoreCredentialRecords() throws IOException {
		if (!(credFile.exists())) {
			return Messages.NO_LOADED_NOTES;
		} else {
			credentialRecordMap.clear();
			BufferedReader readFile = new BufferedReader(new FileReader("credentialRecords.txt"));
			String line;
			List<String> lines = new ArrayList<>();
			while ((line = readFile.readLine()) != null) {
				lines.add(line);
			}
			readFile.close();
			while (!lines.isEmpty()) {
				CredentialRecord loadCredentialRecord = new CredentialRecord();
				String url = lines.get(0);
				lines.remove(0);
				loadCredentialRecord.setLogin(lines.get(0));
				lines.remove(0);
				loadCredentialRecord.setPassword(lines.get(0));
				lines.remove(0);
				credentialRecordMap.put(url, loadCredentialRecord);
				lines.remove(0);
			}
			return Messages.NOTES_LOADED;
		}
	}

}















