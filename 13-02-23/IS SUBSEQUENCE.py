class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if(s==""):
            return True
        if(len(s)>len(t)):
            return False
        subsequencelenth=0
        for i in range(len(t)):
            if(s[subsequencelenth]==t[i]):
                subsequencelenth+=1
            if(subsequencelenth==len(s)):
                return True
        return False
