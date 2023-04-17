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
    public void testCreateDog() {
        String expectedName = "";
        Date expectedDate = new Date();
        Dog dog = AnimalFactory.createDog(expectedName, expectedDate);
        Date actualDate = dog.getBirthDate();
        String actualName = dog.getName();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateCat() {
        String expectedName = "";
        Date expectedDate = new Date();
        Cat cat = AnimalFactory.createCat(expectedName, expectedDate);
        Date actualDate = cat.getBirthDate();
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
