import java.util.*;
public class cycleDetectDirected {
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
        boolean stack[] = new boolean[graph.length]; //visited array for current path

        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                if(hasCycleUtil(graph, visited, stack, i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean hasCycleUtil(ArrayList<Edge> graph[], boolean visited[], boolean stack[], int curr){
        visited[curr] = true;
        stack[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neighbour = e.dest;
            if(stack[neighbour] == true){ //if neighbour is in current path, then cycle is present
                return true;
            }
            if(!visited[neighbour]){ 
            //if neighbour has not been visited, then check if it has cycle
                if(hasCycleUtil(graph, visited, stack, neighbour)){
                    return true;
                }
            }
        }
        stack[curr] = false; //remove node from current path, because it is backtracking now
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        for(int i = 0; i < V; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2, 1));
        
        graph[1].add(new Edge(1, 0, 1));
      
        graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 0, 1));
  

        System.out.println(hasCycle(graph));
    }
}
