#DAY 1 

#1) FIRST UNIQUE CHARACTER IN A STRING

#Here our job is to find the first unique character in a given string and return the index of such character if present else return -1.

#Our solution approach here is :
#We are creating a dictionary which stores the frequencies of all the elements.
#And then iterate through the dictionary key,value pairs : if the value is 1 that means it is the unique character, so we return the index of such character
#Even after iterating through all the elements of the dictionary, if we havent find such element then we return -1.

#SOLUTION IN PYTHON


def firstUniqChar(self, s: str) -> int:
        dic={}
        for keys in s:
            dic[keys] = dic.get(keys,0) + 1
        for x,y in dic.items():
            if y==1:
                return s.index(x)
        return -1
