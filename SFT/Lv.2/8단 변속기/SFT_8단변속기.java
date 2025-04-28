import java.io.*;
import java.util.*;

public class SFT_8단변속기 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] number = br.readLine().split(" ");

        String result = "";
        if(number[0].equals("1")) result = "ascending";
        else if(number[0].equals("8")) result = "descending";
        else{
            System.out.println("mixed");
            return;
        }
        
        for(int i = 1; i<number.length; i++){

            if(Math.abs(Integer.parseInt(number[i]) - Integer.parseInt(number[i-1])) != 1 ) {
                System.out.println("mixed");
                return;
            }
            
        }

        System.out.println(result);
        
    }
}
