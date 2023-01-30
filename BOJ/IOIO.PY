import sys
from collections import deque

n=int(sys.stdin.readline())
m=int(sys.stdin.readline())
s=sys.stdin.readline().strip()

P="IO"*n+"I"

start=0
count=0
length=2*n+1

check=s[start:]

while start<=m:
    if s[start:start+length]==P:
        count+=1
        start+=2
    else:
        if check[0:2]=="I":
            start+=2
        else:
            start+=1    

print(count)