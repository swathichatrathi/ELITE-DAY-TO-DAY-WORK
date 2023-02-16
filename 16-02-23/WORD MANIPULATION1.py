s=input()
l=sorted(set(s.upper()))
res=[]
for i in range(len(l)):
    newstr=""
    for j in s:
        if(l[i]==j.upper()):
            newstr+=j 
    res.append(newstr)
i=0
j=len(res)-1
out=""
while i<=j:
    if i==j:
        out+=res[i]
    else:
        out+=res[i]+res[j]
    i+=1
    j-=1
print(out)    
