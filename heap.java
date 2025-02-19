import java.util.*;

public class heap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        //Min heap 
        //add
        public void add(int data){    //O(log n)
            arr.add(data); //add at last index
            // we need to find its parents
            // child = 2i + 1; parent = (x-1)/2
            int x = arr.size()-1 ;//child index
            int parent = (x-1)/2;
            while(arr.get(x) < arr.get(parent)){ //reverse for maxHeap
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
                x = parent;
                parent = (x-1)/2;
            }
        }

        //peek
        public int peek(){
            return arr.get(0);
        }

        //heapify -> used to fix our heap which may be disturbed after deletion of an element
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;
            if(left < arr.size() && arr.get(left) < arr.get(minIdx)){ // reverse for maxHeap
                minIdx = left;
            }
            if(right < arr.size() && arr.get(right) < arr.get(minIdx)){ // reverse for maxHeap
                minIdx = right;
            }//if minIdx is changed then we have to swap
            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                //check heapify for new minIdx, runs until heap is fixed
                heapify(minIdx);
            }
        }

        //delete from minHeap
        public void remove(){

            //Step 1 -> swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // Step 2 -> delete last element
            arr.remove(arr.size()-1);

            //Step 3 -> Heapify
            heapify(0);
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
