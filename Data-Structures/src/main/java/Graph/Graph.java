package Graph;

import java.util.*;

public class Graph {

    public List<Vertex> Vertices;

    public Graph()
    {
        Vertices = new ArrayList<>();

    }

    // Adds a new node to the graph
    public Vertex addNode(String val)
    {
        Vertex node = new Vertex(val);
        if (Vertices.contains(node))
        {
            System.out.println("already exsits");
            return null;
        }
        else
        {
            Vertices.add(node);
            return node;
        }
    }

    //addedge()Adds a new edge between two nodes in the graph
    //        Include the ability to have a “weight”
    //Takes in the two nodes to be connected by the edge
    //Both nodes should already be in the Graph

    public void addEdge(Vertex n1,Vertex n2,int weight)
    {
        addEdgeOneway(n1, n2,weight);
        addEdgeOneway(n2, n1,weight);

    }

    private void addEdgeOneway(Vertex from, Vertex to,int weight)
    {
        if (from.firstEdge == null)
        {
            from.firstEdge = new GraphNode(to,weight);
        }
        else
        {
            GraphNode node = from.firstEdge;
            GraphNode temp;
            do
            {
                if (node.v.data.equals(to.data))
                {
                   System.out.println("already Exsits this edge");
                }

                temp = node;
                node = node.next;
            } while (node != null);
            temp.next = new GraphNode(to,weight);//add to the last position of the list

        }
    }

    //getnodes()Returns all of the nodes in the graph as a collection (set, list, or similar)

    public List<Vertex> getNodes()
    {
        return Vertices;
    }

    public void print(List<Vertex> list)
    {
        Vertex v;
        for(int i = 0; i < list.size(); i++)
        {
            v = list.get(i);
            GraphNode n = v.firstEdge;
           System.out.println("vertex is"+ v.data + "its list :");
            while (n != null)
            {
               System.out.println("("+n.v.data + ","+n.weight+")"+"->");
                n = n.next;

            }
            System.out.println("null");
            System.out.println();

        }

    }

    // getneighborr()Returns a collection of nodes connected to the given node
    //Takes in a given node
    //Include the weight of the connection in the returned collection

    public List<Vertex> getNeighbors(Vertex n)
    {
        List<Vertex> neighbors = new ArrayList<>();
        int index = Vertices.indexOf(n);
        if (Vertices.get(index).firstEdge != null)
        {
            GraphNode temp = Vertices.get(index).firstEdge;
            while (temp != null)
            {
                neighbors.add(temp.v);
                temp = temp.next;
            }
        }
        return neighbors;
    }

    // get neighbors with nodes' weights
        public HashMap<String,Integer> getNeighborswithweghts(Vertex v)
    {
        HashMap<String, Integer> neighbors = new HashMap<>();

        int index = Vertices.indexOf(v);
        if(Vertices.get(index).firstEdge!=null)
        {
            GraphNode temp = Vertices.get(index).firstEdge;
            while (temp != null)
            {
                neighbors.put(temp.v.data, temp.weight);
                temp = temp.next;
            }
        }

        return neighbors;
    }



    // Returns the total number of nodes in the graph
    public int size()
    {
        return Vertices.size();
    }


    // breadth-first traversal
    public List<Vertex> bFSTraverse()
    {
        List<Vertex> res=bFS(Vertices.get(0));
        return res;
    }

    // breadth-first traversal helper
    public List<Vertex> bFS(Vertex v)
    {//create a list to insotre the vertices
        List<Vertex> list = new ArrayList<>();
        //create a queue
        LinkedList<Vertex> queue = new LinkedList<>();
        list.add(v);
        v.visited = true;
        queue.add(v);
        while (queue.size()>0)
        {
            Vertex w =   queue.removeFirst();
            System.out.println(queue.size());
            System.out.println(w.data);
            GraphNode node = w.firstEdge;
            while (node!= null)
            {
                if (!node.v.visited)
                {
                    list.add(node.v);
                    node.v.visited = true;//means it is already visited
                    queue.add(node.v);//put the vertex in the queue
                }
                node = node.next;//go to next node
            }
        }
        return list;
    }




    //depth-first
    public static List<String> dFS(Vertex v,List<String> s)
    {
        v.visited = true;
        s.add(v.data);
        GraphNode n = v.firstEdge;
        while (n != null)
        {
            if (n.v.visited == false)
            {
                dFS(n.v,s);
            }
            n = n.next;
        }
        return s;
    }






    public static void main(String[] args){
        Graph g = new Graph();
        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");
        g.addEdge(v1, v2, 10);
        g.addEdge(v1, v3, 12);
        System.out.println("errrrrr");
        List<Vertex> list = g.bFSTraverse();
        System.out.println("runninggggggg");
    }
}
