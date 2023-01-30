import sys
from collections import deque

left=deque()
right=deque()
answer=[]

while True:
    left.clear()
    right.clear()
    print("현 상황 {}{}".format(left,right))
    number=str(sys.stdin.readline())

    #"."가 입력되면 whlie문은 끝남
    if number == ".\n":
        break
    
    #괄호 추출 
    for i in range(0,len(number)):
        print(number[i])

        if number[i] == "(" or number[i] == "{" or number[i]=="[":
            left.append(number[i])
            print(left)

        if number[i] == ")" :
            check=left[-1]
            print(check)
            left.pop()

            if check==number[i]:
                continue
            else:
                answer.append("NO")
                break
    answer.append("YES")
print(answer)
    