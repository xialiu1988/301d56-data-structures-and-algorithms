package getEdges;


import Graph.Graph;
import Graph.Vertex;

import java.util.HashMap;

public class GetEdge {

    public static void main(String[] args) {
        Graph g = new Graph();

        Vertex v1 = g.addNode("a");
        Vertex v2 = g.addNode("b");
        Vertex v3 = g.addNode("c");

        g.addEdge(v1,v2,13);
        g.addEdge(v2,v3,34);
       String[] b= getEdge(v1,v3,g);
       for(String s:b){
           System.out.println(s);
       }

    }

    public static String[] getEdge(Vertex v1,Vertex v2,Graph g)
    {String[] ans=new String[2];
      HashMap<String,Integer> hs= g.getNeighborswithweghts(v1);
      if(hs.containsKey(v2.data))
      {
          ans[0]="true";
          ans[1]=hs.get(v2.data).toString();

      }
      else{
          ans[0]="false";
          ans[1]="0";
      }
      return ans;
    }
}
