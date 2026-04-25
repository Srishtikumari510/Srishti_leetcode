class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        a = nums1 + nums2
        a.sort()
        n = len(a)

        if n % 2 == 0:
            med = (a[n//2 - 1] + a[n//2]) / 2.0
        else:
            med = a[n//2]

        return med