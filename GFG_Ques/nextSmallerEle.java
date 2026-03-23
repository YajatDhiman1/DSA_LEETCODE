import java.util.*;
package GFG_Ques;

class Solution {
    public ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        
        for(int x: arr){
            res.add(-1);
        }
        
        int n=arr.length;
        
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() >= arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()) {
                res.set(i,stk.peek());
            }
            stk.push(arr[i]);
        }
        
        return res;
    }
}
