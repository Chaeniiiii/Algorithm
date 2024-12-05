import java.util.*;
import java.io.*;

public class PRG_1차다트게임 {
    
    static class Num{
        
        double n;
        int sub = 0;
        int pow = 0;
        
        public Num(double i){
            this.n = i; 
        }
        
    }
    
    public int solution(String dartResult) {
        
        int answer = 0;
    
        ArrayList<Num> number = new ArrayList<>();
        
        String str = "";
            
        for(char c : dartResult.toCharArray()){
            
            if(c == 'S' || c == 'D' || c == 'T'){
                
                Num num = new Num(Integer.parseInt(str));
                
                if(c == 'D') num.n = Math.pow(num.n,2);
                else if(c == 'T') num.n = Math.pow(num.n,3);
                
                number.add(num);
                
                str = "";
                
            }
            
            else if(c == '*' || c == '#'){
                
                if(c == '*'){
                    number.get(number.size()-1).pow ++;
                    if(number.size() >= 2) number.get(number.size()-2).pow ++;
                }
                else {
                    number.get(number.size()-1).sub ++;
                }
                    
            }
            
            else str+=c;
        
        }
            
        for(Num num : number){
            
            int cnt = 1;
            
            for(int i = 0 ; i<num.pow; i++) cnt*=2;
            for(int i = 0 ; i<num.sub; i++) cnt*=(-1);
            
            answer += (int) num.n * cnt;
            
        }
    
        return answer;
    }

}