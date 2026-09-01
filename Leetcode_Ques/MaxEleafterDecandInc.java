class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        int y=0;
        for(int i=1; i<arr.length; i++){
            arr[i] = Math.min(arr[y]+1, arr[i]);
            y++;
        }
        return arr[arr.length-1];
    }
}