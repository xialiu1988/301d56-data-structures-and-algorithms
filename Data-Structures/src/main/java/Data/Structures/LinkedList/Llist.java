package Data.Structures.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Llist {
    public  Node head;
    public  Node current;

    public Llist(){

    }

   //Insert a value as a node
   public void insert(int value){
       Node insertNode = new Node(value);
       insertNode.next= head;
       head = insertNode;
   }


    //check if the value exists within the list
    public boolean includes(int value){
      current = head;
      while(current.next!=null){
          if(current.value == value){
              return true;
          }
          current = current.next;
      }
        if(current.value == value) return true;
        else return false;
    }


   //return the current node
    public List<Node> print(){

        List<Node> list = new ArrayList<>();
        current = head;
        while(current!=null){
            list.add(current);
            current = current.next;
        }

        return list;
    }

}
