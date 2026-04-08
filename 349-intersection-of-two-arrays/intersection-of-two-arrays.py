class Solution(object):
    def intersection(self, nums1, nums2):
         a = set(nums1) & set(nums2)
         return list(a)

        
       
        