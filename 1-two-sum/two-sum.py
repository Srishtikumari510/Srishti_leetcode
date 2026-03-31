class Solution(object):
     def twoSum(self,arr,target):
        for i in range(0,len(arr)):
            for j in range(i+1,len(arr)):

                if arr[i]+arr[j] == target:
                    return[i,j]


   