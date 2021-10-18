package com.company;

public class Main {

    public static void main(String[] args) {
        MatrixGraph matrix = new MatrixGraph(7);

        matrix.addEdge(0,1,1);
        matrix.addEdge(0,2,5);
        matrix.addEdge(0,4,3);

        matrix.addEdge(1,4,1);
        matrix.addEdge(1,5,7);

        matrix.addEdge(2,3,1);

        matrix.addEdge(3,4,1);
        matrix.addEdge(3,5,1);

        matrix.addEdge(4,2,1);
        matrix.addEdge(4,3,3);
        matrix.addEdge(4,5,3);
        matrix.addEdge(4,6,4);
        matrix.addEdge(4,6,1);


        matrix.printGraph();
        matrix.MSTPrims();
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
        MyGraph.addEdge(d,f, 1);

        MyGraph.addEdge(e,c, 1);
        MyGraph.addEdge(e,d,3);
        MyGraph.addEdge(e,f, 3);
        MyGraph.addEdge(e,g,4);
        MyGraph.addEdge(e,g,1);

        //MyGraph.PrintGraph();
        MyGraph.prim();


    }
}
