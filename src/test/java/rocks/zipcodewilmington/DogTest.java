package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
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
        String givenName = "Goldy";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Assert.assertEquals(givenId, dog.getId());
        Assert.assertEquals(givenName,dog.getName());
        Assert.assertEquals(givenBirthDate, dog.getBirthDate());

    }

    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        // Given a dog object
        Dog dog = new Dog("Goldy", new Date(), 1);
        //when the dog speaks
        String sound = dog.speak();
        //then we expect dog to meow
        Assert.assertEquals("bark!", sound);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // given a dog object
        Dog dog = new Dog("Goldy", new Date(), 1);
        //when we set the bd of the dog
        Date newDate = new Date();
        dog.setBirthDate(newDate);
        // then we expect the dog's bd to be updated
        Assert.assertEquals(newDate, dog.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // given a dog object
        Dog dog = new Dog("Goldy", new Date(), 1);
        Food food = new Food("bone");
        //when the dog eats food
        dog.eat(food);
        // Then we expect the dog to be full
        Assert.assertTrue(!dog.isHungry());
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId () {
        // given a dog object
        Dog dog = new Dog("Goldy", new Date(), 1);
        //to get the Id
        Integer catId = dog.getId();
        //expect the Id to match the Id set in the constructor
        Assert.assertEquals(1, catId.intValue());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        // given a dog object
        Dog dog = new Dog("Goldy", new Date(), 1);
        // to check if the dog is an instance of the Animal class
        boolean isAnimal = dog instanceof Animal;
        //expect the result to be true
        Assert.assertTrue(isAnimal);

    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        // given a dog object
        Dog dog = new Dog("Goldy", new Date(), 1);
        // to check if the dog is an instance of the mammal class
        boolean isMammal = dog instanceof Mammal;
        //expect the result to be true
        Assert.assertTrue(isMammal);
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
