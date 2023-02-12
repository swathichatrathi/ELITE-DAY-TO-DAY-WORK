def fib(n):
    if(n==0):
        return 0
    if(n==1):
        return 1
    return fib(n-1)+fib(n-2)

n=int(input())
if(n%2==0):
    print(fib(n/2))
else:
    print(n)
