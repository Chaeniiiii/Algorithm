"""
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
"""
import re
import sys
stacklist=[]
orderlist=[]

N=int(input())
for i in range(N):
    order=str(sys.stdin.readline())
    orderlist.append(order)

for command in orderlist:
        if "push" in command:
            stacklist.append(re.sub(r'[^0-9]','',command)) 
        elif "pop" in command:
            if len(stacklist)!=0:
                print(stacklist[-1])
                del(stacklist[-1])
            else:
                print("-1")
        elif "size" in command:
            print(len(stacklist))
        elif "empty" in command:
            if len(stacklist)==0:
                print("1")
            else:
                print("0")
        elif "top" in command:
            if len(stacklist)!=0:
                print(stacklist[-1])
            else:
                print("-1")