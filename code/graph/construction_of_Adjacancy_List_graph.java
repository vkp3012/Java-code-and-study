import java.util.ArrayList;

public class construction_of_Adjacancy_List_graph{

    public static class Edges{
        int src;
        int nbr;
        int wt;
        Edges(int src,int nbr,int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String args[]){

        //ArrayList of Array
        ArrayList<Edges>[]graph = new ArrayList[7];

        for(int i = 0;i<7;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edges(0,1,10));
        graph[1].add(new Edges(1,0,10));

        
        graph[0].add(new Edges(0,3,40));
        graph[3].add(new Edges(3,0,40));

        graph[1].add(new Edges(1,2,10));
        graph[2].add(new Edges(2,1,10));

        graph[3].add(new Edges(3,2,10));
        graph[2].add(new Edges(2,3,10));

        graph[3].add(new Edges(3,4,3));
        graph[4].add(new Edges(4,3,3));

        graph[4].add(new Edges(4,6,7));
        graph[6].add(new Edges(6,4,7));

        graph[4].add(new Edges(4,5,3));
        graph[5].add(new Edges(5,4,3));

        graph[5].add(new Edges(5,6,2));
        graph[6].add(new Edges(6,5,2));


        for(int i = 0;i<7;i++){
            System.out.print(i + " -> ");
            for(Edges e: graph[i]){
                System.out.print( "(" + e.src + " ," + e.nbr + " ," + e.wt + " )" );
            }
            System.out.println();
        }
    }
}