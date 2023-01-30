import sys
from collections import deque

N=int(sys.stdin.readline())

possible=0
meeting=deque()

def meeting_time(meet):
    finish=deque()
    global possible

    for i in meet:
        key= i[0]
        finish.append(i[1])

        if len(finish)==2:
                end_time = int(finish[0])
                if key >= end_time:
                    finish.popleft()
                    possible+=1
                else:
                    finish.pop()
    print(possible+1)   
           
    

for i in range(N):
    s,f=map(int,sys.stdin.readline().split())
    meeting.append([s,f])
    
meeting=sorted(meeting,key=lambda x:x[0])
meeting=sorted(meeting,key=lambda x:x[1])

meeting_time(meeting)