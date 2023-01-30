'''
sort() => 리스트를 정렬된 상태로 바꿔주는 것
sorted()  => 정렬된 새로운 리스트를 생성해주는 것 

'''
import sys

N=int(input())
number=[]
for i in range(N):
    m,k=map(int,sys.stdin.readline().split())
    number.append([m,k])

number.sort(key=lambda x: (x[0],x[1]))

for i in range(N):
    print(number[i][0], number[i][1])