package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

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
      MinHeap <Pair> Q = new MinHeap<>();
      ArrayList <Pair> V = new ArrayList<>();
      int[] Distance =new int[vertices.size()];
      int[] predecessor = new int[vertices.size()];
      int MST = 0;
      int Holder = 0;

      Arrays.fill(Distance, Integer.MAX_VALUE);
      Arrays.fill(predecessor,-1);
      if (vertices.size()>0){
          Distance[0]=0;
          vertices.get(0).dist = 0;
      }

      for (int i = 0; i < vertices.size(); i++) {
          V.add(new Pair(Distance[i], i));
          Q.Insert(new Pair(Distance[i], i));
      }

      while (!Q.isEmpty()){
          Pair u=Q.extractMin();
          for (int v = 0; v < vertices.size(); v++) {
                  if(u.distance<Distance[v] && 1==vertices.get(u.index).OutEdges.get(v).to.name.compareTo(String.valueOf(v)))
                  {
                          Distance[v] = vertices.get(u.index).OutEdges.get(v).weight;
                          predecessor[v] = u.index;
                          int pos = Q.getPosition(V.get(v));
                          V.get(v).distance = vertices.get(u.index).OutEdges.get(v).weight;
                          Q.decreasekey(pos);
              }
          }
          MST+=Distance[u.index];
      }
      System.out.println("Minimum spanning tree Dsitance: " +MST);
      for(int i=0; i< vertices.size();i++)
      {
          System.out.println(" parent "+ predecessor[i] + " to " + i + " EdgeWeight: " + Distance[i]);
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