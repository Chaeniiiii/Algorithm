import java.util.*;
import java.io.*;

public class IFL_문자열압축 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();

        char now = str.charAt(0);
        int cnt = 1;
        
        for(int i = 1; i<str.length(); i++){
            char nxt = str.charAt(i);
            if(now == nxt) cnt ++;
            else {
                sb.append(now).append(cnt == 1 ? "" : cnt);
                now = nxt;
                cnt = 1;
            }
        }   
        
        sb.append(now).append(cnt == 1 ? "" : cnt);
        
        System.out.println(sb.toString());

    }

}