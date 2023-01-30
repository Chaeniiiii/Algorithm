from collections import deque
import sys

N=int(input())
str=[]
left=deque()
right=deque()
for i in range(N):
    #괄호 입력받기
    bracket=input()
    #입력 받은 괄호 하나씩 체크 
    for j in range(0,len(bracket)):
    
        if bracket[j] == "(":
            left.append(bracket[j])
        elif bracket[j]==")":
            right.append(bracket[j])
            if len(left)!=0:
                left.pop()
                right.pop()
    if len(left)==0 and len(right)==0:
        str.append("YES")
        
    else:
        str.append("NO")    
    left.clear()
    right.clear()

print(*str,sep="\n")