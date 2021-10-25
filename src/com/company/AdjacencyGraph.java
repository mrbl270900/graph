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
      MinHeap <Vertex> Q = new MinHeap<>();
      int MST = 0;
      int[] Parent = new int[vertices.size()];
      Arrays.fill(Parent, -1);
      ArrayList<Vertex> inMST = new ArrayList<>();

      for (int i = 0; i < vertices.size(); i++) {
          Q.Insert(vertices.get(i));
      }

      if (vertices.size()>0){
          vertices.get(0).dist = 0;
      }
      int pos = Q.getPosition(vertices.get(0));
      Q.decreasekey(pos);

      while (!Q.isEmpty()){
          Vertex u = Q.extractMin();
          inMST.add(u);
          System.out.println("Den vi kigger på " + u.name);
          for (int e = 0; e < u.OutEdges.size(); e++) {
              Edge E = u.OutEdges.get(e);
              if(E.weight < E.to.dist && !inMST.contains(E.to)) {
                  E.to.dist = E.weight;
                  Parent[Integer.parseInt(E.to.name)] = Integer.parseInt(u.name);
                  pos = Q.getPosition(E.to);
                  Q.decreasekey(pos);
              }
          }
      }

      for (int i = 0; i < vertices.size(); i++) {
          System.out.println("vekter " + i + " har vægt " + vertices.get(i).dist + " og har parent " + Parent[i]);
          MST = MST + vertices.get(i).dist;
      }
      System.out.println("Minimum spanning tree Disitance: " + MST + " Km");
      int Price = MST * 100000;
      System.out.println("Price of the cable is: " + Price + " Kr");

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