package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testAddDog() {
        //Given
        Dog dog = new Dog("Astro", new Date(), 2);
        DogHouse dogHouse = new DogHouse();
        Integer id = dog.getId();

        //When
        DogHouse.add(dog);
        Dog actualDog = dogHouse.getDogById(id);

        //Then
        Assert.assertEquals(actualDog, dog);

    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveById() {
        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog1 = new Dog("Bud",new Date(),5);
        Integer id = dog1.getId();

        //When
        DogHouse.add(dog1);
        DogHouse.remove(id);
        Dog removedDog = DogHouse.getDogById(id);

        //Then
        Assert.assertNull(removedDog);
    }
    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void testRemoveByName() {
        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog2 = new Dog("Lightning",new Date(),7);
        String name = dog2.getName();
        Integer expected = dogHouse.getNumberOfDogs();

        //When
        dogHouse.add(dog2);
        dogHouse.remove(dog2);
        Integer actualRemovedDog = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected,actualRemovedDog);

    }
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void testGetDogById () {
        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Michael", new Date(),9);
        Integer id = dog.getId();

        //When
        dogHouse.add(dog);
        Dog actual = dogHouse.getDogById(id);

        //Then
        Assert.assertEquals(dog,actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs2() {
        //Given
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Sky", new Date(),8);
        Integer expected = 1;

        //When
        Integer actual = dogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
