import java.util.*;
import java.io.*;

public class IFL_연속된자연수의합 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0, lt = 1, answer = 0;
        for(int rt = 1; rt <n; rt ++){

            cnt += rt;

            if(cnt == n) answer ++;
            if(cnt > n){

                while(cnt >= n){
                    cnt -= (lt++);
                    if(cnt == n) answer ++;
                }

            }

        }

        System.out.println(answer);

    }

}