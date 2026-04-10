class RandomizedSet {
    ArrayList<Integer> set=new ArrayList<>();
    public RandomizedSet() {
        set=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }
        set.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        for(int i=0; i<set.size(); i++){
            if(set.get(i)==val){
                set.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        int index = (int) (Math.random() * set.size());
        return set.get(index);
    }
}

