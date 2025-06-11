class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        count = Counter(nums)
        operations = 0

        for x in list(count.keys()):
            y = k - x
            if x == y:
                operations += count[x] // 2
                count[x] = 0
            elif y in count:
                pairs = min(count[x], count[y])
                operations += pairs
                count[x] -= pairs
                count[y] -= pairs

        return operations