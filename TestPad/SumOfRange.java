static int sumOfRange(int min, int max){
    int result=0;
    if(min>max){
        return 0;
    }
    for(int i=min; i<=max; i++){
        result+=i;
    }
    return result;
}