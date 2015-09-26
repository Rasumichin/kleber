package de.jsmithy.zen.stickr;

import org.junit.Test;

import static org.junit.Assert.*;

public class MetaAlbumTest {

	@Test
	public void testCreate() {
		String title = "Benjamin Bl�mchen - Mein gro�es Stickeralbum";
		Topic topic = Topic.create(title);
		Publisher publisher = Publisher.create("Panini");

		MetaAlbum sut = MetaAlbum.create(topic, publisher);
		assertNotNull("Erstellung war nicht korrekt.", sut);

		boolean isEqual = topic.equals(sut.getTopic());
		assertTrue("Topic war nicht gleich.", isEqual);

		isEqual = publisher.equals(sut.getPublisher());
		assertTrue("Publisher war nicht gleich.", isEqual);

		int numberOfPlaceholders = sut.countPlaceholders();
		assertEquals("Placeholder sind nicht leer.", 0, numberOfPlaceholders);
	}
}