import java.util.*;
import java.io.*;

public class IFL_큰수출력하기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());

        sb.append(arr[0]).append(" ");
        
        for(int i = 1; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i-1] < arr[i]) sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString());

    }

}