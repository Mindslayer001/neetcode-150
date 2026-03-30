class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dct = Counter(nums)
        print(len(dct))
        result =[]
        bucket= [[] for i in range(len(nums)+1)]
        for key in dct:
            bucket[dct[key]].append(key)
        print(bucket)
        for i in range(len(bucket)-1,-1,-1):
            if bucket[i] and (len(result) < k):
                while bucket[i]:
                    result.append(bucket[i].pop())

        while len(result) > k:
            result.pop()

        return result