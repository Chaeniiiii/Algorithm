import sys

def tree_cut(N,M,tree):
 
    maxi=max(tree)
    mini=0
    
    cuting=[]


    while mini<=maxi:
        cut=0
        length= (mini+maxi)//2
        
        for i in tree:
            if i>=length:
                cut+=(i-length)
        
        if cut < M:
            maxi=length-1
        else:
            mini=length+1
            
    return length

N,M=map(int,sys.stdin.readline().split())
tree = list(map(int, sys.stdin.readline().split()))

leng=tree_cut(N,M,tree)
print(leng)