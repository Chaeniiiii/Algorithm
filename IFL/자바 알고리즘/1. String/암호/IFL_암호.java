import java.util.*;
import java.io.*;

public class IFL_암호 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for(int i = 0 ; i<n; i++){
            
            String number = "";
            
            for(int j = 0; j<7; j++){
                char c = str.charAt(j);
                if(c == '#') number += "1";
                else number += "0";
            }

            int decimal = Integer.parseInt(number,2);
            sb.append((char)(decimal));

            str = str.substring(7);

        }

        System.out.println(sb.toString());

    }

}