import java.util.*;

public class PRG_시저암호 {
    public String solution(String s, int n) {
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()){
            char ch = (char) (c + n);
            
            if(Character.isUpperCase(c) && ch > 'Z') ch = (char) (ch - 'Z' + 'A'-1);
            else if(Character.isLowerCase(c) && ch > 'z') ch = (char) (ch - 'z' + 'a'-1);
            else if (c == ' ') ch = c;
            
            sb.append(ch);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        PRG_시저암호 prg = new PRG_시저암호();
        prg.solution("AB", 1);
    }
}