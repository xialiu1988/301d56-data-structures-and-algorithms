package llMerge;

import java.util.List;

public class App {
    public static void main(String[] args){

        Llist list1= new Llist();
        list1.insert(5);
        list1.insert(8);
        list1.insert(1);

        List<Node> printOne = list1.print();
        for(Node n :printOne){
            System.out.print(n.value);
            System.out.print("->");
        }
        System.out.print("Null");


        Llist list2= new Llist();
        list2.insert(2);
        list2.insert(3);
        list2.insert(18);

        List<Node> printTwo = list2.print();
        System.out.println();
        for(Node n :printTwo){
            System.out.print(n.value);
            System.out.print("->");
        }
        System.out.print("Null");

        System.out.println();
        System.out.println("Merging");
        Llist res = mergeLists(list1,list2);
        List<Node> print = res.print();
        for(Node n :print){
            System.out.print(n.value);
            System.out.print("->");
        }
        System.out.print("Null");
    }

    public static Llist mergeLists(Llist list1,Llist list2) {
        if((list1.head==null)&&(list2.head==null)){
            throw new IllegalArgumentException("empty lists");
        }
        if((list1.head==null)&&(list2.head!=null)) return list2;
        if((list1.head!=null)&&(list2.head==null)) return list1;
        Node CurrentOne = list1.head;
        Node CurrentTwo = list2.head;


        int counter1 = 0;//using this to define the length of list1
        int counter2 = 0;//using this to define the length of list2

        while (CurrentOne.next != null) {
            CurrentOne = CurrentOne.next;
            counter1++;
        }

        counter1++;


        while (CurrentTwo.next != null) {
            CurrentTwo = CurrentTwo.next;
            counter2++;
        }

        counter2++;

        //reset the current to the head
        CurrentOne = list1.head;
        CurrentTwo = list2.head;

        while (counter1 > counter2 && CurrentOne.next != null) {
            Node temp = CurrentOne.next;
            CurrentOne.next = CurrentTwo;
            CurrentOne = CurrentOne.next;
            CurrentTwo = CurrentTwo.next;
            CurrentOne.next = temp;
            CurrentOne = CurrentOne.next;
        }


        while (counter1 == counter2 && CurrentTwo.next != null) {

            Node temp = CurrentOne.next;
            CurrentOne.next = CurrentTwo;
            CurrentOne = CurrentOne.next;
            CurrentTwo = CurrentTwo.next;
            CurrentOne.next = temp;
            CurrentOne = CurrentOne.next;


        }


        while (counter1 < counter2 && CurrentOne.next != null) {

            Node temp = CurrentOne.next;
            CurrentOne.next = CurrentTwo;
            CurrentOne = CurrentOne.next;
            CurrentTwo = CurrentTwo.next;
            CurrentOne.next = temp;
            CurrentOne = CurrentOne.next;

        }
        CurrentOne.next = CurrentTwo;

        return list1;

    }

}
