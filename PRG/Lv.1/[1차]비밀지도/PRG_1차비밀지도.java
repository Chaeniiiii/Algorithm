import java.util.*;

public class PRG_1차비밀지도 {
    
    private static char [] element = {' ','#'};
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String [] answer = new String[arr1.length];
        
        for(int i = 0; i<arr1.length; i++){
            
            answer[i] = decode(n,arr1[i]|arr2[i]);
            
        }
        
        return answer;
    }
    
    private static String decode(int n, int num){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = n-1; i>=0; i--){
           
            sb.append(element[(num>>i)&1]);
        }
        
        return sb.toString();
    }
}