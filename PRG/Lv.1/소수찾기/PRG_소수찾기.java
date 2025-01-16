import java.util.*;

public class PRG_소수찾기 {
    
    public int solution(int n) {
        
        int cnt = n-1;
        
        for(int i = 2; i<=n; i++){
            for(int j = 2; j<= (int) Math.sqrt(i); j++){
                if(i % j == 0) {
                    cnt --;
                    break;
                }
            }            
        }
        
        return cnt;
    }
    
}