class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int res[]=new int[A.length];

        for(int i=0;i<A.length;i++){
            int val=0;
            map.put(A[i], map.getOrDefault(A[i],0)+1);
            map.put(B[i], map.getOrDefault(B[i],0)+1);
            
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() % 2 == 0){
                    val++;
                }
                res[i]=val;
            }
        }

        return res;
    }
}