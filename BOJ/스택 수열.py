import sys

N=int(input())

make_stc=[] # 입력된 수열 만들 리스트
stc=[] #입력된 수열 

for i in range(N):
    stc.append(sys.stdin.readline().strip())

while len(stc)!=len(make_stc):
    for i in range(N):
        if stc.index(stc[i]) != str(N-1) and stc[i]==str(N):
            print("안됨")
            poin=stc.index(stc[i])
            for j in stc[poin+1:N]:
                j=int(j)
                if (j+1)-j == 1:
                    print("NO")
                    
                    break
                
    for p in range(N):
        for k in range(1,N+1):
            print("k는 {} i는 {}".format(k,stc[p]))
            if str(k)<=stc[p]:
                print("+")
                make_stc.append(k)
            else:
                print("-")
                make_stc.pop()
                

