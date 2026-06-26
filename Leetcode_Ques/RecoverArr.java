class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[friends.length];
        for(int i:friends){
            set.add(i);
        }
        int g=0;
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
                arr[g]=order[i];
                g++;
            }
        }
        return arr;
    }
}