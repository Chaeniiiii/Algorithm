import java.util.*;

public class PRG_가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        
        int [] str = new int[26];
        Arrays.fill(str,-1);
        
        for(int i = 0; i<s.length(); i++){
            int idx= (int) (s.charAt(i) - 'a');
            if(str[idx] == -1){
                answer[i] = -1;
            }
            else{
                answer[i] = i - str[idx];
            }
            str[idx] = i;
        }
        
        return answer;
    }
}
