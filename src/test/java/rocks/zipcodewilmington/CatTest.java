package rocks.zipcodewilmington;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.security.PublicKey;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        // Given a Cat object
        Cat cat = new Cat("Pizda", new Date(), 1);
        // When we set the name of the cat
        cat.setName("Holly");
        // Then we expect the cat's name to be updated
        Assert.assertEquals("Holly", cat.getName());

    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        // Given a Cat object
        Cat cat = new Cat("Holly", new Date(), 1);
        //when the cat speaks
        String sound = cat.speak();
        //then we expect cat to meow
        Assert.assertEquals("meow!", sound);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // given a Cat object
        Cat cat = new Cat("Holly", new Date(), 1);
        //when we set the bd of the cat
        Date newDate = new Date();
        cat.setBirthDate(newDate);
        // then we expect the cat's bd to be updated
        Assert.assertEquals(newDate, cat.getBirthDate());
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // given a cat object
        Cat cat = new Cat("Holly", new Date(), 1);
        Food food = new Food("Fish");
        //when the cat eats food
        cat.eat(food);
        // Then we expect the cat to be full and the food to be eaten
        Assert.assertTrue(!cat.isHungry());
    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId () {
        // given a cat object
        Cat cat = new Cat("Holly", new Date(), 1);
        //to get the Id
        Integer catId = cat.getId();
        //expect the Id to match the Id set in the constructor
        Assert.assertEquals(1, catId.intValue());
    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        // given a cat object
        Cat cat = new Cat("Holly", new Date(), 1);
        // to check if the cat is an instance of the Animal class
        boolean isAnimal = cat instanceof Animal;
        //expect the result to be true
        Assert.assertTrue(isAnimal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
    // given a cat object
    Cat cat = new Cat("Holly", new Date(), 1);
    // to check if the cat is an instance of the mammal class
    boolean isMammal = cat instanceof Mammal;
    //expect the result to be true
    Assert.assertTrue(isMammal);
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
