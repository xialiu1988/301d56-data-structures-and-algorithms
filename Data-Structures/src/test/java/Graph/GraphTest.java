package Graph;

import Tree.Tree;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest extends Tree {

    @Test
    public void addNode() {
        Graph p = new Graph();

        Vertex v1= p.addNode("a");
       assertEquals("a", v1.data);
    }

    @Test
    public void addEdge() {
        Graph p = new Graph();
        Vertex v1 = p.addNode("a");
        p.addEdge(v1, v1, 3);
       assertEquals(3, v1.firstEdge.weight);
    }

    @Test
    public void getNodes() {

        Graph g = new Graph();
        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");
        Vertex v4 = g.addNode("d");

        List<Vertex> list= g.getNodes();
        assertTrue(list.size() == 4);
        assertTrue(list.get(0).data == "a");
        assertTrue(list.get(1).data == "b");
        assertTrue(list.get(2).data == "c");
        assertTrue(list.get(3).data == "d");
    }

    @Test
    public void getNeighbors() {
        Graph g = new Graph();
        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");
        g.addEdge(v1, v2, 10);
        g.addEdge(v1, v3, 12);
        List<Vertex> list=g.getNeighbors(v1);
        assertTrue(list.size() == 2);
    }

    @Test
    public void getNeighborswithweghts() {
        Graph g = new Graph();
        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");

        g.addEdge(v1, v2, 10);
        g.addEdge(v1, v3, 12);
        HashMap<String,Integer> list = g.getNeighborswithweghts(v1);
        assertTrue(list.size() == 2);
        assertTrue(list.get("b")==(10));
        assertTrue(list.get("c")==(12));
    }



   @Test
    public void nullgraph()
    {
        Graph g = new Graph();
       assertTrue(g.size() == 0);

    }

//    @Test
//    public void bFSTraverse() {
//        Graph g = new Graph();
//        Vertex v1 = g.addNode("a");
//        Vertex v2 = g.addNode("b");
//        Vertex v3 = g.addNode("c");
//        g.addEdge(v1, v2, 10);
//        g.addEdge(v1, v3, 12);
//        List<Vertex> list = g.bFSTraverse();
//        assertEquals(3, list.size());
//        assertEquals("a", list.get(0).data);
//        assertEquals("b", list.get(1).data);
//        assertEquals("c", list.get(2).data);
//    }
}