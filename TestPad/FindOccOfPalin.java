static int countPalindrome(String str) {
    String arr[]=str.split(" ");
    int cnt=0;
    for(String s: arr){
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(sb.toString().equals(s)){
            cnt++;
        }
    }
    return cnt;
}