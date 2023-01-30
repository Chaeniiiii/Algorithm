import sys
from collections import deque

#총 단지수
N= int(sys.stdin.readline())

#단지 생성
complex=[list(map(int,sys.stdin.readline().strip()))for _ in range(N)]

com_num=[] # 가구수를 저장하기 위한 list
visited=[] # 방문한 위치를 저장하기 위한 list

#가구가 존재하는 곳만 뽑아내기 
house=deque()

for i in range(N):
    for j in range(N):
        if complex[i][j]==1:
            house.append((i,j))

#bfs로 가구 수 찾기 
def BFS(house):
    count=0

    #각 단지별로 가구의 위치 저장
    find=deque()

    #처음 시작 위치
    x,y= house.popleft()
    find.append((x,y))

    #bfs 시작     
    while find:
        new_x,new_y=find.popleft()

        count+=1
                
        dx=[-1,1,0,0]
        dy=[0,0,-1,1]

        for i in range(4):
            pos_x=new_x+dx[i]
            pos_y=new_y+dy[i]

            if 0<=pos_x<N and 0<=pos_y<N and complex[pos_x][pos_y]==1 and (pos_x,pos_y) in house:
                    
                find.append((pos_x,pos_y))

                #방문한 가구는 삭제해주기
                if (pos_x,pos_y) in house:
                    house.remove((pos_x,pos_y))

    com_num.append(count)
    
    #아직 방문하지 않은 가구가 있으면 bfs 한번 더 돌리기 
    if len(house)!=0:
        BFS(house)

BFS(house)

com_num.sort()
print(len(com_num))
print(*com_num,sep="\n")