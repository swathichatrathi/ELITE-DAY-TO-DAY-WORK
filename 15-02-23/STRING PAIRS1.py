l=[str(i) for i in input().split(",")]
n=len(l)
k=0
s=set()
for i in range(n):
    for j in range(n):
        s.add((l[i],l[j]))
for pair in s:
    if((pair[1]!=pair[0])):
        x=0
        for e in pair[1]:
            if e not in pair[0]:
                x=1
                break
        if(x!=1):
            k+=1
if(k==0):
    print(-1)
else:
    print(k)
