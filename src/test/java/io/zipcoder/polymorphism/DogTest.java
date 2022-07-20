package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class DogTest extends TestCase {

    public void testSpeak() {
        //Given
        Dog test = new Dog();
        //When
        String actual = test.speak();
        //Then
        Assert.assertEquals("bark", actual);
    }
    public void testSpeakFalse() {
        //Given
        Dog test = new Dog();
        //When
        String actual = test.speak();
        //Then
        Assert.assertNotEquals("woof", actual);
    }
}