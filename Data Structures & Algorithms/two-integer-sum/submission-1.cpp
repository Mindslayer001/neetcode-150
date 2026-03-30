class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> map;
        for(int i=0;i<nums.size();i++){
            if(map[nums[i]]){
                return {(map[nums[i]]-1),i};
            }
            map[target-nums[i]]=i+1;
        }
        return {0,0};
    }
};
