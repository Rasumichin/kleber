package de.jsmithy.zen.stickr;

public class Topic {
	private String title;

	private Topic(String aTitle) {
		super();

		title = aTitle;
	}

	public static Topic create(String title) {
		return new Topic(title);
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title;
	}
}