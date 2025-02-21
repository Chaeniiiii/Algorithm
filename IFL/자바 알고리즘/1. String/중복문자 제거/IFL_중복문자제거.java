import java.util.*;
import java.io.*;

public class IFL_중복문자제거 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<Character> set = new LinkedHashSet<>();
        String str = br.readLine();

        for(char c : str.toCharArray()){
            set.add(c);
        }

        for(char c : set) sb.append(c);

        /** indexOf() 사용하기
        for(int i = 0 ; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) sb.append(str.charAt(i));
        }
        */

        System.out.println(sb.toString());
    }

}