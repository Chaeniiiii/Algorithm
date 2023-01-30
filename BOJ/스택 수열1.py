import sys

def stack_ary(stc,N):
    count=1
    ary=[]
    for num in stc:
        while count <= num:
            ary.append("+")
            make_stc.append(count)
            count+=1
       
        if num==make_stc[-1]:
            ary.append("-")
            make_stc.pop()
        elif num != make_stc[-1]: 
            return "No"
    return ary


    
N=int(input())

make_stc=[] 
stc=[int(sys.stdin.readline()) for _ in range(N)]

check=stack_ary(stc,N)

if check == "No":
    print("NO")
else:
    print(*check,sep="\n")

