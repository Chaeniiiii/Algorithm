import sys 
from collections import deque

#도착해야 하는 위치 (N,M)
N,M = map(int,sys.stdin.readline().split())

#미로 생성
maze= [list(map(int,sys.stdin.readline().strip()))for _ in range(N)]

#최단 거리를 구하는 문제이므로 BFS 사용 
def BFS(x,y):

    #위,아래,왼쪽,오른쪽으로 이동하기 위한 좌표
    dx=[-1,1,0,0]
    dy=[0,0,-1,1]

    path=deque()
    visited=[]

    path.append((x,y))

    while path:
        x,y=path.popleft()
        visited.append((x,y))

        for i in range(4):
          pos_x=x+dx[i]
          pos_y=y+dy[i]

          if 0<=pos_x<N and 0<=pos_y<M and maze[pos_x][pos_y]==1 and (pos_x,pos_y) not in visited:
            
            path.append((pos_x,pos_y))

            maze[pos_x][pos_y]=maze[x][y]+1

    print(maze[N-1][M-1])

BFS(0,0)