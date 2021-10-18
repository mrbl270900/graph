package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AdjacencyGraph {
  ArrayList<Vertex> vertices;
  public AdjacencyGraph(){
      vertices=new ArrayList<Vertex>();
  }
  public void addVertex(Vertex v){
      vertices.add(v);
  }
  public void addEdge(Vertex f,Vertex t, Integer w){
      if(!(vertices.contains(f) && vertices.contains(t)) ) {
          System.out.println(" Vertex not in graph");
          return;
      }
      Edge e=new Edge(f, t,w);
  }
  public  void PrintGraph(){
      for (int i=0;i<vertices.size();i++)
      {
          System.out.println(" From Vertex: "+ vertices.get(i).name);
          Vertex currentfrom=vertices.get(i);
          for(int j=0; j<currentfrom.OutEdges.size();j++){
              Edge currentEdge=currentfrom.OutEdges.get(j);
              System.out.println(" To: "+ currentEdge.to.name + " weight: "+currentEdge.weight);
          }
          System.out.println(" ");
      }
  }
  public void prim(){
        int[] D = new int[vertices.size()];
        int[] P = new int[vertices.size()];
        Myheap<Vertex> Q = new Myheap<>();
        boolean[] visited =  new boolean[vertices.size()];
        Arrays.fill(D, Integer.MAX_VALUE);
        Arrays.fill(P,-1);
        Arrays.fill(visited,false);

      if(D.length>0){
          D[0]=0;
      }

      for(int i=0; i<vertices.size();i++){
          Q.insert(vertices.get(i));
      }

      int pos=Q.getPosition(vertices.get(0));
      Q.decreasekey(pos);
      int MST=0;
      while (!Q.isEmpty()){
          Vertex u = Q.extractMin();
          System.out.println(u.dist);
          for (int v = 0; v < u.OutEdges.size(); v++) {
              if(u.OutEdges.get(v).weight<D[v] && !visited[Integer.parseInt(u.OutEdges.get(v).to.name)]) {
                  D[v] = u.OutEdges.get(v).weight;
                  P[v] = Integer.parseInt(u.name);
                  pos = Q.getPosition(vertices.get(Integer.parseInt(u.OutEdges.get(v).to.name)));
                  Q.decreasekey(pos);
              }
          }
          visited[Integer.parseInt(u.name)] = true;
          MST+=D[Integer.parseInt(u.name)];
      }
      System.out.println("MST size " + MST);
      for(int i=0; i< vertices.size();i++)
      {
          System.out.println(" parent "+ P[i] + " to " + i + " EdgeWeight: " + D[i]);
      }
  }

}

class Vertex implements Comparable<Vertex>{
    String name;
    ArrayList<Edge> OutEdges;
    Integer dist = Integer.MAX_VALUE;
    public Vertex(String id){
        name=id;
        OutEdges=new ArrayList<Edge>();
    }
    public void addOutEdge(Edge e) {
        OutEdges.add(e);
        if(e.weight<this.dist){
            this.dist = e.weight;
        }
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.dist<o.dist)
            return -1;
        if (this.dist>o.dist)
            return 1;
        return 0;
    }
}

class Edge{
    Integer weight;
    Vertex from;
    Vertex to;
    public Edge(Vertex from, Vertex to, Integer cost){
        this.from=from;
        this.to=to;
        this.weight=cost;
        this.from.addOutEdge(this);
    }
}