package Data.Structures.LinkedList;

import org.apache.commons.math3.stat.correlation.KendallsCorrelation;
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


//    Can successfully add a node to the end of the linked list
    @Test
    public void testAddNodeToEnd(){
        Llist list = new Llist();
        list.insert(3);//this will be head of this linked list
        list.append(5);
        assertTrue("after 3 should be node holds value of 5", list.head.next.value == 5);
    }

//    Can successfully add multiple nodes to the end of a linked list
    @Test
    public void testAddMultipleNodeToEnd(){
        Llist list = new Llist();
        list.insert(3);//this will be head of this linked list
        list.append(5);
        list.append(43);
        list.append(100);
        assertTrue("after 3 should be node holds value of 5", list.head.next.value == 5);
        assertTrue("after 5 shoudl be node holds value of 43",list.head.next.next.value == 43);
        assertTrue("after 43 shoudl be node holds value of 100",list.head.next.next.next.value == 100);
    }

//    Can successfully insert a node before a node located i the middle of a linked list
@Test
    public void testInsertNodeBeforeMiddleOftheLlist(){
        Llist list = new Llist();
        list.insert(3);
        list.insert(5);//this is the middle of the linked list;
        list.insert(7);
        list.insertBefore(5,890);
        assertTrue("after head should be new node holds value of 890", list.head.next.value == 890);
        assertTrue("after 890  should be the old node holds value of 5", list.head.next.next.value == 5);
    }
//    Can successfully insert a node before the first node of a linked list
    @Test
    public void testInsertNodeBeforeHeadOftheLlist(){
        Llist list = new Llist();
        list.insert(3);//this will be head of this linked list

        list.insertBefore(3,110);
        assertEquals("head will be 110 now", 110,list.head.value);
        assertTrue("after 110  should be the head holds value of 3", list.head.next.value == 3);
    }


//    Can successfully insert after a node in the middle of the linked list
    @Test
    public  void insertAfterMiddleNodeOfLlist(){
        Llist list = new Llist();
        list.insert(4);
        list.insert(66);//middle of the llist
        list.insert(8);//this is the head of the llist
        list.insertAfter(66,888);
        assertTrue("after 8 will be 66",list.head.next.value == 66);
        assertTrue("after 66 will be 888",list.head.next.next.value == 888);
    }
//    Can successfully insert a node after the last node of the linked list

    @Test
    public  void insertAfterLastNodeOfLlist(){
        Llist list = new Llist();
        list.insert(4);//last node of the llist
        list.insert(8);//this is the head of the llist
        list.insertAfter(4,888);
        assertTrue("after 8 will be 4",list.head.next.value == 4);
        assertEquals("after 4 should insert the value which is 888",888,list.head.next.next.value);
    }


    //test egdge cases
    @Test(expected = IllegalArgumentException.class )
    public void testInsertBeforeEmptyLlist() {
        Llist ll = new Llist();
        ll.insertBefore(55, 5);
    }

    @Test(expected = NullPointerException.class )
    public void testInsertBeforeLlistValueNotExsits() {
        Llist ll = new Llist();
        ll.insert(76);
        ll.insertBefore(55, 5);
    }



    @Test(expected = IllegalArgumentException.class )
    public void testLLInsertAfterEmptyLlist() {
        Llist ll = new Llist();
        ll.insertAfter(55, 5);
    }

    @Test(expected = NullPointerException.class )
    public void testInsertAfterLlistValueNotExsits() {
        Llist ll = new Llist();
        ll.insert(76);
        ll.insertBefore(55, 5);
    }

}