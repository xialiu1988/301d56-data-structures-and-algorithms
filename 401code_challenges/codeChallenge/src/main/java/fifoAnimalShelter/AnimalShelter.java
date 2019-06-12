package fifoAnimalShelter;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    public Animal front;
    public Animal rear;
    //track the total number of animals in the shelter
    public int counter;
    public List<Animal> list;
    //constructor
    public AnimalShelter(Animal animal){
        this.front=animal;
        this.rear=animal;
        this.counter=1;
        this.list=new ArrayList<>();
    }

    //adding a new animal to shelter
    public void enqueue(String animalType){
        Animal an = new Animal(animalType);
        this.rear.next=an;
        this.rear=an;
        counter++;
    }

    public Animal dequeue(String pref){


        if(!this.list.isEmpty()){
          for(int i=0;i<this.list.size();i++){
              if(this.list.get(i).type==pref){
                  this.counter--;
                  Animal cc = new Animal(pref);
                  this.list.remove(this.list.get(i));
                  return cc;
              }
          }
        }
      if(this.front!=null) {
          if (this.front.type == pref) {
              Animal temp = this.front;
              this.counter--;
              this.front = this.front.next;
              temp.next = null;
              return temp;
          }


          while (this.front.next != null) {
              Animal temp = this.front;
              list.add(temp);
              this.front = this.front.next;
              temp.next = null;


              if (this.front.type == pref) {
                  Animal temp2 = this.front;
                  counter--;
                  this.front = this.front.next;
                  temp2.next = null;
                  this.front= this.list.get(0);
                  return temp2;
              }


          }

      }

     System.out.println("No "+pref+" exists in the shelter");
       return null;
    }



    public void printAnimalList(){
        if(!this.list.isEmpty()){
            for(Animal a : list){
                System.out.println(a.type);
            }
        }else{

            while(this.front.next!=null){
                Animal temp =this.front;
                System.out.println(this.front.type);
                this.front=this.front.next;
                this.list.add(temp);
                temp.next=null;
            }

            System.out.println(this.front.type);
            Animal temp4 = this.front;
            this.front=this.front.next;
            this.list.add(temp4);
            temp4.next=null;
            for(Animal a : list){
                enqueue(a.type);
                this.counter--;
            }


        }



    }



}
