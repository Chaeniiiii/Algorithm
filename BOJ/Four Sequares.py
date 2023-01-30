import math

def judge(N,sqr):
    count=[]
    cnt=1
    for i in range(int(sqr),int(sqr)//2,-1):
        
        num=N-i**2 
        sqr2= math.sqrt(num) 
        
        
        for j in range(int(sqr2),int(int(sqr2)//2),-1):
            num2= num-j**2 
            
            if num2==0:
                count.append(2)
                
                break
            else:
                sqr3=math.sqrt(num2)
                for k in range(int(sqr3),int(int(sqr3)//2),-1):
                    num3=num2-k**2
                    
                    if num3==0:
                        count.append(3)
                        break
                    else:
                        count.append(4)
                        
                        
    print(min(count))
                          
N=int(input()) 

if int(math.sqrt(N))**2==N:
    print(1)
else:
    sqr=math.sqrt(N)
    judge(N,sqr)

