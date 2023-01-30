import sys
from collections import deque

#총 단지수
N= int(sys.stdin.readline())

#단지 생성
complex=[list(map(int,sys.stdin.readline().strip()))for _ in range(N)]

#단지 내 총 가구 수 계산
cnt_one=0

for i in range(N):
    one=complex[i].count(1)
    cnt_one+=one

com_num=[] # 각 단지 내의 가구 수를 저장하기 위한 리스트
visited=[] # 방문한 가구를 저장하기 위한 리스트 
pos=deque() # 현재 위치를 나타내기 위한 리스트

def BFS(x,y,N,cnt_one):

    global complex
    global com_num
    global visited

    dx=[-1,1,0,0] #위,아래
    dy=[0,0,-1,1] #왼,오른쪽

    house=deque() # 각 단지 내 가구

    pos.append((x,y))


    # 1을 찾으면 while문 종료 
    while len(house)==0:
        #최근 위치
        x,y=pos[len(pos)-1]


        #출발 지점이 1이고 방문하지 않았던 곳이라면 house deque 에 삽입 
        if complex[x][y]==1 and (x,y) not in visited:
            house.append((x,y))

        # 아니면 상하좌우 탐색
        else: 

            for i in range(4):
                pos_x=x+dx[i] 
                pos_y=y+dy[i] 
            
                if 0<=pos_x<N and 0<=pos_y<N :
                    if (pos_x,pos_y) not in pos: # 1인지 아닌지 판단을 하지 않은 곳
                        if complex[pos_x][pos_y]==1 and (pos_x,pos_y) not in visited:
                            house.append((pos_x,pos_y))
                        else:
                            pos.append((pos_x,pos_y))
           
                            
    BFS2(house)

def BFS2(house):
    global complex
    global com_num
    global visited

    dx=[-1,1,0,0] #위,아래
    dy=[0,0,-1,1] #왼,오른쪽
    count=0

    while house:       

        new_x, new_y= house.popleft() # 단지 내 가구 탐색의 출발점
                                
        if (new_x,new_y) not in visited:
            visited.append((new_x,new_y))
            count+=1

        for j in range(4):
            house_x=new_x+dx[j]
            house_y=new_y+dy[j]
                                    
            if 0<=house_x<N and 0<=house_y<N :
                house_pos=complex[house_x][house_y]

                if house_pos==1 and (house_x,house_y) not in visited:
                    house.append((house_x,house_y))

                            
    com_num.append(count)
    
    if len(visited)<cnt_one:
        start_x,start_y=visited[len(visited)-1]

        BFS(start_x,start_y,N,cnt_one)
                        

BFS(0,0,N,cnt_one)

com_num.sort()
print(len(com_num))
print(*com_num,sep="\n")