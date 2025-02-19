//given a 2 x n sized floor, size of tiles : 2 x 1, find the number of ways the floor can be tiled
//floor pe tiles lgane ke kitne ways hai 
public class recursionFloor {
    public static int tiles(int n){
        if(n == 0 || n== 1){
            return 1;  //only 1 way to arrange the tiles
        }
        //if we place vertical tile we fill 1 space
        //if we place horizontal tile we fill 2 spaces
        int vertical = tiles(n-1);
        int horizontal = tiles(n-2);
        return vertical + horizontal;
    }
    public static void main(String[] args) {
        System.out.println(tiles(4));
    }
}
