import java.util.*;
import java.io.*;

public class IFL_두배열합치기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); //배열의 크기 1
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine()); //배열의 크기 2
        int [] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) arr2[i] = Integer.parseInt(st.nextToken());

        int left = 0;
        int right = 0;

        while(left < n && right < m){
            if(arr[left] < arr2[right]) sb.append(arr[left++]).append(" ");
            else sb.append(arr2[right++]).append(" ");
        }

        
        while(left < n) {
            sb.append(arr[left++]).append(" ");
        }
        while(right < m) {
            sb.append(arr2[right++]).append(" ");
        }

        System.out.println(sb.toString());

    }

}