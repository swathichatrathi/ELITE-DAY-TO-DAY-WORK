#!/bin/python3

import math
import os
import random
import re
import sys


def superReducedString(s):
    changed=True
    while(changed and len(s)!=0):
        changed=False
        for i in range(len(s)-1):
            if(s[i]==s[i+1]):
                changed=True 
                s=s[:i]+s[i+2:]
                break
    if(s==""):
        return "Empty String"
    return s
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = superReducedString(s)

    fptr.write(result + '\n')

    fptr.close()
