class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left; i<=right; i++){
            check(i,list);
        }
        return list;
    }
    public void check(int no, ArrayList<Integer> a){
        int n=no;
        int temp=0;
        boolean flag=false;
        while(no != 0){
            temp=no%10;
            if(temp == 0){
                flag=false;
                break;
            }else{
                if(n % temp == 0){
                    flag=true;
                }else{
                    flag = false;
                    break;
                }
            }
            no /= 10;
        }
        if(flag){
            a.add(n);
        }
    }
}