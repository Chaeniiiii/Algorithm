import java.util.*;

public class PRG_문자열내마음대로정렬하기 {

    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, new Comparator<String>() {
            
            @Override
            public int compare(String a, String b){
                if(a.charAt(n) == b.charAt(n)) return a.compareTo(b); //n번째 문자가 같으면 전체 문자열 비교 
                return a.charAt(n) - b.charAt(n);
            }
        });
        
        return strings;
    }

    public static void main(String[] args) {
        
        PRG_문자열내마음대로정렬하기 prg = new PRG_문자열내마음대로정렬하기();
        prg.solution(new String[]{"abce","abcd","cdx"},1);
    }

}