import java.util.*;
import java.io.*;

public class IFL_숫자만추출 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine().replaceAll("[^0-9]","");
        int answer = Integer.parseInt(str);

        System.out.println(answer);

    }

}