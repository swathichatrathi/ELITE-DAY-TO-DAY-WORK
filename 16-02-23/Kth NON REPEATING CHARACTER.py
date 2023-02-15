s=input()
k=int(input())
dic={}
for i in s:
    if i in dic:
        dic[i]+=1
    else:
        dic[i]=1
for i in s:
    if dic[i]==1:
        k-=1
        if k==0:
            print(i)
            break
if(k!=0):
    print(-1)
