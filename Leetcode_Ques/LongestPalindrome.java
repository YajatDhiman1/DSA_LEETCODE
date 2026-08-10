class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int size=0, odd=0;
        for(int i=0; i<s.length(); i++){                
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()%2 == 0){
                size+=entry.getValue();
            }else{
                if(odd == 0){
                    size+=entry.getValue();
                    odd=1;
                }else{
                    size+=entry.getValue()-1;
                }
            }
        }

        return size;
    }
}