//7)REVERSE INTEGER 

//SOLUTION IN PYTHON 


class Solution:
    def reverse(self, x: int) -> int:
        s=''
        g=str(x)
        if g[0]=="-":
            s+="-"
            g=g[1:]
        if g[0]=="0":
            i=0
            while(i<len(g) and g[i]=="0"):
                g=g[i:]
                i+=1
        s+=g[::-1]
        if(-2*31<=int(s)<=2*31-1):
            return int(s)
        else:
            return 0
