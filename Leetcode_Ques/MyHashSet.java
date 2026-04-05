class MyHashSet {
    ArrayList<Integer> arr=new ArrayList<>();
    public MyHashSet() {
        arr=new ArrayList<>();
    }
    
    public void add(int key) {
        boolean flag=false;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == key){
                flag=true;
                break;
            }
        }
        if(flag == false){
            arr.add(key);
        }
    }
    
    public void remove(int key) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == key){
                arr.remove(i);
                i--;
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == key){
                return true;
            }
        }
        return false;
    }
}

