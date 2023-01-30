#(dict이용)
import sys
from collections import deque

pair=deque()
T=int(input())

for i in range(T):
    N,M=map(int,sys.stdin.readline().split())
    imp=deque(sys.stdin.readline().split())

    papers=deque(map(chr,range(97,97+N)))
    want=papers[M]

    pair=dict(zip(papers,imp))

    pair=dict(sorted(pair.items(),reverse=True,key=lambda item:item[1]))

    pair_paper=list(pair.keys())

    print(pair)
    print(pair_paper)
    print(pair_paper.index(want)+1)

"""import sys
from collections import deque

def check(want,papers,imp):

    count=1

    while True:

        if imp[0]!=max(imp):
            imp.rotate(-1)
            papers.rotate(-1)
            
        else:
            if papers[0]==want:
                print(count)
                break
            else: 
                count+=1
                del imp[0]
                del papers[0]
                continue

pair=deque()
T=int(input())

for i in range(T):
    N,M=map(int,sys.stdin.readline().split())
    imp=deque(sys.stdin.readline().split())

    papers=deque(map(chr,range(97,97+N)))
    want=papers[M]

    check(want,papers,imp)"""