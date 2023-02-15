l=[int(i) for i in input().split()]
i5=l.index(5)
i8=l.index(8)
s1=0
for i in range(0,i5):
    s1+=l[i]
for i in range(i8+1,len(l)):
    s1+=l[i]
s2=""
for i in range(i5,i8+1):
    s2+=str(l[i])
print(s1+int(s2))
