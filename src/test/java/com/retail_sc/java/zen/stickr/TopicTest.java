package com.retail_sc.java.zen.stickr;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopicTest {

	private Topic sut;
	private String title = "UEFA EM 2016";

	@Before
	public void setUp() {
		sut = Topic.create(getTitle());
	}

	@Test
	public void testCreate() {
		Topic sutForCreate = Topic.create(getTitle());
		assertNotNull("Erstellung war nicht korrekt.", sutForCreate);

		boolean isEqual = getTitle().equals(sutForCreate.getTitle());
		assertTrue("Title ist nicht gleich.", isEqual);
	}

	@Test
	public void testToString() {
		String topicAsString = sut.toString();
		assertEquals("Falsches Format.", "UEFA EM 2016", topicAsString);
	}

	private String getTitle() {
		return title;
	}
}