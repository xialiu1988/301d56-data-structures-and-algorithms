package Graph;

import java.util.LinkedList;
import java.util.List;

public class Node {
    public Vertex v;
    public Node next;
    public int weight ;
   public  Node(){}
    public Node(Vertex v,int weight)
    {
       this.v = v;
        this.weight = weight;

    }


    public void setV(Vertex v) {
        this.v = v;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
