package com.company;

public class graph {

    int[][] connectionmatrix;
    int[][] matrixweigth;
    int numbervertices;

    public void setmatrix(int vertices){
        this.connectionmatrix = new int[vertices][vertices];
        this.matrixweigth = new int[vertices][vertices];
        this.numbervertices=vertices;
    }
    public void addedge(int from, int to, int weight){
        this.connectionmatrix[from][to] = 1;
        this.matrixweigth[from][to] = weight;
    }

    public void printmatrix(){
        int x = 0;
        for (int i = 0; i < this.connectionmatrix.length;i++){
            for (int j = 0; j < this.connectionmatrix.length; j++) {
                if(this.connectionmatrix[i][j]==1){
                    System.out.println("edge form " + i + " to "+ j +" has a weight of "+ this.matrixweigth[i][j]);
                }
            }
            }
        }

public void prim(){
        int[] D = new int[connectionmatrix.length];
        int[] P=new int[connectionmatrix.length];
        for(int i=0; i<connectionmatrix.length;i++){
            D[i]=Integer.MAX_VALUE;
            P[i]=-1;

        }

}

}
