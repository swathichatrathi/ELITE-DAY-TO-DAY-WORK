l=[int(i) for i in input().split(",")]
rs=int(input())
l.sort()
count=0
for i in range(len(l)-2):
    e1=l[i]
    low=i+1
    high=len(l)-1
    while(low<high):
        if(l[low]+l[high]<(rs-e1)):
                low+=1
        elif(l[low]+l[high]>(rs-e1)):
            high-=1
        else:
            count+=1
            low+=1
            high-=1
        
if(count==0):
    print(-1)
else:
    print(count)
