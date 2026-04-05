class MyHashMap {
    ArrayList<Integer> Key=new ArrayList<>();
    ArrayList<Integer> Value=new ArrayList<>();

    public MyHashMap() {
        Key = new ArrayList<>();
        Value = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean flag=false;
        for(int i=0;i<Key.size();i++){
            if(Key.get(i) == key){
                Value.set(i,value);
                flag=true;
                break;
            }
        }
        if(flag == false){
            Key.add(key);
            Value.add(value);
        }
    }
    
    public int get(int key) {
        for(int i=0; i<Key.size(); i++){
            if(key == Key.get(i)){
                return Value.get(i);
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0; i<Key.size(); i++){
            if(Key.get(i) == key){
                Key.remove(i);
                Value.remove(i);
                i--;
                break;
            }
        }
    }
}

