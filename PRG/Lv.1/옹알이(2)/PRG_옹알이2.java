import java.util.*;

public class PRG_옹알이2 {
    public int solution(String[] babbling) {
        
        int answer = babbling.length;
        
        Map<Character,String> map = new HashMap<>();
        map.put('a',"aya");
        map.put('y',"ye");
        map.put('w',"woo");
        map.put('m',"ma");
        
        for(String str : babbling){
            
            String newStr = str;
            String child;
            
            char st = newStr.charAt(0);
            char prev = ' ';
            
            while(newStr.length() > 0){
                
                st = newStr.charAt(0);
                
                if(st == prev || map.get(st) == null) {
                    answer --;
                    break;
                }
                
                child = map.get(st);
                if(newStr.length() < child.length()) {
                    answer--;
                    break;
                }
                
                if(!newStr.substring(0,child.length()).equals(child)){
                    answer --;
                    break;
                }
                
                newStr = newStr.substring(child.length());
                prev = st;
                
            }
            
        }
        
        return answer;
    }
}