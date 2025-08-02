class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[]
        n=len(nums)
        def helper(index,subset):
            if index==n:
                res.append(subset[:])
                return
            helper(index+1,subset)
            subset.append(nums[index])
            helper(index+1,subset)
            subset.pop()
        helper(0,[])
        return res      
        