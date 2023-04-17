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



    // TODO - Create tests for `void remove(Cat cat)`


    // TODO - Create tests for `Cat getCatById(Integer id)`


    // TODO - Create tests for `Integer getNumberOfCats()`

}