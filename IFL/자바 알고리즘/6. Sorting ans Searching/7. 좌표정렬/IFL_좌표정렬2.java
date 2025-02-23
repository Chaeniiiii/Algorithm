import java.util.*;
import java.io.*;

public class IFL_좌표정렬2 {

    private static class Pos implements Comparable<Pos>{

        int x;
        int y;

        private Pos(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pos other){
            if(this.x == other.x) return this.y - other.y;
            return this.x - other.x;
        }

    }

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<Pos> pos = new ArrayList<>();

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            pos.add(new Pos(a,b));

        }

        Collections.sort(pos);

        for(Pos p : pos){
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }

        System.out.println(sb.toString());

    }

}