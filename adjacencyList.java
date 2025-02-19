import java.util.*;
public class adjacencyList {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V]; //int arr[] = new int[5]
        // since all index of graph will have null stored in them, so we store empty ArrayList in them
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        //vertex 0
        graph[0].add(new Edge(0, 1, 5));
        //vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));
        //vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
        //vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        //vertex 4
        graph[4].add(new Edge(4, 2, 2));

        //Finding 1 edge's neighbours
        System.out.println("Neighbours of vertex 1 are:");
        for(int i = 0; i < graph[1].size(); i++){
            //get edges of 1
            Edge e = graph[1].get(i);
            System.out.println(e.dest);
        }
    }
}
