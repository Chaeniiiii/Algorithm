import java.util.*;

public class PRG_명예의전당1{

    public int[] solution(int k, int[] score) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int [] answer = new int[score.length];
        
        for(int i = 0; i<score.length; i++){
            
            pq.add(score[i]);
            if(pq.size() > k) pq.poll();
            
            answer[i] = pq.peek();
            
        }
        
        return answer;
    }
    
}