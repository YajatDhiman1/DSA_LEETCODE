package GFG_Ques;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(k>0){
            list.add(pq.remove());
            k--;
        }
        return list;
    }
}
