import sys
from collections import Counter
import decimal

context = decimal.getcontext()
context.rounding = decimal.ROUND_HALF_UP

#산술 평균 구하는 함수 
def average(num):
    
    mean=(round(decimal.Decimal(sum(num)/len(num))))
    if mean==-0:
        return 0
    else:
        return mean

# 중앙값 구하는 함수
def median(num):
    num=sorted(num)
    
    index_num=len(num)
    return num[int((index_num-1)/2)]

# 최빈값 구하는 함수
def mode(num):
    mod=Counter(num)
    mod=mod.most_common()

    max_mod=mod[0][1]
    
    index_mod=[]
    for check in mod:
        if int(check[1])==max_mod:
            index_mod.append(check[0])
    index_mod=sorted(index_mod)
    

    if len(index_mod)!=1:
        return index_mod[1]
    else:
        return index_mod[0]

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
