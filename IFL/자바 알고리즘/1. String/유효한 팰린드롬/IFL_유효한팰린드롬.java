import java.util.*;
import java.io.*;

public class IFL_유효한팰린드롬 {

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt){

            if(!Character.isLetter(str.charAt(lt))) lt ++;
            else if (!Character.isLetter(str.charAt(rt))) rt --;
            else{
                if(str.charAt(rt) != str.charAt(lt)){
                    System.out.println("NO");
                    return;
                }
                lt ++;
                rt --;
            }
        }

        System.out.println("YES");

    }

}