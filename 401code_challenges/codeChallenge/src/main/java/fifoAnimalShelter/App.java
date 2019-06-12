package fifoAnimalShelter;

public class App {

    public static void main(String[] args){

        Animal a1 = new Animal("dog1");
        AnimalShelter WeHope = new AnimalShelter(a1);
        WeHope.enqueue("dog2");
        WeHope.enqueue("cat1");
        WeHope.enqueue("dog3");
        WeHope.enqueue("cat2");
        WeHope.enqueue("dog4");
        WeHope.enqueue("dog5");
        WeHope.enqueue("cat3");
        System.out.println("We have "+ WeHope.counter+" animals left in our shelter:");
        WeHope.printAnimalList();
        System.out.println("==================");
        System.out.println("======= Adopting==========");
        System.out.println("==================");
        System.out.println("Here are the information of the adopted animals:");
        Animal adoptOne= WeHope.dequeue("dog3");
        System.out.println(adoptOne.type);
        Animal adopt2 = WeHope.dequeue("cat1");
        System.out.println(adopt2.type);
        Animal adopt3 = WeHope.dequeue("dog1");
        System.out.println(adopt3.type);
        Animal adopt4 = WeHope.dequeue("bird");
        Animal adopt5 = WeHope.dequeue("lizard");
        System.out.println("==================");
        System.out.println("We have " + WeHope.counter+" animals left in our shelter:");
        WeHope.printAnimalList();


    }
}
