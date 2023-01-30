import sys
from collections import Counter

#산술 평균 구하는 함수 
def average(num):
    
    mean=round(sum(num)/len(num))
    return mean

# 중앙값 구하는 함수
def median(num):
    num=sorted(num)
    
    index_num=len(num)
    return num[int((index_num-1)/2)]

# 최빈값 구하는 함수
def mode(num):
    mod=Counter(num)
    mod=max(mod,key=mod.get)
    return mod

#범위 구하는 함수
def num_range(num):
    return max(num)-min(num)
N=int(input())
number=[]
for i in range(0,N):
    number.append(int(sys.stdin.readline().strip()))

mean= average(number)
mid= median(number)
mod=mode(number)
ran=num_range(number)

print(mean,mid,mod,ran,sep="\n")
