package Data.Structures.LinkedList;

import java.util.List;

public class App {
    public static void main(String[] args){
        Llist list = new Llist();

        list.insert(1);
        list.insert(2);
        list.insert(3);

       List<Node>  n = list.print();


        for(Node e : n){
            System.out.println(e.value);
        }

        System.out.println("==============================");
        System.out.println("==============================");
        list.insert(55);
        List<Node> m = list.print();
        for(Node e : m){
            System.out.println(e.value);
        }
        System.out.println("==============================");
        System.out.println("==============================");
        boolean b = list.includes(3);
        System.out.println(b);
        boolean b2 = list.includes(99);
        System.out.println(b2);

        System.out.println("==============================");
        System.out.println("==============================");

        list.append(789);
        List<Node> m2 = list.print();
        for(Node e : m2){
            System.out.println(e.value);
        }


        System.out.println("==============================");
        System.out.println("==============================");

       list.insertBefore(3,444);
        List<Node> m3 = list.print();
        for(Node e : m3){
            System.out.println(e.value);
        }

        System.out.println("==============================");
        System.out.println("==============================");

        list.insertAfter(3,22);
        list.insertAfter(22,25);
        List<Node> m4 = list.print();
        for(Node e : m4){
            System.out.println(e.value);
        }
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println(list.kthFromEnd(0));
    }

}
