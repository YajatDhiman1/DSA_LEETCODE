class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        Stack<Integer> stk=new Stack<>();
        while(n != 0){
            int e=n%10;
            stk.push(e);
            n/=10;
        }
        int ptr=0;
        while(!stk.isEmpty()){
            if(ptr%2==0){
                sum += stk.pop();
            }else{
                sum -= stk.pop();
            }
            ptr++;
        }
        return sum;
    }
}