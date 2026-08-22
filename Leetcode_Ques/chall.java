class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0, pro=1,oo=n;
        ArrayList<Integer> l = new ArrayList<>();
        while(n != 0){
            int temp = n%10;
            l.add(temp);
            n/=10;
        }
        for(int i=0; i<l.size(); i++){
            sum+=l.get(i);
            pro*=l.get(i);
        }
        int plus=pro + sum;
        if(oo%plus == 0){
            return true;
        }else{
            return false;
        }
    }
}