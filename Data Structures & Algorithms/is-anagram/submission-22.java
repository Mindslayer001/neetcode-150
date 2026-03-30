class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Integer> freq = new ArrayList<>(26);
        for(int i = 0; i<26;i++){
            freq.add(0);
        }
        for (int i = 0; i < s.length();i++){
            int val = (int) s.charAt(i) -97;
            freq.set(val,freq.get(val)+1);
        }
        for (int i = 0; i< t.length();i++) {
            int val = (int) t.charAt(i) - 97;
            freq.set(val,freq.get(val)-1);
        }
        for(int i = 0; i<freq.size(); i++){
            if (freq.get(i) != 0){
                return false;
            }
        }
        return true;
    }
}
