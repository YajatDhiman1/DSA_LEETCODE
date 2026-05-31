class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i:arr){
            pq.add(i);
            if(pq.size() > k){
                list.add(pq.remove());
            }
        }
        
        while(pq.size() != 0){
            list.add(pq.remove());
        }
        
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        
    }
}
