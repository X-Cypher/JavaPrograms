import java.util.*;
public class prim {
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

    static class Pair implements Comparable<Pair>{
        int vertex;
        int weight;
        public Pair(int vertex, int weight){
            this.vertex = vertex;
            this.weight = weight;
        }
        @Override
        public int compareTo(Pair p2){
            return this.weight - p2.weight;
        }
    }

    //function to return cost/weight of generated MST
    public static int primMST(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[graph.length];
        pq.offer(new Pair(0, 0)); //choose random starting vertex

        int cost = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int curr = p.vertex;
            int wt = p.weight;
            if(!visited[curr]){
                visited[curr] = true;
                cost += wt;
                for(Edge e : graph[curr]){ //neighbours of curr
                    if(!visited[e.dest]){
                        pq.offer(new Pair(e.dest, e.weight));
                    }
                }
            }
        }
        return cost;
    }
}
