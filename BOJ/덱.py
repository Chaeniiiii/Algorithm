'''
push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
'''
from collections import deque
import sys
import re

import time

start = time.time()

N=int(input())

orderlist=[]
queuelist=deque()

for i in range(N):
    orderlist.append(sys.stdin.readline().strip())

for command in orderlist:
    if "push_front" in command:
        if "front" in command:
            number=re.sub(r'[^0-9]','',command)
            queuelist.appendleft(number)
        elif "back" in command:
            number=re.sub(r'[^0-9]','',command)
            queuelist.append(number)
            
    elif "pop" in command:
        if len(queuelist) !=0:
            if "front" in command:
                queuelist.popleft()
            elif "back" in command:
                queuelist.pop()
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
end = time.time() 

print(end - start)