package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static io.zipcoder.polymorphism.MainApplication.petSpeaks;
import static io.zipcoder.polymorphism.MainApplication.typeOfPetInString;

public class MainApplicationTest {
    @Test
    public void constructorTest() {
        //Given
        //When
        //Then
    }

    public void testNumberOfPets() {
        //Given
        int expected = 4;
        Pet[] test = new Pet[expected];
        test[0] = new Dog("Bentley");
        test[1] = new Cat("Soph");
        test[2] = new Bird("Tweedy");
        test[3] = new Dog("Coop");
        //When

        //Then
    }
    @Test
    public void testPetSpeaks() {
        //Given
        Pet[] test = new Pet[4];
        test[0] = new Dog("Bentley");
        test[1] = new Cat("Soph");
        test[2] = new Bird("Tweedy");
        test[3] = new Dog("Coop");
        //When
        String actual = petSpeaks(test);
        //Then
        Assert.assertEquals("Bentley the dog says bark \n" +
                "Soph the cat says meow \n" +
                "Tweedy the bird says chirp \n" +
                "Coop the dog says bark ", actual);
    }
    @Test
    public void testTypeOfPetInString1() {
        //Given
        Pet[] test = new Pet[4];
        test[0] = new Dog("Bentley");
        test[1] = new Cat("Soph");
        test[2] = new Bird("Tweedy");
        test[3] = new Dog("Coop");
        //When
        String actual = typeOfPetInString(test[0]);
        //Then
        Assert.assertEquals("dog", actual);
    }
    @Test
    public void testTypeOfPetInString2() {
        //Given
        Pet[] test = new Pet[4];
        test[0] = new Dog("Bentley");
        test[1] = new Cat("Soph");
        test[2] = new Bird("Tweedy");
        test[3] = new Dog("Coop");
        //When
        String actual = typeOfPetInString(test[1]);
        //Then
        Assert.assertEquals("cat", actual);
    }
    @Test
    public void testTypeOfPetInString3() {
        //Given
        Pet[] test = new Pet[4];
        test[0] = new Dog("Bentley");
        test[1] = new Cat("Soph");
        test[2] = new Bird("Tweedy");
        test[3] = new Dog("Coop");
        //When
        String actual = typeOfPetInString(test[2]);
        //Then
        Assert.assertEquals("bird", actual);
    }
}
