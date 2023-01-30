import sys

N= int(input())

paper=[list(map(int, sys.stdin.readline().split()))for _ in range(N)]

zero_cnt=0
one_cnt =0

def made_paper(x,y,N):
    
    global zero_cnt
    global one_cnt
    
    same=paper[x][y]

    for i in range(x,x+N):
        for j in range(y,y+N):
            if same!=paper[i][j]:
                made_paper(x,y,N//2)
                made_paper(x,y+N//2,N//2)
                made_paper(x+N//2, y, N//2)
                made_paper(x+N//2, y+N//2, N//2)
                return 
    if same==0:
        zero_cnt+=1
    else:
        one_cnt+=1
  
    
made_paper(0,0,N)
print(zero_cnt,one_cnt)