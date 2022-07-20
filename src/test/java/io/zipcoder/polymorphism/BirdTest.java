package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class BirdTest extends TestCase {

    public void testSpeak() {
        //Given
        Bird test = new Bird();
        //When
        String actual = test.speak();
        //Then
        Assert.assertEquals("chirp", actual);
    }
    public void testSpeakFalse() {
        //Given
        Bird test = new Bird();
        //When
        String actual = test.speak();
        //Then
        Assert.assertNotEquals("trill", actual);
    }
}