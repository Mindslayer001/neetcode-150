class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(nums.length);
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        
        List<int[]> freqSorted = new ArrayList<>(freq.keySet().size());

        for(Map.Entry<Integer, Integer> f : freq.entrySet()){
            freqSorted.add(new int[] {f.getKey(), f.getValue()});
        }

        freqSorted.sort((a,b) -> b[1] - a[1]);
        int[] res = new int[k]; 
        for(int i = 0; i < k; i++){
            res[i] = freqSorted.get(i)[0];
        }

        return res;
    }
}
