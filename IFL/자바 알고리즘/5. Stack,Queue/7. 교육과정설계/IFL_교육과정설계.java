import java.util.*;
import java.io.*;

public class IFL_교육과정설계 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String lecture = br.readLine();

        Deque<Character> deque = new ArrayDeque<>();
        for(char c : str.toCharArray()) deque.add(c);

        for(char c : lecture.toCharArray()){
            if(deque.contains(c)){
                if(deque.peek() != c) {
                    System.out.println("NO");
                    return;
                }
                deque.poll();
            }
        }

        if(deque.isEmpty()){
            System.out.println("YES");
        }
        else System.out.println("NO");

    }

}