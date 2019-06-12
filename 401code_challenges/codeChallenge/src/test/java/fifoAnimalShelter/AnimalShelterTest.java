package fifoAnimalShelter;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.PolyUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {
   //can enqueue a dog to shelter
    @Test
    public void enqueueADog() {
        Animal a1= new Animal("dog1");
        AnimalShelter test = new AnimalShelter(a1);
        test.enqueue("dog2");
        assertEquals("Now the rear should be dog2","dog2",test.rear.type);
    }

   //can enqueue a cat
    @Test
    public void enqueueACat() {
        Animal a1= new Animal("dog1");
        AnimalShelter test = new AnimalShelter(a1);
        test.enqueue("cat2");
        assertEquals("Now the rear should be cat2","cat2",test.rear.type);
    }

   //can dequeue a dog at top 1 on the list
    @Test
    public void dequeueADog() {
        Animal a1= new Animal("dog1");
        AnimalShelter test = new AnimalShelter(a1);
        test.enqueue("cat2");
        test.dequeue("dog1");
        assertEquals("Now cat2 should be the top 1 on the list","cat2",test.front.type);
    }
  //can dequeue a cat in the middle of the list
    @Test
    public void dequeueACatFromMiddle() {
        Animal a1= new Animal("dog1");
        AnimalShelter test = new AnimalShelter(a1);
        test.enqueue("cat1");
        test.enqueue("dog2");
        test.enqueue("cat2");
        assertEquals("dog1 should  be the top 1 on the list after adoption","dog1",test.front.type);
        assertEquals("cat2 should  be the last 1 on the list after adoption","cat2",test.rear.type);
        test.dequeue("cat1");
        assertEquals("cat2 should  be the last 1 on the list after adoption","cat2",test.rear.type);
        assertEquals("dog1 should  be the top 1 on the list after adoption","dog1",test.front.type);



    }


//can dequeue a dog from middle
    @Test
    public void dequeueADogFromMiddle() {
        Animal a1= new Animal("dog1");
        AnimalShelter test = new AnimalShelter(a1);
        test.enqueue("cat1");
        test.enqueue("dog2");
        test.enqueue("cat2");
        assertEquals("dog1 should  be the top 1 on the list after adoption","dog1",test.front.type);
        assertEquals("cat2 should  be the last 1 on the list after adoption","cat2",test.rear.type);
        test.dequeue("dog2");
        assertEquals("cat2 should  be the last 1 on the list after adoption","cat2",test.rear.type);
        assertEquals("dog1 should  be the top 1 on the list after adoption","dog1",test.front.type);

    }

    //can not dequeue a bird from shelter
    @Test
    public void dequeueABird(){
        Animal a1 = new Animal("dog1");
        AnimalShelter WeHope = new AnimalShelter(a1);
        WeHope.enqueue("cat1");
        WeHope.enqueue("cat2");
        assertEquals ("No bird exsits",null,WeHope.dequeue("bird"));

    }




}