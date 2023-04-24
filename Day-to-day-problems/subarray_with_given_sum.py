
#Function to find a continuous sub-array which adds up to a given number.
class Solution:
    def subArraySum(self,arr, n, s): 
       #Write your code here
       
       #initialize the pointers
       left = 0
       right = 0
       
       #initialize the current sum
       currsum = arr[0]
       
       if currsum == s:
           
           # first element equals s
           return [1,1] 
       
       while right <= n-1:
           
           #move the right pointer ahead
           right +=1
        #   print("Incremented right pointer. New right ",right)
           
           if right >n-1:
               
               # we have exceeded the bounds of the array
               break
           
           #update the current sum
        #   print("add ",arr[right]," to ",currsum)
           currsum += arr[right]
        #   print("currsum ",currsum)
           
           #compare current sum with desired sum
           if currsum < s:
               
               # continue if current sum is less than desired sum
               continue
           elif currsum == s:
               
               # we have found our subarray
               return [left+1,right+1]
           else:
               
               #since current sum > desired sum, need to move left pointer now
               pass
        
           #current sum exceeds desired sum so start moving the left pointer
           while left <= right:
               
               # move the left pointer
               left +=1
            #   print("Incremented left pointer. New left ",left)
               if left>right:
                   
                   #left cannot exceed right
                   break
               
               #update the current sum
            #   print("subtract ",arr[left-1]," from ",currsum)
               currsum -= arr[left-1]
            #   print("currsum ",currsum)
               
               #compare current sum and desired sum
               if currsum == s:
                   
                   #we have found our result
                   return [left+1,right+1]
                
               elif currsum > s:
                   
                   # continue moving the left pointer but if left pointer is at same pos as right pointer,
                   #move right pointer first
                   if left == right:
                       break
                   else:
                       continue
               else:
                   break
        
       #if you've reached this point then no subarray exists
       return [-1]
               
               
                   
               
       
