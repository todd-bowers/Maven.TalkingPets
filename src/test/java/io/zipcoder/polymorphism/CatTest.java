package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class CatTest extends TestCase {

    public void testSpeak() {
        //Given
        Cat test = new Cat();
        //When
        String actual = test.speak();
        //Then
        Assert.assertEquals("meow", actual);
    }
    public void testSpeakFalse() {
        //Given
        Cat test = new Cat();
        //When
        String actual = test.speak();
        //Then
        Assert.assertNotEquals("purr", actual);
    }
}