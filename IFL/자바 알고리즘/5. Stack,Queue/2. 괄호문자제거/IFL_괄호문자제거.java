import java.util.*;
import java.io.*;

public class IFL_괄호문자제거 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()){

            if(c == '(') deque.add('(');
            else if(c == ')') deque.pollLast();

            if(Character.isLetter(c) && deque.isEmpty()) sb.append(c);

        }

        System.out.println(sb.toString());

    }

}
