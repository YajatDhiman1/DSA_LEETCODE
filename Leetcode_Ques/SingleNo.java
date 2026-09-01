class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int size=nums.size();
        vector< int > v(size, 0);
        int h;
        int flag=0;
        if(size == 1){
            h=nums[0];
            flag=1;
        }
        if(flag != 1){
            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(i != j && nums[i] == nums[j]){
                        v[i]++;
                    }
                }
            }

            for(int i=0; i<size; i++){
                if(v[i] == 0){
                    h = nums[i];
                }
            }
        }
        return h;
    }
};