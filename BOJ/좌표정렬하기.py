#백준 11650번

# dict 사용하려고 했지만 
# dict은 중복된 key값을 가질 수 없어서 이 방법으론 해결 못함 

import sys

N=int(input())
number=[]
for i in range(N):
    M,K=map(str,sys.stdin.readline().split())
    number[f"{M}"]=f"{K}"


number=sorted(number.items())
print(type(number))