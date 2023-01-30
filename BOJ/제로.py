from collections import deque
import sys

N=int(input())

coin=deque()

for i in range(N):
    number=(int(sys.stdin.readline()))
    if number !=0:
        coin.append(number)
    else:
        coin.pop()

all=sum(coin)
print(all)