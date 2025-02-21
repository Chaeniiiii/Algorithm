import java.util.*;
import java.io.*;

public class IFL_단어뒤집기 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<n; i++){
            
            String str = br.readLine();
            String tmp = new StringBuilder(str).reverse().toString();
            
            // for(int j = str.length()-1; j>=0; j--){
            //     sb.append(str.charAt(j));
            // }
            sb.append(tmp).append("\n");
            //sb.append("\n");
        }

        System.out.println(sb.toString());

    }

}