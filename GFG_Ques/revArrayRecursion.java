package GFG_Ques;

public class revArrayRecursion {
  static int[] rev(int arr[], int arr2[], int idx){
        if(idx == arr.length){
            return arr2;
        }
        arr2[idx] = arr[arr.length-idx-1];
        return rev(arr, arr2, idx+1);
    }
    public void reverseArray(int arr[]) {
        int arr2[]=new int[arr.length];
        rev(arr, arr2, 0);
        for(int ele=0; ele<arr2.length; ele++){
            arr[ele] = arr2[ele];
        }
    }
}
