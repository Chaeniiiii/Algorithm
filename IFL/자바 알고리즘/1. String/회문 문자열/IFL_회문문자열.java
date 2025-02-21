import java.util.*;
import java.io.*;

public class IFL_회문문자열 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){

            if(str.charAt(lt) != str.charAt(rt)){
                System.out.println("NO");
                return;
            }

            lt++;
            rt--;

        }

        System.out.println("YES");

        
    }

}