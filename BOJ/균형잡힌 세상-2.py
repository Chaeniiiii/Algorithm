import sys
from collections import deque

left=deque()
right=deque()

sentence=[]
answer=deque()
while True:
    
    number=str(sys.stdin.readline().strip("\n"))
    sentence.append(number)
    #"."가 입력되면 whlie문은 끝남
    if number == ".":
        break

for check in sentence:
    
    if check==".":
        break
    
    for j in range(0,len(check)):

        #여는 괄호 닫는 괄호 각각 덱에 넣어주기 
        if check[j]== "(" or check[j]=="[":
            left.append(check[j])

        #닫는 소괄호가 나왔을 때 체크해주기 
        elif check[j]== ")":
            right.append(check[j])
            if len(left)!=0 and left[-1]=="(":
                left.pop()
                right.pop()

        #닫는 대괄호가 나왔을 때 체크해주기 
        elif check[j]== "]":
            right.append(check[j])
            if len(left)!=0 and left[-1]=="[":
                left.pop()
                right.pop()
    
    if len(left)==0 and len(right)==0:
        answer.append("yes")
    else:
        answer.append("no")
        
    left.clear()
    right.clear()


print(*answer,sep="\n")