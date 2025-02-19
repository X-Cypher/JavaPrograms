import java.util.*;

public class kruskal {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
        @Override
        public int compareTo(Edge e2){
            return this.weight - e2.weight;
        }
    }

    static int n = 4;
    static int[] parent = new int[n]; 
    static int[] rank = new int[n];  

    public static void init(){
        for(int i = 0; i < n; i++){
            parent[i] = i; 
        }
    }
    //function to find parent of this num
    public static int find(int num){
        if(num == parent[num]){ 
            return num;
        }
        return parent[num] = find(parent[num]);
    }

    public static void union(int x, int y){
        int parentX = find(x);
        int parentY = find(y);
        if(rank[parentX] == rank[parentY]){ 
            parent[parentY] = parentX; 
            rank[parentX]++;
        } else if(rank[parentX] > rank[parentY]){
            parent[parentY] = parentX;
        } else{
            parent[parentX] = parentY;
        }
    }
    //Sort edges based on their weight and add those edges in MST whose addition does not form a cycle
    public static int kruskalMST(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);
        int count = 0;
        int cost = 0;

        //V vertexes need V-1 edges to create MST
        for(int i = 0; i < edges.size(); i++){
            Edge e = edges.get(i);
            int parSrc = find(e.src);
            int parDest = find(e.dest);
        //if both have same parent, then upon adding this vertex: we will form cycle
        //Cycle checking step
            if(parSrc != parDest){
                union(e.src, e.dest); //make their parent same
                cost += e.weight;
                count++;
                if(count == V-1){ //we just need to add V-1 edges to create MST
                    break;
                }
            }
        }
        return cost;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edge = new ArrayList<>();
        createGraph(edge);
        System.out.println(kruskalMST(edge, V));
    }
    public static void createGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));        
        edges.add(new Edge(2, 3, 50));
    }
}
