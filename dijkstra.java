import java.util.*;
public class dijkstra {
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
    static class Pair{
        int vertex;
        int path;
        public Pair(int vertex, int path){
            this.vertex = vertex;
            this.path = path;
        }
        // @Override
        // public int compareTo(Pair p2){
        //     return this.path - p2.path;// path based ascending order sorting
        // }
    }
    //Daikstra(pronunciation): this is BFS based algo, greedy based
    //Cannot be used where weight of edges is given in -ve
    //Bellman Ford is an improvement over Dijkstra
    // Here, we are finding shortest distance of all vertex from the source edge(here we took source = 0)
    public static void dijkstras(ArrayList<Edge> graph[], int src){
        boolean visited[] = new boolean[graph.length];
        int distances[] = new int[graph.length];
        Arrays.fill(distances, Integer.MAX_VALUE); //initialize all distances by infinity
        distances[src] = 0;//source ka source se distance 0 hota hai

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.path - y.path);
        pq.offer(new Pair(src, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.vertex;
            if(!visited[node]){ //if this vertex has not been visited yet, visit its neighbours and find cost
                visited[node] = true;

                for(int i = 0; i < graph[node].size(); i++){ //neighbours
                    Edge neighbour = graph[node].get(i);
                    int v = neighbour.dest;
                    int weight = neighbour.weight;
                    int cost = distances[node] + weight;

                //if current distance of this neighbour is more than traveling to this vertex thru node, then update its distance
                    if(cost < distances[v]){ 
                        distances[v] = cost;
                        pq.offer(new Pair(v, distances[v]));
                    }
                }
            }
        }
    }   
}
