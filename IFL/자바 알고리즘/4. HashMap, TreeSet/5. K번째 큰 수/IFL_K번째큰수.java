import java.util.*;
import java.io.*;

public class IFL_K번째큰수 {

    private static final int SIZE = 3;

    private static int n;

    private static int [] number ;
    private static TreeSet<Integer> treeSet;

    private static boolean [] visited;

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        number = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++) number[i] = Integer.parseInt(st.nextToken());

        treeSet = new TreeSet<>(Collections.reverseOrder());
        visited = new boolean[n];

        dfs(0,0,0);

        List<Integer> list = new ArrayList<>(treeSet);

        System.out.println(list.size() < k  ? -1 : list.get(k-1));

    }

    private static void dfs(int start, int dep, int cnt){

        if(dep == SIZE){
            treeSet.add(cnt);
            return;
        }

        for(int i = start; i<n; i++){

            if(visited[i]) continue;

            visited[i] = true;
            dfs(i+1,dep+1,cnt+number[i]);
            visited[i] = false;

        }

    }

}