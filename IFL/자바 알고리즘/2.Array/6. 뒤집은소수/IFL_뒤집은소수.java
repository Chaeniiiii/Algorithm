import java.util.*;
import java.io.*;

public class IFL_뒤집은소수 {

    //private static final int SIZE = 100000;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // int [] number = new int[SIZE + 1];
        // number[0] = number[1] = 1;

        // for(int i = 2; i<=SIZE; i++){
        //     if(number[i] == 1) continue;
        //     for(int j = i ; j<=SIZE; j+=i){
        //         if(j == i) continue;
        //         number[j] = 1;
        //     }
        // }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            
            String numStr = new StringBuilder(st.nextToken()).reverse().toString();
            int num = Integer.parseInt(numStr);

            if(isPrime(num)) sb.append(num).append(" ");
            //if(number[num] == 0) sb.append(num).append(" ");

        }

        System.out.println(sb.toString());
        
    }

    private static boolean isPrime(int num){

        if(num == 1) return false;
        for(int i = 2; i<num; i++){
            if(num % i == 0) return false;
        }

        return true;

    }
   

}