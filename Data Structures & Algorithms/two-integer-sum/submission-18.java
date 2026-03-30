class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pairs = new int[nums.length][2];
        for (int i = 0;i < nums.length;i++){
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a,b) -> a[0] - b[0]);
        
        int i = 0, j = nums.length - 1;

        while(i<j){
            if (pairs[i][0] + pairs[j][0] > target){
                j--;
            } else if(pairs[i][0] + pairs[j][0] < target){
                i++;
            } else{
                return ((pairs[i][1] < pairs[j][1]) ? new int[]{pairs[i][1], pairs[j][1]} : new int[]{pairs[j][1], pairs[i][1]});
            }
        }

        return new int[0];
    }
}
