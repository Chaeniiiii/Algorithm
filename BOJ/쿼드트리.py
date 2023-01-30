import sys

#영상 크기 입력
N=int(sys.stdin.readline())

#쿼드 트리 입력 
quad=[list(map(int,sys.stdin.readline().strip())) for _ in range(N)]

def divide(x,y,m):
    print(x,y,m)
    check=quad[x][y]
    for i in range(x,x+m):
        for j in range(y,y+m):
            if check!=quad[i][j]:
                # 4개의 type으로 나눠야 하는 경우가 발생할 때 괄호 열기
                print(i,j)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                #왼쪽 위 
                divide(x,y,m//2)
                #왼쪽 아래
                divide(x,y+m//2,m//2)
                #오른쪽 위
                divide(x+m//2,y,m//2)
                #오른쪽 아래
                divide(x+m//2,y+m//2,m//2)

                # 4개의 type에 대해 압축이 끝났으면 괄호 닫기 
                return

   
   
 

divide(0,0,N)
