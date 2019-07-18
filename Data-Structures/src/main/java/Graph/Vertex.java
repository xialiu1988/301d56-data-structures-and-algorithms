package Graph;

public class Vertex {
    public String data ;
    public GraphNode firstEdge;
    public boolean visited ;
    public Vertex(String val)
    {
        data = val;
        visited = false;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFirstEdge(GraphNode firstEdge) {
        this.firstEdge = firstEdge;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
