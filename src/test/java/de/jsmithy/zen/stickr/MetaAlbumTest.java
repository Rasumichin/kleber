package de.jsmithy.zen.stickr;

import org.junit.*;
import static org.junit.Assert.*;

public class MetaAlbumTest {

    @Test
    public void testCreate() {
        Topic topic = getTopic();
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
    
    private Topic getTopic(){    
        String title = "Benjamin Bl�mchen - Mein gro�es Stickeralbum";
        Topic topic = Topic.create(title);
        return topic;
    }  
}
