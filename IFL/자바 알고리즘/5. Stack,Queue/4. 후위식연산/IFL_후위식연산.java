import java.util.*;
import java.io.*;

public class IFL_후위식연산 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Deque<Integer> deque = new ArrayDeque<>();

        for(char c : str.toCharArray()){

            int num = c - '0';

            if( num > 0 && num < 10) deque.add(num);
            else{
                
                int back = deque.pollLast();
                int frt = deque.pollLast();

                switch(c){
                    case '+' : 
                        deque.add(frt + back);
                        break;
                    case '-' :
                        deque.add(frt - back);
                        break;
                    case '*' :
                        deque.add(frt * back);
                        break;
                    case '/' :
                        deque.add(frt / back);
                        break;

                }

            }

        }

        System.out.println(deque.poll());
    }

}