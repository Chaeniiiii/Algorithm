import java.util.*;

public class PRG_크기가작은부분문자열{

    public int solution(String t, String p) {
        int answer = 0;
        
        long b = Long.parseLong(p);
        
        for(int i = 0; i<=t.length()-p.length(); i++){
            
            long a = Long.parseLong(t.substring(i,i+p.length()));
            
            if(a <= b) answer++;
            
        }
    
        return answer;
    }

    public static void main(String[] args) {
        
        PRG_크기가작은부분문자열 prg = new PRG_크기가작은부분문자열();
        prg.solution("500220839878", "7");
    }
    
    
}