import java.util.*;
import java.io.*;

public class IFL_중복확인 {

    public static void main(String [] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) set.add(Integer.parseInt(st.nextToken()));

        System.out.println(set.size() == n ? 'U' : 'D');

    }

}