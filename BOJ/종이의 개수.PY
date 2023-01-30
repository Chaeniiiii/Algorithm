import sys

N=int(sys.stdin.readline())

paper=[[0]*N for i in range(N)] #2차원 배열 선언
number=[0,0,0] # -1,0,1 을 담을 배열 

for i in range(N):
    paper[i]=list(map(int,sys.stdin.readline().split()))

x=0
y=0
first=paper[x][y]

for i in range(x,x+N):
    for j in range(y,y+N):
        if paper[i][j]!=first:
            pass
        else:
            number[paper[x][y]+1]+=1

print(number[0])
print(number[1])
print(number[2])
