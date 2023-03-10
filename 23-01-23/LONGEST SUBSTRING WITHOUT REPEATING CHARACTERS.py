# 2) LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS 

# Here our job is to find the substring of a given string with two conditions that is it should be the longest one which has no repeating characters, that means all the characters in the substring should be unique.

# Our solution approach is:
# Maintain a dictionary which stores all the unique characters
# Maintain two pointers i,j : move j till all the characters upto now are unique and if yes update the maximum length
# If found a repeating character then move the window by removing elements in the dictionary.
# Our output will be the longest substring without repeating characters

# SOLUTION IN PYTHON


def lengthOfLongestSubstring(self, s: str) -> int:
        if s==" ":
            return 1
        elif len(s)==1:
            return 1
        else:
            dic={}
            i=j=0
            res = 0
            while j<len(s):
                dic[s[j]]=dic.get(s[j],0)+1
                if(len(dic)>j-i+1):
                    j+=1
                elif(len(dic)==j-i+1):
                    res=max(res,len(dic))
                    j+=1
                elif(len(dic)<j-i+1):
                    while len(dic)<j-i+1:
                        dic[s[i]]=dic.get(s[i],0)-1
                        if(dic[s[i]]==0):
                            dic.pop(s[i])
                        i+=1
                    j+=1
            return res
