class Result {
  static int maxElement(int[] arr, int N) {
      int max=-1001;
      for(int i=0; i<N; i++){
          max=Math.max(arr[i], max);
      }
      return max;
  }
}