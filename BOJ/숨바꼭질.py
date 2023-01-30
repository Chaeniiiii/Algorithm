import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())
array = [0] * 100001

def bfs(pos):
    count=0
    path = deque([pos])
    
    while path:
        pos= path.popleft()
        if pos == k:
            print(array[pos])
            break
        
        for next_pos in (pos-1, pos+1, 2*pos):
            if 0 <= next_pos < 100001 and array[next_pos]==0:
                array[next_pos] = array[pos]+1
                path.append(next_pos)
        
bfs(n)