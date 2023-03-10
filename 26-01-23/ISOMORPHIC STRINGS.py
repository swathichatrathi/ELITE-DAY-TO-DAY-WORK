# 13)ISOMORPHIC STRINGS 

# SOLUTION IN PYTHON

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        dic={}
        for i in range(len(s)):
            if s[i] not in dic.keys() and t[i] not in dic.values():
                dic[s[i]]=t[i]
        res=True
        for i in range(len(t)):
            if(s[i] not in dic.keys()):
                return False
            if t[i]==dic[s[i]]:
                res=True
            else:
                res=False
                break
        return res
