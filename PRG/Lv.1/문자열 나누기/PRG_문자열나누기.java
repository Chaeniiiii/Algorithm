import java.util.*;

public class PRG_문자열나누기 {
    
    public int solution(String s) {
        
        int cnt = 0;
        
        char first = s.charAt(0);
        
        int a = 1;
        int b = 0;
        
        for(int i = 1; i<s.length(); i++){
            
            if(first == s.charAt(i)) a++;
            else b++;
            
            if(a == b) {
                cnt ++;
                if(i < s.length()-1) first = s.charAt(i+1);  
                a = 0;
                b = 0; 
                continue;
            }
        }
        
        if(a != 0 || b != 0) cnt++;
        return cnt;
        
    }
}