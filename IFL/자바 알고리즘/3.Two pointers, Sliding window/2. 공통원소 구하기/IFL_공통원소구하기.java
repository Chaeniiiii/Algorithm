import java.util.*;
import java.io.*;

public class IFL_공통원소구하기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); //배열의 크기 1
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine()); //배열의 크기 2
        Integer [] arr2 = new Integer[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++) arr2[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int left = 0;
        int right = 0;

        while(left < n && right < m){

            if(arr[left] < arr2[right]) left ++;
            else if (arr[left] == arr2[right]){
                sb.append(arr[left++]).append(" ");
                right ++;
            }
            else right ++;
        }
        System.out.println(sb.toString());
    }

}