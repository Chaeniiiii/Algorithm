public class PRG_콜라문제 {
    public int solution(int a, int b, int n) {

        int cnt = 0;
        
        while(n >= a){
            
            cnt += (n/a)*b;
            n = (n%a) + (n/a)*b;
            
        }
        
        return cnt;
    }
}