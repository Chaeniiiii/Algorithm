import sys

def worm(field,ch_x,ch_y,N,M):

T=int(input())

field=[]

for i in range(T):
    M,N,K=map(int,sys.stdin.readline().split()) # 가로 세로 배추 
    field=[[0]*M for _ in range(N)]
    count=0

    for j in range(K):
        x,y=map(int,sys.stdin.readline().split())

        field[x][y]=1

    for ch_x in range(M):
        for ch_y in range(N):
            if field[ch_x][ch_y]==1:
                worm(field,ch_x,ch_y,N,M)
                count+=1
    print(count)
