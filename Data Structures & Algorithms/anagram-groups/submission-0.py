class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result={}
        for i in strs:
            count=[0]*26
            for char in i:
                count[ord(char)-ord("a")] +=1
            count = tuple (count)
            if count not in result:
                result[count] = []
            result[count].append(i)

        return list(result.values())
        
        