import java.util.*;
import java.io.*;

public class IFL_가위바위보 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            int b = Integer.parseInt(st.nextToken());
            System.out.println(rsp(a[i],b));
        }

    }

    private static char rsp(int a, int b){

        if(a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) return 'A';
        else if (a == 1 && b == 1 || a == 2 && b == 2 || a == 3 && b == 3) return 'D';
        else return 'B';

    }

}