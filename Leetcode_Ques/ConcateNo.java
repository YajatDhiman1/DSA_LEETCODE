class Solution {
    public long sumAndMultiply(int n) {
        long no=0;
        long sum=0;
        Stack<Integer> stk=new Stack<>();
        while(n != 0){
            int temp=n%10;
            if(temp!=0){
                stk.push(temp);
                sum+=temp;
            }
            n/=10;
        }
        while(!stk.isEmpty()){
            no*=10;
            no+=stk.pop();
        }

        return no*sum;
    }
}