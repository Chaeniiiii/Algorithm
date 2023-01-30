import sys
import heapq

N= int(input())

num=[]
heap=[]


for i in range(0,N):
    num.append(int(sys.stdin.readline()))
    
for j in num:
    parent=1
    if j==0:
        if len(heap)==0:
            print(0)
        else:
            mini=heap[0]
            print(mini)
            heapq.heappop(heap)
    else:
        heapq.heappush(heap,j)

            

