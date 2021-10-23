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
        System.out.println(" ");

        AdjacencyGraph MyGraph=new AdjacencyGraph();
        Vertex Eskildstrup = new Vertex("0");
        Vertex Haslev = new Vertex("1");
        Vertex Holbaek = new Vertex( "2");
        Vertex Jaergerspris = new Vertex("3");
        Vertex Kalundborg = new Vertex("4");
        Vertex Korsoer = new Vertex( "5");
        Vertex Roskilde = new Vertex("6");
        Vertex Maribo = new Vertex("7");
        Vertex Naestved = new Vertex("8");
        Vertex Ringsted = new Vertex( "9");
        Vertex Slagelse = new Vertex("10");
        Vertex Soroe = new Vertex("11");
        Vertex Vordingborg = new Vertex( "12");
        Vertex Koege = new Vertex("13");
        Vertex Nykoebing_F = new Vertex("14");
        Vertex Nakskov = new Vertex("15");

        MyGraph.addVertex(Eskildstrup);
        MyGraph.addVertex(Haslev);
        MyGraph.addVertex(Holbaek);
        MyGraph.addVertex(Jaergerspris);
        MyGraph.addVertex(Kalundborg);
        MyGraph.addVertex(Korsoer);
        MyGraph.addVertex(Koege);
        MyGraph.addVertex(Maribo);
        MyGraph.addVertex(Naestved);
        MyGraph.addVertex(Ringsted);
        MyGraph.addVertex(Slagelse);
        MyGraph.addVertex(Soroe);
        MyGraph.addVertex(Vordingborg);
        MyGraph.addVertex(Roskilde);
        MyGraph.addVertex(Nykoebing_F);
        MyGraph.addVertex(Nakskov);

        MyGraph.addEdge(Eskildstrup, Maribo, 28);
        MyGraph.addEdge(Maribo, Eskildstrup, 28);
        MyGraph.addEdge(Eskildstrup, Nykoebing_F, 13);
        MyGraph.addEdge(Nykoebing_F, Eskildstrup, 13);
        MyGraph.addEdge(Eskildstrup, Vordingborg, 25);
        MyGraph.addEdge(Vordingborg, Eskildstrup, 25);
        MyGraph.addEdge(Haslev, Korsoer, 60);
        MyGraph.addEdge(Korsoer, Haslev, 60);
        MyGraph.addEdge(Haslev, Koege, 24);
        MyGraph.addEdge(Koege, Haslev, 24);
        MyGraph.addEdge(Haslev, Naestved, 25);
        MyGraph.addEdge(Naestved, Haslev, 25);
        MyGraph.addEdge(Haslev, Ringsted, 19);
        MyGraph.addEdge(Ringsted, Haslev, 19);
        MyGraph.addEdge(Haslev, Roskilde, 47);
        MyGraph.addEdge(Roskilde, Haslev, 47);
        MyGraph.addEdge(Haslev, Slagelse, 48);
        MyGraph.addEdge(Slagelse, Haslev, 48);
        MyGraph.addEdge(Haslev, Soroe, 34);
        MyGraph.addEdge(Soroe, Haslev, 34);
        MyGraph.addEdge(Haslev, Vordingborg, 40);
        MyGraph.addEdge(Vordingborg, Haslev, 40);
        MyGraph.addEdge(Holbaek, Jaergerspris,34);
        MyGraph.addEdge(Jaergerspris, Holbaek,34);
        MyGraph.addEdge(Holbaek, Kalundborg,44);
        MyGraph.addEdge(Kalundborg, Holbaek,44);
        MyGraph.addEdge(Holbaek, Korsoer,66);
        MyGraph.addEdge(Korsoer, Holbaek,66);
        MyGraph.addEdge(Holbaek, Ringsted,36);
        MyGraph.addEdge(Ringsted, Holbaek,36);
        MyGraph.addEdge(Holbaek, Roskilde,32);
        MyGraph.addEdge(Roskilde, Holbaek,32);
        MyGraph.addEdge(Holbaek, Slagelse,46);
        MyGraph.addEdge(Slagelse, Holbaek,46);
        MyGraph.addEdge(Holbaek, Soroe,34);
        MyGraph.addEdge(Soroe, Holbaek,34);
        MyGraph.addEdge(Jaergerspris,Korsoer,94);
        MyGraph.addEdge(Korsoer,Jaergerspris,94);
        MyGraph.addEdge(Jaergerspris,Koege,58);
        MyGraph.addEdge(Koege,Jaergerspris,58);
        MyGraph.addEdge(Jaergerspris,Roskilde,33);
        MyGraph.addEdge(Roskilde,Jaergerspris,33);
        MyGraph.addEdge(Jaergerspris,Slagelse,74);
        MyGraph.addEdge(Slagelse,Jaergerspris,74);
        MyGraph.addEdge(Jaergerspris,Soroe,63);
        MyGraph.addEdge(Soroe,Jaergerspris,63);
        MyGraph.addEdge(Kalundborg,Ringsted,62);
        MyGraph.addEdge(Ringsted,Kalundborg,62);
        MyGraph.addEdge(Kalundborg,Roskilde,70);
        MyGraph.addEdge(Roskilde,Kalundborg,70);
        MyGraph.addEdge(Kalundborg,Slagelse,39);
        MyGraph.addEdge(Slagelse,Kalundborg,39);
        MyGraph.addEdge(Kalundborg,Soroe,51);
        MyGraph.addEdge(Soroe,Kalundborg,51);
        MyGraph.addEdge(Korsoer,Naestved,45);
        MyGraph.addEdge(Naestved,Korsoer,45);
        MyGraph.addEdge(Korsoer,Slagelse,20);
        MyGraph.addEdge(Slagelse,Korsoer,20);
        MyGraph.addEdge(Koege,Naestved,45);
        MyGraph.addEdge(Naestved,Koege,45);
        MyGraph.addEdge(Koege,Ringsted,28);
        MyGraph.addEdge(Ringsted,Koege,28);
        MyGraph.addEdge(Koege,Roskilde,25);
        MyGraph.addEdge(Roskilde,Koege,25);
        MyGraph.addEdge(Koege,Vordingborg,60);
        MyGraph.addEdge(Vordingborg,Koege,60);
        MyGraph.addEdge(Maribo,Nakskov,27);
        MyGraph.addEdge(Nakskov,Maribo,27);
        MyGraph.addEdge(Maribo,Nykoebing_F,26);
        MyGraph.addEdge(Nykoebing_F,Maribo,26);
        MyGraph.addEdge(Naestved,Roskilde,57);
        MyGraph.addEdge(Roskilde,Naestved,57);
        MyGraph.addEdge(Naestved,Ringsted,26);
        MyGraph.addEdge(Ringsted,Naestved,26);
        MyGraph.addEdge(Naestved,Slagelse,37);
        MyGraph.addEdge(Slagelse,Naestved,37);
        MyGraph.addEdge(Naestved,Soroe,32);
        MyGraph.addEdge(Soroe,Naestved,32);
        MyGraph.addEdge(Naestved,Vordingborg,28);
        MyGraph.addEdge(Vordingborg,Naestved,28);
        MyGraph.addEdge(Ringsted,Roskilde,31);
        MyGraph.addEdge(Roskilde,Ringsted,31);
        MyGraph.addEdge(Ringsted,Soroe,15);
        MyGraph.addEdge(Soroe,Ringsted,15);
        MyGraph.addEdge(Ringsted,Vordingborg,58);
        MyGraph.addEdge(Vordingborg,Ringsted,58);
        MyGraph.addEdge(Slagelse,Soroe,14);
        MyGraph.addEdge(Soroe,Slagelse,14);

        MyGraph.PrintGraph();
        MyGraph.prim();


    }
}
