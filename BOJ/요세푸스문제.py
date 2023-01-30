'''from collections import deque
N,K=map(int,input().split())

permu=[]
deq=deque()
for i in range(1,N+1):
    deq.append(i)

while len(deq)!=0: 
    if(len(deq)>=K):
        permu.append(deq[K-1])
        del(deq[K-1])
        deq.rotate(-(K-1))

    elif len(deq)==1:
        permu.append(deq[0])
        del(deq[0])
    else:
        number=K%len(deq)
        permu.append(deq[number-1])
        deq.remove(deq[number-1])
        if number!=0:
            deq.rotate(-(number-1))
a=str(permu)[1:-1]
print("<"+ a +">")'''

from collections import deque
N,K=map(int,input().split())

permu=[]
deq=deque([i for i in range(1,N+1)])

while len(deq)>0:
    number=K%len(deq)
    deq.rotate(-(number-1))
    permu.append(deq.popleft())

a=str(permu)[1:-1]
print("<"+a+">")
    
