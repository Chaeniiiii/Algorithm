
import re
import sys
from collections import deque

N=int(input())
string=deque()
rev_str=[]

for i in range(0,N):
    mes=sys.stdin.readline()
    string.append(mes.split())
    for j in range(0,len(string[i])):
        rev=string[i][j]
        rev=rev[::-1]
        string[i][j]=rev

for k in range(0,N):
    good=" ".join(string[k])
    print(good)