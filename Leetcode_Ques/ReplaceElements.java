import java.util.*;
class Solution {
    public int[] replaceElements(int[] arr) {
        int num[]=new int[arr.length];
        if(arr.length == 1){
            num[0]=-1;
            return num;
        }else{
            int max=0;
            num[arr.length-1]=-1;
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    int ele=arr[j];
                    if(ele>max){
                        max=ele;
                    }
                }
                num[i]=max;
                max=0;
            }
            return num;
        }
    }
}
