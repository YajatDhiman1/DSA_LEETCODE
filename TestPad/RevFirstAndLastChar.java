class Result{
  /*
   * Complete the function capitalizeFirstChar
   * @params
   *   str -> string which is to be modified
   * @returns
   *   The modified string after performing the given operations
   */
  static String swapFirstLastChar(String str) {
      String arr[]=str.split(" ");
      String res="";
      for(int i=0; i<arr.length; i++){
          StringBuilder sb=new StringBuilder(arr[i]);
          char c = sb.charAt(0);
          sb.setCharAt(0, sb.charAt(sb.length()-1));
          sb.setCharAt(sb.length()-1 , c);
          res+=sb;
          if(i < arr.length-1){
              res+=" ";
          }
      }
      return res;
  }
}