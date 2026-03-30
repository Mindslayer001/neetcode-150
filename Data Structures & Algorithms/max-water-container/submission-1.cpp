class Solution {
public:
    int maxArea(vector<int>& height) {
        int  i=0,j=height.size()-1;
        int maxHeight=0;
        while(i<j){
            maxHeight = max(maxHeight,min(height[i],height[j]) * (j-i));
            if(height[i]<=height[j]){
                i+=1;
            }
            else{
                j-=1;
            }
        }
        return maxHeight;
    }
};
