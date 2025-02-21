import java.util.*;
import java.io.*;

public class IFL_대소문자변환{

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        for(char c : str.toCharArray()){

            int cInt = c - 'a';

            if(cInt >=0 && cInt <=26) sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));

        }

        System.out.println(sb.toString());

    }

}
