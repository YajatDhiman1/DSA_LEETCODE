class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        Arrays.sort(arr1);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<m; i++){
            int idx=0;
            while(idx < n){
                if(arr1[idx] == arr2[i]){
                    list.add(arr1[idx]);
                    arr1[idx] = 0;
                }
                idx++;
            }
        }
        for(int ele: arr1){
            if(ele != 0)list.add(ele);
        }
        int result[]=new int[n];
        for(int i=0; i<n; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}