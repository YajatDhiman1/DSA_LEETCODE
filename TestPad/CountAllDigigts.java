public int countDigits(int number){
    int count=0;
    int h=help(number,count);
    return h;
}
static int help(int u, int count){
    if(u ==0 ){
        return count;
    }
    count++;
    u=u/10;
    return help(u,count);
}