# 17)PLUS ONE 

# SOLUTION IN PYTHON

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s=""
        for i in range(len(digits)):
            s+=str(digits[i])
        k=int(s)+1
        l=[]
        for i in str(k):
            l.append(int(i))
        return l
