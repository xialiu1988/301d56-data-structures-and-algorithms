package Data.Structures.LinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LlistTest {
    //test empty llist
    @Test
    public void testEmptyLlist(){
        Llist list = new Llist();
        List<Node> res = list.print();
        assertTrue("null linked list",res.isEmpty());
    }
  //can insert  one value to llist
    @Test
    public void insertToLlist() {
        Llist list = new Llist();
        List<Node> res = list.print();
        assertTrue("null linked list",res.isEmpty());

        list.insert(44);
        List<Node> res2 = list.print();
        List<Integer> test = new ArrayList<Integer>( List.of((Integer) 44));
        assertTrue("one node linked list",res2.size()==1);
        for(Node t : res2){
            assertTrue("the node should be 44", test.contains(t.value));
        }

    }



    //head point to the first node in the linked list
    @Test
    public void canPointToHead(){
        Llist list = new Llist();
        list.insert(4);
        list.insert(56);
        assertTrue("head has value of 56",list.head.value==56);

    }


   //insert multiple values to the linked list
    @Test
    public void insertMultipleToLlist() {
        Llist list = new Llist();
        List<Node> res = list.print();
        assertTrue("null linked list",res.isEmpty());

        list.insert(14);
        list.insert(23);
        list.insert(7);
        List<Node> res2 = list.print();
        assertTrue("3 nodes linked list",res2.size()==3);


       List<Integer> test = new ArrayList<Integer>( List.of((Integer) 14, (Integer) 23,(Integer)7));
       for(Node t : res2){
           assertTrue("should contain those values in the result list of print", test.contains(t.value));
       }


    }

   //test the linked list inclueds the value
    @Test
    public void includesTheValuePassIn() {
        Llist list = new Llist();
        list.insert(34);
        list.insert(4);
        assertTrue("should return true if it has 4",list.includes(4));
    }

    //test the linked list doesn't include the value
    @Test
    public void NotincludesTheValuePassIn() {
        Llist list = new Llist();
        list.insert(34);
        list.insert(4);
        assertFalse("should return false cuz it doesn't has 99",list.includes(99));
    }


    //test the print return the collection of the nodes in the linked list
    @Test
    public void print() {
        Llist list = new Llist();
        list.insert(6);
        list.insert(5);
        list.insert(12);
        list.insert(3);
        List<Node> result = list.print();
        List<Integer>  test = new ArrayList<>();
        test.add(6);
        test.add(5);
        test.add(12);
        test.add(3);
        assertTrue("the list return from print methods should have 4 nodes",result.size()==4);
       //make sure the list contains every node i insert into the linked list
       for(Node n : result){
           assertTrue("should contain those values",test.contains(n.value));
       }
    }
}