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
        Vertex Eskildstrup = new Vertex("0");
        Vertex Haslev = new Vertex("1");
        Vertex Holbæk = new Vertex( "2");
        Vertex Jærgerspris = new Vertex("3");
        Vertex Kalundborg = new Vertex("4");
        Vertex Korsør = new Vertex( "5");
        Vertex Roskilde = new Vertex("6");
        Vertex Maribo = new Vertex("7");
        Vertex Næstved = new Vertex("8");
        Vertex Ringsted = new Vertex( "9");
        Vertex Slagelse = new Vertex("10");
        Vertex Sorø = new Vertex("11");
        Vertex Vordingborg = new Vertex( "12");
        Vertex Køge = new Vertex("13");
        Vertex Nykøbing_F = new Vertex("14");
        Vertex Nakskov = new Vertex("15");

        MyGraph.addVertex(Eskildstrup);
        MyGraph.addVertex(Haslev);
        MyGraph.addVertex(Holbæk);
        MyGraph.addVertex(Jærgerspris);
        MyGraph.addVertex(Kalundborg);
        MyGraph.addVertex(Korsør);
        MyGraph.addVertex(Køge);
        MyGraph.addVertex(Maribo);
        MyGraph.addVertex(Næstved);
        MyGraph.addVertex(Ringsted);
        MyGraph.addVertex(Slagelse);
        MyGraph.addVertex(Sorø);
        MyGraph.addVertex(Vordingborg);
        MyGraph.addVertex(Roskilde);
        MyGraph.addVertex(Nykøbing_F);
        MyGraph.addVertex(Nakskov);

        MyGraph.addEdge(Eskildstrup, Maribo, 28);
        MyGraph.addEdge(Eskildstrup, Nykøbing_F, 13);
        MyGraph.addEdge(Eskildstrup, Vordingborg, 25);
        MyGraph.addEdge(Haslev, Korsør, 60);
        MyGraph.addEdge(Haslev, Køge, 24);
        MyGraph.addEdge(Haslev, Næstved, 25);
        MyGraph.addEdge(Haslev, Ringsted, 19);
        MyGraph.addEdge(Haslev, Roskilde, 47);
        MyGraph.addEdge(Haslev, Slagelse, 48);
        MyGraph.addEdge(Haslev, Sorø, 34);
        MyGraph.addEdge(Haslev, Vordingborg, 40);
        MyGraph.addEdge(Holbæk, Jærgerspris,34);
        MyGraph.addEdge(Holbæk, Kalundborg,44);
        MyGraph.addEdge(Holbæk, Korsør,66);
        MyGraph.addEdge(Holbæk, Ringsted,36);
        MyGraph.addEdge(Holbæk, Roskilde,32);
        MyGraph.addEdge(Holbæk, Slagelse,46);
        MyGraph.addEdge(Holbæk, Sorø,34);
        MyGraph.addEdge(Jærgerspris,Korsør,94);
        MyGraph.addEdge(Jærgerspris,Køge,58);
        MyGraph.addEdge(Jærgerspris,Ringsted,56);
        MyGraph.addEdge(Jærgerspris,Roskilde,33);
        MyGraph.addEdge(Jærgerspris,Slagelse,74);
        MyGraph.addEdge(Jærgerspris,Sorø,63);
        MyGraph.addEdge(Kalundborg,Ringsted,62);
        MyGraph.addEdge(Kalundborg,Roskilde,70);
        MyGraph.addEdge(Kalundborg,Slagelse,39);
        MyGraph.addEdge(Kalundborg,Sorø,51);
        MyGraph.addEdge(Korsør,Næstved,45);
        MyGraph.addEdge(Korsør,Slagelse,20);
        MyGraph.addEdge(Køge,Næstved,45);
        MyGraph.addEdge(Køge,Ringsted,28);
        MyGraph.addEdge(Køge,Roskilde,25);
        MyGraph.addEdge(Køge,Vordingborg,60);
        MyGraph.addEdge(Maribo,Nakskov,27);
        MyGraph.addEdge(Maribo,Nykøbing_F,26);
        MyGraph.addEdge(Næstved,Roskilde,57);
        MyGraph.addEdge(Næstved,Ringsted,26);
        MyGraph.addEdge(Næstved,Slagelse,37);
        MyGraph.addEdge(Næstved,Sorø,32);
        MyGraph.addEdge(Næstved,Vordingborg,28);
        MyGraph.addEdge(Ringsted,Roskilde,31);
        MyGraph.addEdge(Ringsted,Sorø,15);
        MyGraph.addEdge(Ringsted,Vordingborg,58);
        MyGraph.addEdge(Slagelse,Sorø,14);


        MyGraph.PrintGraph();
        MyGraph.prim();


    }
}
