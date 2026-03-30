class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        for char in t:
            if char in s:
                s = s.replace(char, "", 1)
            else:
                return False
        
        return len(s) == 0
