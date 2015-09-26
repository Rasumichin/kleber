package com.retail_sc.java.zen.stickr;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//@formatter:off   bitte alphabetische Reihenfolge beibehalten
@SuiteClasses({
	MetaAlbumTest.class,
	PublisherTest.class,
	TopicTest.class
})

/**
 * Meszaros, Gerard, xUnit Test Patterns, Named Test Suite, p. 592
 *
 * @since  25.09.2015
 */
public class AllInMemoryTests {
	//nothing to do here
}