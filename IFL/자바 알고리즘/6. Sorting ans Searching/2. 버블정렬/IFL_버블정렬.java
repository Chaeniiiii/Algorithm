import java.util.*;
import java.io.*;

public class IFL_버블정렬 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int [] num = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        //"큰 값이 뒤로 밀려간다! 가 핵심" 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
            
        }

        for(int i : num) sb.append(i).append(" ");
        System.out.println(sb.toString());

    }

}
