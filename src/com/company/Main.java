package com.company;

public class Main {

    public static void main(String[] args) {
        graph matrix = new graph();

        matrix.setmatrix(7);
        matrix.addedge(0,1,1);
        matrix.addedge(0,2,5);
        matrix.addedge(0,4,3);
        matrix.addedge(1,4,1);
        matrix.addedge(1,5,7);
        matrix.addedge(2,3,1);
        matrix.addedge(3,4,1);
        matrix.addedge(3,5,1);
        matrix.addedge(4,2,1);
        matrix.addedge(4,3,3);
        matrix.addedge(4,5,3);
        matrix.addedge(4,6,4);
        matrix.addedge(4,6,1);


        matrix.printmatrix();
        matrix.prim();
        System.out.println("");

        AdjacencyGraph MyGraph=new AdjacencyGraph();
        Vertex a = new Vertex("0");
        Vertex b = new Vertex("1");
        Vertex c = new Vertex( "2");
        Vertex d = new Vertex("3");
        Vertex e = new Vertex("4");
        Vertex f = new Vertex( "5");
        Vertex g = new Vertex("6");
        MyGraph.addVertex(a);
        MyGraph.addVertex(b);
        MyGraph.addVertex(c);
        MyGraph.addVertex(d);
        MyGraph.addVertex(e);
        MyGraph.addVertex(f);
        MyGraph.addVertex(g);
        MyGraph.addEdge(a,b,1);
        MyGraph.addEdge(a,c, 5);
        MyGraph.addEdge(a,e,3);
        MyGraph.addEdge(b,e,1);
        MyGraph.addEdge(b,f,7);
        MyGraph.addEdge(c,d,1);
        MyGraph.addEdge(d,e,1);
        MyGraph.addEdge(d,g, 1);
        MyGraph.addEdge(e,c, 1);
        MyGraph.addEdge(e,d,3);
        MyGraph.addEdge(e,f, 3);
        MyGraph.addEdge(e,g,4);
        MyGraph.addEdge(f,g, 1);
        //MyGraph.PrintGraph();
        MyGraph.prim();


    }
}
