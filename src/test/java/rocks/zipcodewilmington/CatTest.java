package rocks.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.security.PublicKey;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
    // Given a Cat object
    Cat cat = new Cat("Pizda", new Date(), 1);
    // When we set the name of the cat
    cat.setName("Holly");
    // Then we expect the cat's name to be updated
    Assert.assertEquals("Holly",cat.getName());

}
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        // Given a Cat object
        Cat cat = new Cat("Holly", new Date(), 1);
        //when the cat speaks
        String sound = cat.speak();
        //then we expect cat to meow
        Assert.assertEquals("meow!", sound);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`


    // TODO - Create tests for `void eat(Food food)`


    // TODO - Create tests for `Integer getId()`


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
