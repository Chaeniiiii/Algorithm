import java.util.*;
import java.io.*;

public class IFL_피보나치수열 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        int [] number = new int[n];
        number[0]= number[1] = 1;
        sb.append(number[0]).append(" ").append(number[1]).append(" ");

        for(int i = 2; i<n; i++){
            number[i] = number[i-1] + number[i-2];
            sb.append(number[i]).append(" ");
        }

        System.out.println(sb.toString());

    }

   

}