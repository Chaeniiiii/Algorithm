'''
push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
'''
import sys
import re

N=int(input())

orderlist=[]
queuelist=[]

for i in range(N):
    orderlist.append(sys.stdin.readline().strip())

for command in orderlist:
    if "push" in command:
        queuelist.append(re.sub(r'[^0-9]','',command))

    elif "pop" in command:
        if len(queuelist) !=0:
            print(queuelist[0])
            del(queuelist[0])
        else:
            print(-1)
    elif "size" in command:
        print(len(queuelist))
    elif "empty" in command:
        if len(queuelist)==0:
            print(1)
        else:
            print(0)
    elif "front" in command:
        if len(queuelist)==0:
            print(-1)
        else:
            print(queuelist[0])
            
    elif "back" in command:
        if len(queuelist)==0:
            print(-1)
        else:
            print(queuelist[-1])
            