class Solution:
    def maxSubArray(self,nums):
        n=len(nums)
        # sum = float('-inf')
        #
        # for i in range(n):
        #     currsum = 0
        #     for j in range(i,n):
        #         currsum += nums[j]
        #         sum = max(sum,currsum)
        #
        sum = nums[0]
        maxEnd = nums[0]

        for i in range(1,n):
            maxEnd = max(maxEnd+nums[i],nums[i])
            sum = max(sum,maxEnd)

        return sum


obj = Solution()
print(obj.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))

