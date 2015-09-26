package de.jsmithy.zen.stickr;

import java.util.ArrayList;
import java.util.List;

public class MetaAlbum {
	private Topic topic;

	private Publisher publisher;

	private List<Placeholder> placeholders = new ArrayList<Placeholder>();

	private MetaAlbum(Topic aTopic, Publisher aPublisher) {
		super();

		topic = aTopic;
		publisher = aPublisher;
	}

	public static MetaAlbum create(Topic topic, Publisher publisher) {
		return new MetaAlbum(topic, publisher);
	}

	public Topic getTopic() {
		return topic;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public int countPlaceholders() {
		return getPlaceholders().size();
	}

	private List<Placeholder> getPlaceholders() {
		return placeholders;
	}
}