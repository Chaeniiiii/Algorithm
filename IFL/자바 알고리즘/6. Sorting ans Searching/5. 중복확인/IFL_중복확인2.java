import java.util.*;
import java.io.*;

public class IFL_중복확인2 {

    public static void main(String [] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int n = Integer.parseInt(br.readLine());

        int [] num = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) num[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(num);

        for(int i = 0; i<n-1; i++){
            if(num[i] == num[i+1]){
                System.out.println('D');
                return;
            }
        }

        System.out.println('U');

    }

}