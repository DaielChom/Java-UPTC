package logic;

import java.util.ArrayList;

public class Note {
	
	private String title;
	private String message;
	private String emotion;
	
	public Note(String title, String message, String emotion) {
		this.title = title;
		this.message = message;
		this.emotion = emotion;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEmotion() {
		return emotion;
	}

	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}
	
	
}

