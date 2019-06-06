package llMerge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Llist {
    public Node head;

    public  Llist(){
        head = null;
    }


    //Insert a value as a node
    public void insert(int value) {
        Node insertNode = new Node(value);
        insertNode.next = head;
        head = insertNode;
    }

    //check if the value exists within the list
    public boolean includes(int value) {
        Node  current = head;
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
        Node current = head;
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
            Node  current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(val);
            current.next = newNode;
        }
    }

    // .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node

    public void insertBefore(int value, int newVal) {

        if(head!=null) {
            Node current = head;
            if (current.value == value) {
                insert(newVal);
                return;
            }
            while (current != null) {
                if (current.next.value == value) {
                    Node newNode = new Node(newVal);
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                else {
                    if (current.next != null) {
                        current = current.next;
                    } else throw new IllegalArgumentException("Value not Exsits!");
                }
            }

        }
        else
        {
            throw new IllegalArgumentException("Value not Exsits!");
        }
    }


    //.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value nodepublic void insertAfter(int value, int newVal)


    public void insertAfter(int value, int newVal) {
        if(head!=null) {
            Node current = head;
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

            if (current.value == value) {
                Node newNode = new Node(newVal);
                current.next = newNode;
                return;
            }
        }
        else{
            throw new IllegalArgumentException("Value not Exsits!");
        }

    }


    //find the kth node from the end of the linked list
    public int kthFromEnd(int k){

        if(k<0){
            throw new IllegalArgumentException("Not correct input number");
        }
        //create hashmap to hold <key,value> pair key is the index positon of the node while value is Node itself
        HashMap<Integer,Node> hp = new HashMap<>();
        Node current = head;
        int i =0;
        while(current.next!=null){
            hp.put(i,current);
            i++;
            current=current.next;
        }
        hp.put(i,current);
        int sizeOfHashmap=hp.size();
        if(k>=sizeOfHashmap){
            throw new IllegalArgumentException("Not correct input number");
        }
        Node res = hp.get(sizeOfHashmap-k-1);
        return res.value;

    }



}
