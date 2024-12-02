import java.util.*;
import java.util.stream.Collectors;

public class PRG_푸드파이트대회 {
    
    
    public String solution(int [] food){

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);

        for(int i = food.length-1; i>=1; i--){
            
            for(int j = 1; j<food[i]; j+=2){
                deque.addFirst(i);
                deque.add(i);
            }
            
        }

        return deque.stream().map(String :: valueOf).collect(Collectors.joining());

    }
    public static void main(String[] args) {

        PRG_푸드파이트대회 prg = new PRG_푸드파이트대회();

        System.out.println(prg.solution(new int [] {1,3,4,6}));
        
    }

}
