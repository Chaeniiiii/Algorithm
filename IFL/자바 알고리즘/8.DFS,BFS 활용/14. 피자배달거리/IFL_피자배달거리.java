import java.util.*;
import java.io.*;

public class IFL_피자배달거리 {

    private static int n,m,min;

    private static ArrayList<Pos> pizza;
    private static ArrayList<Pos> home;

    private static boolean [] visited;

    private static class Pos {
        int x;
        int y;
        private Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        pizza = new ArrayList<>();
        home = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=n; j++){
                int typ = Integer.parseInt(st.nextToken());
                if(typ == 1) home.add(new Pos(i,j));
                else if(typ == 2) pizza.add(new Pos(i,j));
            }
        }

        min = Integer.MAX_VALUE;
        visited = new boolean[pizza.size()];

        dfs(0, new ArrayList<>());
        System.out.println(min);

    }

    private static void dfs(int start, ArrayList<Pos> select){

        if(select.size() == m){
            
            int [] dist = new int[home.size()];
            Arrays.fill(dist,Integer.MAX_VALUE);

            for(int i = 0; i<home.size(); i++){
                Pos now = home.get(i);
                for(Pos pos : select){
                    int newDist = Math.abs(pos.x - now.x) + Math.abs(pos.y - now.y);
                    dist[i] = Math.min(dist[i],newDist);
                }
            }

            int cnt = 0;
            for(int i : dist) cnt += i;

            min = Math.min(min,cnt);

            return;
        }

        for(int i = start; i<pizza.size(); i++){

            if(visited[i]) continue;

            Pos mv = pizza.get(i);

            visited[i] = true;
            select.add(mv);

            dfs(i+1, select);

            visited[i] = false;
            select.remove(mv);

        }

    }

}
