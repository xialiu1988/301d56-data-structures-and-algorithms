package Graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    public Vertex v;
    public GraphNode next;
    public int weight ;
   public  GraphNode(){}
    public GraphNode(Vertex v,int weight)
    {
       this.v = v;
        this.weight = weight;

    }


    public void setV(Vertex v) {
        this.v = v;
    }

    public void setNext(GraphNode next) {
        this.next = next;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
