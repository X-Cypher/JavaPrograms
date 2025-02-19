import java.util.*;
public class cycleDetectUndirected {
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

    public static boolean hasCycle(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){ //for connected components. IMP
            if(!visited[i]){
                if(DFSutil(graph, visited, i, -1)){ //we can use DFS and BFS both
                    return true;
                }
            }
        }
        return false;
    }

    //agar neighbour parent nahi hai toh cycle hamesha hogi
    public static boolean DFSutil(ArrayList<Edge> graph[], boolean visited[], int curr, int parent){
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){ //if neighbour is not visited
                if(DFSutil(graph, visited, e.dest, curr)){ // and cycle is detected thru neighbour
                    return true;
                }
            } else if(visited[e.dest] && e.dest != parent){ //if neighbour is already visited and neighbour is not parent: This means there is cycle
                return true;
            } //if neighbour is already visited and neighbour is also the parent: we can't say whether there is cycle or not, so just continue
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));
        graph[0].add(new Edge(0, 3, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        // graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 3, 1));

        System.out.println(hasCycle(graph));
    }
}
