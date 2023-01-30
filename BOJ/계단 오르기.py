import sys

N=int(sys.stdin.readline())

score=[0]*(N)
max_score=[0]*(N)

for i in range(N):
    score[i]=int(sys.stdin.readline()) 

if N==1:
    print(score[0])
elif N==2:
    print(max(score[0]+score[1],score[1]))
else:
    max_score[0]=score[0]
    max_score[1]=max(max_score[0]+score[1],score[1])
    max_score[2]=max(max_score[0]+score[2],score[1]+score[2])

    for j in range(3,N):
        max_score[j]=max(max_score[j-3]+score[j-1],max_score[j-2])+score[j]
    print(max_score[-1])