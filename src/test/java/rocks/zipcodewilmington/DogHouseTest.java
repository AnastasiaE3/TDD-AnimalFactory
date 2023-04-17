package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Goldy", new Date(), 1);
        dogHouse.add(dog);
        Assert.assertEquals(dog, DogHouse.getDogById(1));
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Goldy", new Date(), 1);
        dogHouse.add(dog);
        dogHouse.remove(1);
        Assert.assertNull(DogHouse.getDogById(1));
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveByDog() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Goldy", new Date(), 1);
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Assert.assertNull(dogHouse.getDogById(1));
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Goldy", new Date(), 1);
        dogHouse.add(dog);
        Dog retrievedDog = dogHouse.getDogById(1);
        Assert.assertEquals(dog, retrievedDog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
//    @Test
//    public void testGetNumberOfDogs() {
//        DogHouse dogHouse = new DogHouse();
//        dogHouse.add(new Dog("Holly", new Date(), 1));
//        dogHouse.add(new Dog("Sarah", new Date(), 2));
//        dogHouse.add(new Dog("Atlas", new Date(), 3));
//        Integer numberOfDogs = dogHouse.getNumberOfDogs();
//        Assert.assertEquals(3, numberOfDogs.intValue());
//    }


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
