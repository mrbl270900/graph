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
        int[] P = new int[connectionmatrix.length];
        Myheap<Pair> q = new Myheap<>();
        Pair[] VertexPair= new Pair[connectionmatrix.length];
        for(int i=0; i<connectionmatrix.length;i++){
            D[i]=Integer.MAX_VALUE;
            P[i]=-1;
            Pair newPair = new Pair(D[i],i);
            q.insert(newPair);
            VertexPair[i]=newPair;
        }
        if(D.length>0){
            D[0]=0;
        }
        int pos=q.getPosition(VertexPair[0]);
        VertexPair[0].distence=0;
        q.decreasekey(pos);
        int MST=0;
        while (!q.isEmpty()){
            Pair u = q.extractMin();
            for (int v = 0; v < connectionmatrix.length; v++) {
                if(connectionmatrix[u.index][v]==1 && matrixweigth[u.index][v]<D[v]){
                    D[v]=matrixweigth[u.index][v];
                    P[v]=u.index;
                    pos=q.getPosition(VertexPair[v]);
                    VertexPair[v].distence=D[v];
                    q.decreasekey(pos);
                }
            }
            MST+=D[u.index];
            System.out.println("Edege " + P[u.index] + "," + u.index + " Weight " + D[u.index]);
        }
    System.out.println("MST size " + MST);

        /*
Prims(G):
Q=Ø (empty min-heap/priorityQue)
For each vertex v in G
D[v]=infinity;
P[v]=null;
Q.offer(D[v],v);
D[s]=0;
Q.update(s);
While Q is not empty
u = Q.poll; // remove smallest D[u]
for each edge (u,v) (outedge)
if weight (u,v) < D[v] && u not visited
D[v]= w(u,v);
P[v]=u;
Q.update(v);//get to right position
end if
end for
Mark u as visited
End while*/

}

}
class Pair implements Comparable<Pair>{
        Integer distence;   
        Integer index;

        public Pair(int distence, int index){
            this.distence = distence;
            this.index = index;
        }

    @Override
    public int compareTo(Pair o) {
        return distence.compareTo(o.distence);
    }
}
