class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        Stack<Integer> stk=new Stack<>();
        while(k != 0){
            stk.push(pq.remove());
            k--;
        }
        return stk.peek();
    }
}
