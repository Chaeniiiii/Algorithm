from collections import deque

N=int(input())
card=deque([i for i in range(1,N+1)])

for j in range(N):
    if len(card)>1:
        card.popleft()
        card.rotate(-1)
    else:
        print(card[0])

