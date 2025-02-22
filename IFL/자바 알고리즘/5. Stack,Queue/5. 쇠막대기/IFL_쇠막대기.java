import java.util.*;
import java.io.*;

public class IFL_쇠막대기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Deque<Character> deque = new ArrayDeque<>();
        int cnt = 0;

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if( c == '(') deque.add('(');
            else {

                deque.pollLast();
                if(str.charAt(i-1) == '(') cnt += deque.size();
                else cnt ++;

            }
        }

        System.out.println(cnt);

    }

}