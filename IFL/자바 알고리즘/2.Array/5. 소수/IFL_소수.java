import java.util.*;
import java.io.*;

public class IFL_소수 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int [] number = new int[n+1];
        int cnt = 0;

        for(int i = 2; i<=n; i++){
            if(number[i] == 1) continue;

            for(int j = i; j<=n; j+=i) number[j] = 1;
            cnt ++;

        }

        System.out.println(cnt);

    }

   

}