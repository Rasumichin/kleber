package de.jsmithy.zen.stickr;

public class Publisher {
	private String name;

	private Publisher(String aName) {
		super();

		name = aName;
	}

	public static Publisher create(String name) {
		return new Publisher(name);
	}

	public String getName() {
		return name;
	}
}