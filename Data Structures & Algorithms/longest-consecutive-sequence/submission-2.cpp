class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.empty()){
            return 0;
        }
        unordered_set<int> set;
        for(int i:nums) set.insert(i);
        int count=1;
        for(int i : nums){
            int curCount=0;
            if(!set.count(i-1)){
                curCount=1;
                while(set.count(i+curCount)){
                    curCount++;
                    count=max(count,curCount);
                }
            }
        }
        return count;
    }
};
