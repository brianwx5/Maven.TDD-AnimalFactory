package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest() {

        //Given
        String catName = "Yuki";
        Cat cat = new Cat(catName, new Date(), 25);


        //When
        String expected = "Roberto";
        cat.setName(expected);
        String actualCatName = cat.getName();

        //Then
        Assert.assertEquals(actualCatName, expected);

    }


    // TODO - Create tests for `speak`

    @Test
    public void testSpeak() {
        //Given
        String actual = "meow!";
        Cat cat = new Cat("Yuki", new Date(), 25);

        //When
        String expected = cat.speak();

        //Then
        Assert.assertEquals(actual, expected);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        //Given
        Cat cat = new Cat("Yuki", new Date(), 25);
        Date expectedDate = new Date(2019, 2, 12);

        //When
        cat.setBirthDate(expectedDate);
        Date actualDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedDate, actualDate);
    }


    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat() {
        //Given
        Cat cat = new Cat("Yuki", new Date(), 25);
        Food food = new Food();
        Integer expected = 1;


        //When
        cat.eat(food);
        Integer actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetID() {
        //Given
        Cat cat = new Cat("Yuki", new Date(), 25);
        Integer expected = 25;

        //When
        Integer actual = cat.getId();

        //Then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void  testAnimalInheritance() {
        //Given
        Cat cat = new Cat("Yuki", new Date(), 25);
        Boolean expected = true;

        //When
        boolean actual = cat instanceof Animal;

        //Then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void  testMammalInheritance() {
        //Given
        Cat cat = new Cat("Yuki", new Date(), 25);
        Boolean expected = true;

        //When
        boolean actual = cat instanceof Mammal;

        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
