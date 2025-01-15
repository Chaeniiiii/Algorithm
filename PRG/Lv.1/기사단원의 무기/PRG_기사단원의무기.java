import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        
        int [] emt = new int[number+1];
        
        for(int i = 1; i<=number; i++){
            for(int j = 1; j<=(int)Math.sqrt(i); j++){
                if(i % j == 0) emt[i]+=2;
                if(j*j == i) emt[i]--;
            }
        }
        
        int cnt = 0;
        
        for(int i = 1; i<=number; i++){
            if(emt[i]>limit) cnt += power;
            else cnt += emt[i];
        }
        
        return cnt;
        
    }
}