import sys

def tile(N):
    t=[0]*(N+2)
    t[0],t[1],t[2]=0,1,2

    if N==0:
        return t[0]
    elif N==1:
        return t[1]
    elif N==2:
        return t[2]
    else:
        for i in range(3,N+1):
            t[i]=t[i-1]+t[i-2]
    
        return t[N]

N=int(sys.stdin.readline())

tiling=tile(N)
print(tiling%10007)