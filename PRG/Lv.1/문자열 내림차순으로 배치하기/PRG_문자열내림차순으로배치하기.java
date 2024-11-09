import java.util.*;

public class PRG_문자열내림차순으로배치하기 {
    
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();

        String [] c = s.split("");
        Arrays.sort(c,Collections.reverseOrder());
        
        for(String cc : c) sb.append(cc);
        
        return sb.toString();
    }

    public static void main(String[] args) {
        
        PRG_문자열내림차순으로배치하기 s = new PRG_문자열내림차순으로배치하기();
        System.out.println(s.solution("Zbcdefg"));

    }
}