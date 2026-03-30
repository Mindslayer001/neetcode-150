class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> freq = new HashMap<>(strs.length);
        String tempVar;
        for (int i = 0; i < strs.length; i++){
            char[] tempArr = strs[i].toCharArray();
            Arrays.sort(tempArr);
            tempVar = new String(tempArr);
            if (!freq.containsKey(tempVar)){
                freq.put(tempVar, new ArrayList<>());
            }
            freq.get(tempVar).add(strs[i]);
        }
        return new ArrayList<>(freq.values());
    }
}
