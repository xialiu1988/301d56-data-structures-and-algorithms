package Graph;

public class Vertex {
    public String data ;
    public Node firstEdge;
    public boolean visited ;
    public Vertex(String val)
    {
        data = val;
        visited = false;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setFirstEdge(Node firstEdge) {
        this.firstEdge = firstEdge;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
