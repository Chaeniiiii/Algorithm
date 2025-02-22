import java.util.*;
import java.io.*;

public class IFL_올바른괄호 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()){
            if(c == '(') deque.add('(');
            else{
                if(!deque.isEmpty()) deque.pollLast();
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if(!deque.isEmpty()) System.out.println("NO");
        else System.out.println("YES");
        

    }

}