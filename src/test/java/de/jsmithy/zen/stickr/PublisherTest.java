package de.jsmithy.zen.stickr;

import org.junit.Test;

import static org.junit.Assert.*;

public class PublisherTest {

	@Test
	public void testCreate() {
		String name = "Panini";
		Publisher sut = Publisher.create(name);
		// TODO it1f36, 26.09.2015: Erstellung wird noch nicht getestet
		boolean isEqual = name.equals(sut.getName());
		assertTrue("Name war nicht gleich.", isEqual);
	}
}