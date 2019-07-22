package getEdges;
import Graph.Graph;
import Graph.Vertex;
import org.junit.Test;

import static getEdges.GetEdge.getEdge;
import static org.junit.Assert.assertEquals;

public class GetEdgeTest {

    @Test
    public void cangetEdge() {

        Graph g = new Graph();

        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");

        g.addEdge(v1,v2,13);
        g.addEdge(v2,v3,34);
        String[] b= getEdge(v1,v3,g);
        assertEquals("false",b[0]);
        assertEquals("0",b[1]);
    }

    @Test
    public void cangetEdgewithTrue() {

        Graph g = new Graph();

        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");

        g.addEdge(v1,v2,13);
        g.addEdge(v2,v3,34);
        String[] b= getEdge(v1,v2,g);
        assertEquals("true",b[0]);
        assertEquals("13",b[1]);
    }
    @Test
    public void cangetEdges() {

        Graph g = new Graph();

        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");

        g.addEdge(v1,v2,13);
        g.addEdge(v2,v3,34);
        String[] b= getEdge(v3,v2,g);
        assertEquals("true",b[0]);
        assertEquals("34",b[1]);
    }
}