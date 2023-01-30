def binary_search(s_num,first,min,max):

    mid=int((min+max)/2)

    if min<=max:
        if first[mid]==s_num:
            print(1)        
        elif s_num<first[mid]:
            binary_search(s_num,first,min,mid-1)
        elif s_num>first[mid]:
            binary_search(s_num,first,mid+1,max)
    else:
        print(0)
            

import sys

N=int(input())
first=sorted(list(map(int,sys.stdin.readline().split())))

M=int(input())
second=list(map(int,sys.stdin.readline().split()))

min=0
max=len(first)-1
for s_num in second:
    binary_search(s_num,first,min,max)


