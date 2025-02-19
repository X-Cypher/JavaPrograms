import java.util.*;
public class bellmanFord {
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
    public static void bellmanFords(ArrayList<Edge> graph[], int src){
        int V = graph.length;  // Number of vertices in the graph
        int E = graph[0].size();   // Number edges in the graph
        int dist[] = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        
        //O(V*E)
        for(int i = 0; i < V-1; i++){ //run V-1 times
            //traveses each edge
            for(int j = 0; j < V; j++){
                for(int k = 0; k < graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    if(dist[e.src] != Integer.MAX_VALUE && (dist[e.src] + e.weight < dist[e.dest])){
                        dist[e.dest] = dist[e.src] + e.weight;
                    }
                }
            }
        }

        //since this algo guarantees shortest distances if graph doesn't contain negative weight cycle.
        //checking for negative weight cycle
        //this below is the Vth iteration, refer to line 37
        for(int i = 0; i < V; i++){
            for(int j = 0; j < E; j++){
                Edge e = graph[i].get(j);
                //agar ab koi shortest path ki value change hui, this means there is a negative weight cycle present 
                if(dist[e.src] != Integer.MAX_VALUE && (dist[e.src] + e.weight < dist[e.dest])){
                    System.out.println("Graph contains negative cycle");
                }
            }
        }
    }
}
