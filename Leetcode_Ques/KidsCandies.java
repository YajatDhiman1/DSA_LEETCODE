class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int max=candies[0];
        for(int i=0; i<candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for(int o=0; o<candies.length; o++){
            if(candies[o] + extraCandies >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }

        return res;
    }
}