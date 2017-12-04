package logic;

import java.util.List;
import java.util.ArrayList;

public class Monitored extends User {

	private List<Note> notes;

	public Monitored(String name, String email, String password) {
		super(name, email, password, Role.MONITORED);
		this.notes = new ArrayList<>();
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	public void addNote(Note note) {
		notes.add(note);
	}
}
