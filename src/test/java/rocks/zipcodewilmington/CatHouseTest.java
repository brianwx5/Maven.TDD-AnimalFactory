package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testCatHouseAdd() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Yukio", new Date(), 26);
        Integer id = 26;


        //When
        catHouse.add(cat);
        Cat actualCatAdded = catHouse.getCatById(id);

        //Then
        Assert.assertEquals(cat, actualCatAdded);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveById() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Davio", new Date(), 28);
        Integer id = cat.getId();

        //When
        catHouse.add(cat);
        catHouse.remove(id);
        Cat actualCatRemoved = catHouse.getCatById(id);

        //Then
        Assert.assertNull(actualCatRemoved);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void testRemoveByName() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Yukio", new Date(), 26);
        Integer expectedCatRemoved = 0;


        //When
        catHouse.add(cat);
        catHouse.remove(cat);
        Integer actualCatRemoved = catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCatRemoved, actualCatRemoved);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat2 = new Cat("Yukio", new Date(), 27);
        Integer id = cat2.getId();
        Cat expected = cat2;

        //When
        catHouse.add(cat2);
        Cat actual = catHouse.getCatById(id);

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        //Given
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Yukio", new Date(), 26);
        Integer expected = 0;

        //When

        Integer actual = catHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);

    }
}
