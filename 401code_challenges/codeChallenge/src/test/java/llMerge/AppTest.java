package llMerge;

import org.junit.Test;

import static llMerge.App.mergeLists;
import static org.junit.Assert.*;

public class AppTest {

    @Test(expected = IllegalArgumentException.class)
    public void CanMergeTwoNullLists() {
        Llist l1 = new Llist();
        Llist l2 = new Llist();
        mergeLists(l1,l2);
    }
    //list1 is null
    @Test
    public void CanMergeWhenList1Null() {
        Llist l1 = new Llist();
        Llist l2 = new Llist();
        l2.insert(3);
       Llist res = mergeLists(l1,l2);
       assertEquals("should have head 3 in new linked list",3,res.head.value);
    }

   //list2 null
    @Test
    public void CanMergeWhenList2Null() {
        Llist l1 = new Llist();
        Llist l2 = new Llist();
        l1.insert(34);
        Llist res = mergeLists(l1,l2);
        assertEquals("should have head 3 in new linked list",34,res.head.value);
    }


     //list 1 and list2 has same length

    @Test
    public void CanMergeWhenTwoListsAreSameLength() {
        Llist l1 = new Llist();
        Llist l2 = new Llist();
        l1.insert(4);
        l1.insert(3);
        l2.insert(56);
        l2.insert(9);
        Llist res = mergeLists(l1,l2);
        assertEquals("should have head 3 in new linked list",3,res.head.value);
        assertEquals("second node value should be 9",9,res.head.next.value);
        assertEquals("third node value should be 4 in new linked list",4,res.head.next.next.value);
        assertEquals("last node value should be 56 in new linked list",56,res.head.next.next.next.value);
    }


    //list 1 shorter

    @Test
    public void CanMergeWhenTwoList1Shorter() {
        Llist l1 = new Llist();
        Llist l2 = new Llist();
        l1.insert(4);
        l2.insert(56);
        l2.insert(9);
        Llist res = mergeLists(l1,l2);
        assertEquals("should have head 3 in new linked list",4,res.head.value);
        assertEquals("second node value should be 9",9,res.head.next.value);
        assertEquals("third node value should be 4 in new linked list",56,res.head.next.next.value);
    }


    //list 2 shorter

    @Test
    public void CanMergeWhenTwoList2Shorter() {
        Llist l1 = new Llist();
        Llist l2 = new Llist();
        l1.insert(4);
        l1.insert(56);
        l2.insert(9);
        Llist res = mergeLists(l1,l2);
        assertEquals("should have head 3 in new linked list",56,res.head.value);
        assertEquals("second node value should be 9",9,res.head.next.value);
        assertEquals("third node value should be 4 in new linked list",4,res.head.next.next.value);
    }

}