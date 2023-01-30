import sys

def judgment(B,block):
    if B==0:
        adj=min(map(min,block))
        sub_build(col,row,B,adj,block)
        
    else:
        adj=max(map(max,block)) 
        add_build(col,row,B,adj,block)

def sub_build(col,row,B,adj,block):
    cnt=0

    for i in range(0,col):
        for j in range(0,row):
            blc=block[i][j]
            if blc != adj:
                cnt+=(blc-adj)
                blc==adj
            else:
                blc==adj
        
        time=cnt*2

    print(time,adj)

def add_build(col,row,B,adj,block):
    cnt = 0
    for i in range(0,col):
        for j in range(0,row):
            blc=block[i][j]
            cnt+=(adj-blc)
    if cnt <= B:
        print(cnt, adj)
        
    else:
        mid_find=sum(block,[])

        mix_build(mid_find)
        
             
def mix_build(mid_find):
    min = 0
    max=len(mid_find)
    stc_cnt=0
    pop_cnt=0
        

    while True:
        adj=mid_find[(min+max)//2]
            
        for i in range(0,col):
            for j in range(0,row):
                blc=block[i][j]
                if blc < adj:
                    stc_cnt+=(adj-blc)
                elif blc>adj:
                    pop_cnt+=(blc-adj)
                else:
                    blc==adj
        sum=(pop_cnt+stc_cnt)                    

        if sum < B:
                min+=1
        elif sum >B:
                max-=1
        else:
            print(pop_cnt*2+stc_cnt,adj)
            break

    print(pop_cnt*2+stc_cnt,adj)    

col,row,B=(map(int,sys.stdin.readline().split()))
block= [list(map(int,sys.stdin.readline().split()))for _ in range(col)]

judgment(B,block)