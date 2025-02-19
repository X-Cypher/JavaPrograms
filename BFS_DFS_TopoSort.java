import java.util.*;
import java.util.LinkedList;

public class BFS_DFS_TopoSort {
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

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0); //adding vertex from where we want to start BFS search

        while(!q.isEmpty()){
            int curr = q.poll();
            if(!visited[curr]){//if curr is not visited: proceed further
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest); //adding curr neighbours
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], boolean visited[], int curr){
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph, visited, e.dest);
            }
        }
    }

    public static void topoSortDFS(ArrayList<Edge> graph[], boolean visited[], Stack<Integer> s, int curr){ //only exists in DAG
        visited[curr] = true;
        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neighbour = e.dest;
            if (!visited[neighbour]) {
                topoSortDFS(graph, visited, s, neighbour);
            }
        }
        s.push(curr);
    }

    public static void inDegree(ArrayList<Edge> graph[], int inDegree[]){
        for(int i = 0; i < graph.length; i++){
            for (int j=0 ;j < graph[i].size() ; j++){
                Edge e = graph[i].get(j); //neighbour edge
                inDegree[e.dest]++;
            }
        }
    }

    //Kahn's algorithm
    public static void topoSortBFS(ArrayList<Edge> graph[], int inDegree[], int curr, Queue<Integer> q){
        inDegree(graph, inDegree);
        for(int i = 0; i < graph.length; i++){
            //add vertexes with indegree = 0 to queue
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            curr = q.poll();//remove from queue and check its neighbours
            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                int neighbour = e.dest;
                inDegree[neighbour]--; //decrease indegree of neighbour by 1, because curr is done
                if(inDegree[neighbour] == 0){ //if this neighbour has indegree=0, add it to q, else check other neighbours
                    q.offer(neighbour);
                }
            }
        }
    }
}
