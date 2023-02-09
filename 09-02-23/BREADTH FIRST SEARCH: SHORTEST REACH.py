# GRAPHS

# BREADTH FIRST SEARCH: SHORTEST REACH 

# HACKERRANK SOLUTION IN JAVA

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'bfs' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER m
#  3. 2D_INTEGER_ARRAY edges
#  4. INTEGER s
#
def bfs(n, m, edges, s):
    # Write your code here
    visited=[0]*(n+1)
    res=[-1]*(n+1)
    adjlist=[[] for i in range(n+1)]
    for e in edges:
        adjlist[e[0]].append(e[1])
        adjlist[e[1]].append(e[0])
    queue=[s]
    visited[s]=1
    res[s]=0
    while queue:
        curr=queue[0]
        queue.pop(0)
        clist=adjlist[curr]
        for e in clist:
            if(visited[e]==0):
                visited[e]=1
                res[e]=res[curr]+1
                queue.append(e)
    out=[]
    for i in range(1,n+1):
        if (i!=s and res[i]!=-1):
            out.append(res[i]*6)
        else:
            if(res[i]==-1):
                out.append(-1)
    return out

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        first_multiple_input = input().rstrip().split()

        n = int(first_multiple_input[0])

        m = int(first_multiple_input[1])

        edges = []

        for _ in range(m):
            edges.append(list(map(int, input().rstrip().split())))

        s = int(input().strip())

        result = bfs(n, m, edges, s)

        fptr.write(' '.join(map(str, result)))
        fptr.write('\n')

    fptr.close()
