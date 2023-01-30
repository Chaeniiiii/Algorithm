import sys

def lan_cut(N,lan,mini,maxi):
    cuting=[]
    while mini<=maxi  :
        count=0
        mid=(mini+maxi)//2 
        for i in lan:
            count+=i//mid
        if count<N:
            maxi=mid-1   
        else :
            mini=mid+1
            cuting.append(int(mid))
    return max(cuting)

K,N=map(int,sys.stdin.readline().split())
lan=[int(sys.stdin.readline()) for _ in range(K)]

max_lan=lan_cut(N,lan,1,(sum(lan)//K))
print(max_lan)