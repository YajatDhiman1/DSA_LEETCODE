class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int ans[] = new int[102];
        for(List<Integer> l: nums){
            ans[l.get(0)] += 1;
            ans[l.get(1)+1] -= 1;
        }

        int sum = 0;
        int answer = 0;

        for(int i=0; i<=100; i++){
            sum += ans[i];
            if(sum != 0){
                answer++;
            }
        }

        return answer;
    }
}