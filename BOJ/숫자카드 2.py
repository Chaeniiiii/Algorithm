import sys 
from bisect import bisect_left, bisect_right

def binary_search(sang,left_num,right_num):

    count=bisect_right(sang,right_num)-bisect_left(sang,left_num)
    print(count,end=' ')

N=int(input())
sang=sorted(sys.stdin.readline().split())

M=int(input())
card=sys.stdin.readline().split()

for i in range(0,len(card)):
    number=card[i]
    binary_search(sang,number,number)
    