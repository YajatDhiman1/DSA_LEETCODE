class Solution {
    public int totalWaviness(int num1, int num2) {
        int wavy=0;
        for(int i=num1; i<=num2; i++){
            if(i >= 100){
                wavy += func(i);
            }
        }
        return wavy;
    }
    public int func(int j){
        int g=j;
        ArrayList<Integer> l=new ArrayList<>();
        while(g != 0){
            int temp=g%10;
            l.add(temp);
            g/=10;
        }
        int w=0;
        for(int i=1; i<l.size()-1; i++){
            if(l.get(i) > l.get(i-1) && l.get(i) > l.get(i+1)){
                w++;
            }else if(l.get(i) < l.get(i-1) && l.get(i) < l.get(i+1)){
                w++;
            }
        }
        return w;
    }
}