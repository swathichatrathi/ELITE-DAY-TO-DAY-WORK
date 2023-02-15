s=input()
sc=0
for i in s:
    if(not i.isalnum()):
        sc+=1
le=[]
lo=[]
for i in range(len(s)):
    if(s[i].isdigit()):
        if(int(s[i])%2==0):
            le.append(s[i])
        else:
            lo.append(s[i])
res=""
if(sc%2==0):
    for i in range(min(len(le),len(lo))):
        res+=le[i]
        res+=lo[i]
    i=i+1
    if(len(le)>len(lo)):
        while(i<len(le)):
            res+=le[i]
            i+=1
    if(len(lo)>len(le)):
        while(i<len(lo)):
            res+=lo[i]
            i+=1
else:
    for i in range(min(len(le),len(lo))):
        res+=lo[i]
        res+=le[i]
    i=i+1
    if(len(le)>len(lo)):
        while(i<len(le)):
            res+=le[i]
            i+=1
    if(len(lo)>len(le)):
        while(i<len(lo)):
            res+=lo[i]
            i+=1
print(res)
