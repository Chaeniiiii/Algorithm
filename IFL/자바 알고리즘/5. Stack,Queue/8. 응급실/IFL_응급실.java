import java.util.*;
import java.io.*;

public class IFL_응급실 {

    private static class Patient{

        int idx;
        int dgr;

        private Patient(int idx, int dgr){
            this.idx = idx;
            this.dgr = dgr;
        }

    }

    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Patient [] danger = new Patient[n];
        Deque<Patient> deque = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i<n; i++) {
            
            int d = Integer.parseInt(st.nextToken());
            Patient pt = new Patient(i,d);

            danger[i] = pt;
            deque.add(pt);

        }

        Arrays.sort(danger,(a,b) -> {
            if(b.dgr == a.dgr) return a.idx - b.idx;
            return b.dgr - a.dgr;
        }); //  Arrays.sort(danger,(a,b) -> b.dgr - a.dgr)

        int nowIdx = 0;
        int cnt = 0;

        while(!deque.isEmpty()){
            
            Patient first = deque.poll();

            // System.out.println("====================");
            // System.out.printf("%d %d %d\n",nowIdx,danger[nowIdx].idx,danger[nowIdx].dgr);
            // System.out.printf("%d %d \n",first.idx,first.dgr);

            if(first.dgr == danger[nowIdx].idx){ //if(first.dgr == danger[nowIdx].dgr)
                cnt ++;
                if(first.idx == m){
                    System.out.println(cnt);
                    return;
                }
            }
            else{
                deque.add(first);
            }
            
        }
        
        System.out.println(cnt);

    }

}

/**
 * 반례
 * 6 1
 * 60 70 80 70 90 60
 * 나보다 높은 위험도를 가진 환자가 있을 경우에만 치료를 받지 못하는 것 !
 * 57번쨰줄로 인해 오답 ! 
*/