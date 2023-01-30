import sys
N=int(input())

number=[0]*10001

for i in range(N):
    num=int(sys.stdin.readline())
    number[num]=number[num]+1

for j in range(len(number)):
    while number[j]!=0:
        print(j)
        number[j]=number[j]-1