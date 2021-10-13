package com.company;

public class Main {

    public static void main(String[] args) {
        graph matrix = new graph();
        matrix.setmatrix(7);
        matrix.addedge(0,1,1);
        matrix.addedge(0,2,5);
        matrix.addedge(0,4,3);
        matrix.addedge(1,5,7);
        matrix.addedge(1,4,1);
        matrix.addedge(2,3,1);
        matrix.addedge(3,4,1);
        matrix.addedge(3,6,1);
        matrix.addedge(4,2,1);
        matrix.addedge(4,3,3);
        matrix.addedge(4,6,4);
        matrix.addedge(4,5,3);
        matrix.addedge(5,6,1);

        
        matrix.printmatrix();
        matrix.prim();

    }
}
