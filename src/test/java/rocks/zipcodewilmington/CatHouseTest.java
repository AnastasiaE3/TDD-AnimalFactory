package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void tsetAdd() {
        // Given a CatHouse and a new cat object
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Holly", new Date(), 1);
        // When we add the cat to the catHouse
        catHouse.add(cat);
        // Then we expect the catHouse to contain the cat and its id to be set
        Assert.assertEquals(cat, catHouse.getCatById(1));
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {
        // Given a CatHouse with a Cat
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Holly", new Date(), 1);
        catHouse.add(cat);
        // When we remove the Cat by its ID
        catHouse.remove(1);
        // Then we expect the CatHouse to no longer contain the Cat
        Assert.assertNull(catHouse.getCatById(1));
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByCat() {
        // Given a CatHouse with a Cat
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Holly", new Date(), 1);
        catHouse.add(cat);
        // When we remove the Cat object
        catHouse.remove(cat);
        // Then we expect the CatHouse to no longer contain the Cat
        Assert.assertNull(catHouse.getCatById(1));
    }


    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById() {
        // Given a CatHouse with a Cat
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Holly", new Date(), 1);
        catHouse.add(cat);
        // When we retrieve the Cat by its ID
        Cat retrievedCat = catHouse.getCatById(1);
        // Then we expect the retrieved Cat to be the same as the original Cat
        Assert.assertEquals(cat, retrievedCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        // Given a CatHouse with three Cats
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat("Holly", new Date(), 1));
        catHouse.add(new Cat("Sarah", new Date(), 2));
        catHouse.add(new Cat("Atlas", new Date(), 3));
        // When we retrieve the number of Cats in the CatHouse
        Integer numberOfCats = catHouse.getNumberOfCats();
        // Then we expect the number of Cats to be 3
        Assert.assertEquals(3, numberOfCats.intValue());
    }
}