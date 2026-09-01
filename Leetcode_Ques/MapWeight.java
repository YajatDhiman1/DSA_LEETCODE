class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        int i=0;
        for(i=0; i<words.length; i++){
            int weight=0;
            for(int j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                int index=ch-'a';
                weight+=weights[index];
            }
            int id=weight%26;
            int y=25-id;
            res+=(char)('a'+ y);
        }
        return res;
    }
}