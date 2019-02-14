package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void testNewDog() {


        //Given
        String name = "Ichigo";
        Dog dog = new Dog(name, new Date(), 1);

        //When
        String expected = "Bud";
        dog.setName(expected);
        String actual = dog.getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void testSpeak() {
        //Given
        String expected = "bark!";
        Dog dog = new Dog("Ichigo", new Date(), 1);

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testSetBirthdayDate() {
        //Given
        Dog dog = new Dog("Ichigo", new Date(), 1);
        Date expected = new Date(2019, 2, 12);

        //When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        //Then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat() {
        //Given
        Dog dog = new Dog("Ichigo", new Date(), 1);
        Food food = new Food();
        Integer expected = 1;

        //When
        dog.eat(food);
        Integer actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected,actual);

    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void testGetID() {
        //Given
        Dog dog = new Dog("Ichigo", new Date(), 1);
        Integer expected = 1;

        //When
        Integer actual = dog.getId();

        //Then
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        //Given
        Dog dog = new Dog("Ichigo", new Date(), 1);
        boolean expected = true;

        //When
        boolean actual = dog instanceof Animal;

        //Then

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testMammalInheritance() {
        //Given
        Dog dog = new Dog("Ichigo", new Date(), 1);
        boolean expected = true;

        //When
        boolean actual = dog instanceof Mammal;

        //Then

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
