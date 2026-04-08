class Solution {
    public char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        char maxch=s.charAt(0);
        int max=0;
        for(char ch: map.keySet()){
            int freq=map.get(ch);
            if(freq>max || (freq == max && ch < maxch)){
                maxch=ch;
                max=freq;
            }
        }
        return maxch;
    }
}