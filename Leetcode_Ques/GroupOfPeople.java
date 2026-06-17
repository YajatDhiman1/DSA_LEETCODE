class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> groups = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(groupSizes[i]==0)    continue;
            List<Integer> group = new ArrayList<>();
            int size = groupSizes[i];
            int count =0;
            int j =i;
            while(count!=size){
                if(groupSizes[j]==size){
                    group.add(j);
                    groupSizes[j] = 0;
                    count++;
                }
                j++;
            }
            groups.add(group);
        }
        return groups;
    }
}