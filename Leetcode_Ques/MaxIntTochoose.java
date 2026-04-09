class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        for (int val : banned) {
            set.add(val);
        }
        for (int i = 1; i <= n; i++) {
            if(!set.contains(i)){
                if(sum < maxSum){
                    if(sum+i>maxSum){
                        return list.size();
                    }
                    else if(sum + i == maxSum ){
                        return list.size()+1;
                    }else {
                        sum+=i;
                        list.add(i);
                    }
                }
            }else{
                continue;
            }
        }
        return list.size();
    }
}