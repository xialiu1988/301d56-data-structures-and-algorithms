package Data.Structures.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Llist {
    public Node head;
    public Node current;

    public Llist() {

    }

    //Insert a value as a node
    public void insert(int value) {
        Node insertNode = new Node(value);
        insertNode.next = head;
        head = insertNode;
    }


    //check if the value exists within the list
    public boolean includes(int value) {
        current = head;
        while (current.next != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        if (current.value == value) return true;
        else return false;
    }


    //return the current node
    public List<Node> print() {

        List<Node> list = new ArrayList<>();
        current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }

        return list;
    }


    //.append(value) which adds a new node with the given value to the end of the list

    public void append(int val) {
        //if there is empty linked list
        if (head == null) {
            head = new Node(val);

        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(val);
            current.next = newNode;
        }
    }


    // .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

    public void insertBefore(int value, int newVal) {

        current = head;
        if (current.value == value) {
            insert(newVal);
            return;
        }
        while (current.next != null) {
            if (current.next.value == value) {
                Node newNode = new Node(newVal);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

    }


    //.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value nodepublic void insertAfter(int value, int newVal)


    public void insertAfter(int value, int newVal) {

        current = head;
        if (current.value == value) {
         Node nn = new Node(newVal);
         nn.next = current.next;
         current.next = nn;
            return;
        }
        while (current.next != null) {
            if (current.value == value) {
                Node newNode = new Node(newVal);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }

      if( current.value == value){
          Node newNode = new Node(newVal);
          current.next = newNode;
          return;
      }

    }



}
