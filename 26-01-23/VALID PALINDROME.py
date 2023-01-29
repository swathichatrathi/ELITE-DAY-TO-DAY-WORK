# 9)VALID PALINDROME

# SOLUTION IN PYTHON 

class Solution:
    def isPalindrome(self, s: str) -> bool:
        ns=''
        for i in s.lower():
            if(i.isalpha() or i.isdigit()):
                ns+=i
        if(ns==ns[::-1]):
            return True
        else:
            return False
