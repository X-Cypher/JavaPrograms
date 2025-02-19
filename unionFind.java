public class unionFind {
    static int n = 7;
    static int[] parent = new int[n]; //parent array to store the parent of each element in set.
    static int[] rank = new int[n];  //rank array to store depth/height of tree for each element in set.

    public static void init(){
        for(int i = 0; i < n; i++){
            parent[i] = i; //initially all nums are their own parent
        }
    }
    //function to find parent of this num
    public static int find(int num){
        if(num == parent[num]){ //the root parent is its own parent
            return num; //base case
        }
        return parent[num] = find(parent[num]);//path compression optimization
    }

    public static void union(int x, int y){
        int parentX = find(x);
        int parentY = find(y);
        if(rank[parentX] == rank[parentY]){ //if rank of both is same, then we can make either one of them as other's parent
            parent[parentY] = parentX; //Y ke parent ka parent -> X ka parent hai
            rank[parentX]++;//rank increased only when both ranks are equal
        } else if(rank[parentX] > rank[parentY]){
            parent[parentY] = parentX;
        } else{
            parent[parentX] = parentY;
        }
    }

    public static void main(String[] args) {
        init();
        System.out.println("parent of 3 : "+find(3));
        union(1, 3);
        System.out.println("parent of 3 : "+find(3));
        union(2, 4);
        union(3, 6);
        System.out.println("parent of 6 : "+find(6));
        union(1, 5);
        System.out.println("parent of 4 : "+find(4));
        System.out.println("parent of 1 : "+find(1));
    }
}
