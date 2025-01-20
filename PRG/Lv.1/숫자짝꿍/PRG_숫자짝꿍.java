import java.util.*;

public class PRG_숫자짝꿍 {
    
    public String solution(String X, String Y) {
        
        StringBuilder sb = new StringBuilder();
        
        int [] numX = num(X,new int [10]);
        int [] numY = num(Y,new int [10]);
        
        for(int i = 9; i>=0; i--){
            
            for(int j = 1; j<= Math.min(numX[i],numY[i]); j++) sb.append(i);
            
        }

        String answer = sb.toString();
        
        return answer.equals("") ? "-1" : answer.charAt(0) == '0' ? "0" : answer;

        
    }
    
    private static int [] num(String n, int [] arr){
        
        for(char c : n.toCharArray()){
            
            int numC = (int)(c-'0');
            
            arr[numC] ++;
            
        }
        
        return arr;
        
    }
    
}