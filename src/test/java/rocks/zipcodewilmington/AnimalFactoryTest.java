package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void testAnimalCreateDog() {

        //Given
        AnimalFactory animalFactory = new AnimalFactory();
        Dog newDog = animalFactory.createDog("Echo", new Date(2019,2,14));
        String expectedName = "Echo";
        Date expectedDate = new Date(2019,2,14);

        //When
        String actualName = newDog.getName();
        Date actualDate = newDog.getBirthDate();

        //Then
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualDate,expectedDate);


    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testAnimalCreateCat() {

        //Given
        AnimalFactory animalFactory = new AnimalFactory();
        Cat newCat = animalFactory.createCat("Ash", new Date(2019,2,12));
        String expectedName = "Ash";
        Date expectedDate = new Date(2019,2,12);

        //When
        String actualName = newCat.getName();
        Date actualDate = newCat.getBirthDate();

        //Then
        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualDate,expectedDate);


    }
}
